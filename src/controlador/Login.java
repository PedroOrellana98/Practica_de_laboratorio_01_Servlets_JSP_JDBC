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
import mysql.jdbc.JDBCUsuarioDAO;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
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
		response.setContentType("text/html:charset=UTF-8");
		String url = null;

		HttpSession sesion = request.getSession(true);

		sesion.setAttribute("accesos", sesion.getId());
		
			try {
				JDBCUsuarioDAO nuevo = new JDBCUsuarioDAO();
				if(nuevo.id == null){
					url="JSPs/InicioSesion.jsp";
				}else {
					if (nuevo.rol.equals("A")) {
						sesion.setAttribute("accesos", 1);
						url="JSPs/Admin.jsp";
					}else if(nuevo.rol.equals("U")){
						sesion.setAttribute("accesos", 1);
						url="JSPs/Usuario.jsp";
					}
				}
			} catch (Exception e) {
				url="JSPs/InicioSesion.jsp";
				System.out.println("Error en el login: " + e.getMessage());
			}
			System.out.println(url);
			request.getRequestDispatcher(url).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html:charset=UTF-8");

		UsuarioDAO usuarioDao = DAOFactory.getFactory().getUsuarioDAO();
		String correo = "";
		String clave = "";
		String url = null;

		Object accion = request.getParameter("action");
		Usuario user = new Usuario();
		Empresa emp = new Empresa();
		HttpSession sesion = request.getSession(true);
		
		if (accion.equals("login")) {
			try {
				correo = request.getParameter("correo");
				clave = request.getParameter("clave");
				user = usuarioDao.buscar(correo, clave);
				request.setAttribute("usuario", user);
				emp = usuarioDao.buscarEmpresa();
				
				JDBCUsuarioDAO nuevo = new JDBCUsuarioDAO();
				if(nuevo.id == null){
					
					url="JSPs/InicioSesion.jsp";
				}else {
					if (nuevo.rol.equals("A")) {
						sesion.setAttribute("accesos", 1);
						url="JSPs/Admin.jsp";
					}else if(nuevo.rol.equals("U")){
						sesion.setAttribute("accesos", 1);
						url="JSPs/Usuario.jsp";
					}
				}	
				
			} catch (Exception e) {
				url="JSPs/InicioSesion.jsp";
				System.out.println("Error en el login: " + e.getMessage());
			}
			System.out.println(url);
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
