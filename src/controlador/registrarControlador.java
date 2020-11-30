package controlador;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAOFactory;
import dao.UsuarioDAO;
import modelo.Empresa;
import modelo.Usuario;

/**
 * Servlet implementation class Login
 */
@WebServlet("/registrarControlador")
public class registrarControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registrarControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html:charset=UTF-8");

		UsuarioDAO usuarioDao = DAOFactory.getFactory().getUsuarioDAO();
		String producto = "";
		String url = null;
		//producto es el textfield de ingreso
		
		//accion es el name del boton
		Object accion = request.getParameter("botonRegistrar");
		HttpSession sesion = request.getSession(true);

		sesion.setAttribute("accesos", sesion.getId());
		System.out.println("ID sesion: " + String.valueOf(sesion.getId()));
		System.out.println(accion);
		
		//registar es el value del boton
		if (accion.equals("registrar")) {
			try {
				producto = request.getParameter("producto");
				usuarioDao.actualizarRequerimiento(producto);
				url="JSPs/Usuario.jsp";
			} catch (Exception e) {
				url="JSPs/InicioSesion.jsp";
				System.out.println("Error en el login: " + e.getMessage());
			}
			request.getRequestDispatcher(url).forward(request, response);
			
		}
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
