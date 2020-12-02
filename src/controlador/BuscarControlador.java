package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAOFactory;
import dao.UsuarioDAO;
import modelo.Categoria;
import modelo.Producto;
import mysql.jdbc.JDBCUsuarioDAO;

/**
 * Servlet implementation class Login
 */
@WebServlet("/BuscarControlador")
public class BuscarControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarControlador() {
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
				if (nuevo.rol.equals("A")) {
					url="JSPs/BuscarAdmin.jsp";
				}else if(nuevo.rol.equals("U")){
					url="JSPs/Buscar.jsp";
				}
			} catch (Exception e) {
				url="JSPs/Buscar.jsp";
				System.out.println("Error en el login: " + e.getMessage());
			}
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
		String busqueda = "";
		String url = null;

		Object accion = request.getParameter("botonBuscar");
		List<Producto> pr = new ArrayList<Producto>();
		List<Categoria> cat = new ArrayList<Categoria>();
		HttpSession sesion = request.getSession(true);

		sesion.setAttribute("accesos", sesion.getId());
		System.out.println("ID sesion: " + String.valueOf(sesion.getId()));
		
		if (accion.equals("buscar")) {
			try {
				busqueda = request.getParameter("buscar");
				pr = usuarioDao.buscarProductos0(busqueda);
				request.setAttribute("productos", pr);
				cat = usuarioDao.buscarProductos1(busqueda);
				request.setAttribute("categorias", cat);
				JDBCUsuarioDAO nuevo = new JDBCUsuarioDAO();
				if (nuevo.rol.equals("A")) {
					url="JSPs/BuscarAdmin.jsp";
				}else if(nuevo.rol.equals("U")){
					url="JSPs/Buscar.jsp";
				}
			} catch (Exception e) {
				url="JSPs/Buscar.jsp";
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
