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
import dao.ProductoDAO;

/**
 * Servlet implementation class Login
 */
@WebServlet("/insertarProducto")
public class insertarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertarProducto() {
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
				url="JSPs/AgregarProducto.jsp";
			} catch (Exception e) {
				url="JSPs/InicioSesion.jsp";
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

		ProductoDAO producto = DAOFactory.getFactory().getProductoDAO();
		int id = 0;
		String nombre = null;
		int sel = 0;
		int req = 0;
		String url = null;
		//producto es el textfield de ingreso
		
		//accion es el name del boton
		Object accion = request.getParameter("botonAgregar");
		HttpSession sesion = request.getSession(true);

		sesion.setAttribute("accesos", sesion.getId());
		
		//registar es el value del boton
		if (accion.equals("agregar")) {
			try {
				id = Integer.parseInt(request.getParameter("id"));
				nombre = request.getParameter("nombre");
				sel = Integer.parseInt(request.getParameter("sel"));
				req = Integer.parseInt(request.getParameter("req"));
				producto.nuevoProducto(id, nombre, sel, req);
				url="JSPs/Admin.jsp";
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
