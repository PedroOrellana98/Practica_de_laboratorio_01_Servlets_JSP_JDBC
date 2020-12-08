package controlador;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class Filtro
 */
@WebFilter({"/Filtro", "/JSPs/Usuario.jsp", "/JSPs/Admin.jsp", "/JSPs/ActualizarAdmin.jsp", "/JSPs/Agregar.jsp", 
	"/JSPs/AgregarProducto.jsp", "/JSPs/Buscar.jsp", "/JSPs/BuscarAdmin.jsp", "/JSPs/EliminarAdmin.jsp", 
	"/JSPs/Listar.jsp", "/JSPs/ListarAdmin.jsp"})
public class Filtro implements Filter {

    /**
     * Default constructor. 
     */
    public Filtro() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		HttpSession sesion;
		System.out.println("Entro en los filtros");
		sesion = ((HttpServletRequest) request).getSession();
		if (sesion.getAttribute("accesos") == null) {
			((HttpServletResponse) response).sendRedirect("InicioSesion.jsp");
		}else {
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
