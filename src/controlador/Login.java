package controlador;

import java.io.Console;
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
import modelo.Usuario;

/**
 * Servlet implementation class Login
 */
@WebServlet(name = "Login", urlPatterns = "/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		System.out.println("Entro");

		UsuarioDAO usuarioDao = DAOFactory.getFactory().getUsuarioDAO();
		String correo = "";
		String clave = "";
		String url = null;
		int i = 0;

		String accion = request.getParameter("action");
		Usuario user = new Usuario();
		HttpSession sesion = request.getSession(true);

		sesion.setAttribute("accesos", sesion.getId());
		System.out.println("ID sesion: " + String.valueOf(sesion.getId()));
		
		if (accion.equals("Login")) {
			correo = request.getParameter("correo");
			clave = request.getParameter("clave");
			user = usuarioDao.buscar(correo, clave);
			System.out.println("retorno de usuario: "+ usuarioDao.buscar(correo, clave));
			url="/JSPs/Usuario.jsp";
			try {
				if (user != null) {
					request.setAttribute("usuario", user);
					getServletContext().getRequestDispatcher(url).forward(request, response);
				} 
			} catch (Exception e) {
				System.out.println("Error en el login: " + e.getMessage());
			}
		}else {
			getServletContext().getRequestDispatcher("/JSPs/InicioSesion.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
