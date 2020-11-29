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


@WebServlet(name = "Login", urlPatterns = { "/InicioSesion.jsp" })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Login() {
        super();

    }

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html:charset=UTF-8");
		System.out.println("Entro");

		UsuarioDAO usuarioDao = DAOFactory.getFactory().getUsuarioDAO();
		String correo = "";
		String clave = "";

		String accion = request.getParameter("action");
		Usuario user = new Usuario();
		HttpSession sesion = request.getSession(true);

		sesion.setAttribute("accesos", sesion.getId());
		System.out.println("ID sesion: " + String.valueOf(sesion.getId()));
		
		if (accion.equals("action")) {
			correo = request.getParameter("correo");
			clave = request.getParameter("clave");
			user = usuarioDao.buscar(correo, clave);
			System.out.println("retorno de usuario: "+ usuarioDao.buscar(correo, clave));

		}
		try {
			if (user != null) {
				
				request.setAttribute("usuario", user);
				getServletContext().getRequestDispatcher("/JSPs/Usuario.jsp").forward(request, response);
			
			} else {

				getServletContext().getRequestDispatcher("/JSPs/InicioSesion.jsp").forward(request, response);
			}

		}catch (Exception e) {
			System.out.println(">>>ERROR:IniciarSesion:DOPOST "+e.getMessage());
		}
		
	}

}
