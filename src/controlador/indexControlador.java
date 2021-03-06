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

import dao.CategoriaDAO;
import dao.DAOFactory;
import dao.EmpresaDAO;
import dao.ProductoDAO;
import modelo.Categoria;
import modelo.Empresa;
import modelo.Producto;
import mysql.jdbc.JDBCUsuarioDAO;


/**
 * Servlet implementation class Usuario
 */
@WebServlet("/indexControlador")
public class indexControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public indexControlador() {
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
		EmpresaDAO empresaDao = DAOFactory.getFactory().getEmpresaDAO();
		ProductoDAO productoDao = DAOFactory.getFactory().getProductoDAO();
		CategoriaDAO categoriaDao = DAOFactory.getFactory().getCategoriaDAO();

		Object mostrar = request.getParameter("mostrarTabla");
		List<Empresa> em = new ArrayList<Empresa>();
		List<Producto> pr = new ArrayList<Producto>();
		List<Categoria> cat = new ArrayList<Categoria>();
		HttpSession sesion = request.getSession(true);

		sesion.setAttribute("accesos", sesion.getId());
		System.out.println("ID sesion Usuario: " + String.valueOf(sesion.getId()));
		
		if (mostrar.equals("tabla")) {
			try {
				pr = productoDao.listarPrincipal();
				cat = categoriaDao.listarPrincipal1();
				em = empresaDao.listarPrincipal2();

				request.setAttribute("productos", pr);
				request.setAttribute("categorias", cat);
				request.setAttribute("empresas", em);
				url="index.jsp";
			} catch (Exception e) {
				url="index.jsp";
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
