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
import modelo.Producto;
import mysql.jdbc.JDBCUsuarioDAO;


/**
 * Servlet implementation class Usuario
 */
@WebServlet("/ListarProductoControlador")
public class ListarProductoControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarProductoControlador() {
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
	 * @see Servlet#destroy()
	 */
	public void destroy() {
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
					url="JSPs/ListarAdmin.jsp";
				}else if(nuevo.rol.equals("U")){
					url="JSPs/Listar.jsp";
				}
			} catch (Exception e) {
				url="JSPs/Listar.jsp";
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
		String url = null;
		
		//RequerimientosDAO requerimientoDAO = DAOFactory.getFactory().getRequerimientoDAO();
		UsuarioDAO usuarioDao = DAOFactory.getFactory().getUsuarioDAO();
		Object mostrar = request.getParameter("mostrarPrincipalLista");
		List<Producto> pr = new ArrayList<Producto>();
		HttpSession sesion = request.getSession(true);

		sesion.setAttribute("accesos", sesion.getId());
		
		if (mostrar.equals("visualizar")) {
			try {
				pr = usuarioDao.listarProductos();
				request.setAttribute("productos", pr);
				
				JDBCUsuarioDAO nuevo = new JDBCUsuarioDAO();
				if (nuevo.rol.equals("A")) {
					url="JSPs/ListarAdmin.jsp";
				}else if(nuevo.rol.equals("U")){
					url="JSPs/Listar.jsp";
				}
			} catch (Exception e) {
				url="JSPs/Listar.jsp";
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

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
