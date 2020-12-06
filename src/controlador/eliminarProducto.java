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
import dao.ProductoDAO;
import dao.UsuarioDAO;
import modelo.Categoria;
import modelo.Producto;
import mysql.jdbc.JDBCUsuarioDAO;

/**
 * Servlet implementation class Login
 */
@WebServlet("/eliminarProducto")
public class eliminarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public eliminarProducto() {
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
				url="JSPs/EliminarAdmin.jsp";
			} catch (Exception e) {
				url="JSPs/EliminarAdmin.jsp";
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

		ProductoDAO productoDao = DAOFactory.getFactory().getProductoDAO();
		String eliminar = null;
		String url = null;

		Object accion = request.getParameter("botonEliminar");
		HttpSession sesion = request.getSession(true);

		sesion.setAttribute("accesos", sesion.getId());
		
		if (accion.equals("eliminar")) {
			try {
				eliminar = request.getParameter("eliminar");
				productoDao.elminiarProducto(eliminar);
				url="JSPs/Admin.jsp";
			} catch (Exception e) {
				url="JSPs/Admin.jsp";
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
