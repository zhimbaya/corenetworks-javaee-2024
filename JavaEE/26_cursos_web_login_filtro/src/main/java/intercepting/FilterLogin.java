package intercepting;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class FilterLogin
 */
public class FilterLogin extends HttpFilter implements Filter {

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// SI EL USUARIO ESTÁ AUTENTICADO (EXISTE EL ATRIBUTO DE SESION DE USUARIO)
		// LE DEJAMOS PASAR, SINO LE MANDAMOS A LA PÁGINA DE LOGIN.HTML
		HttpSession sesion = ((HttpServletRequest) request).getSession();
		String usuario = (String) sesion.getAttribute("usuario");
		if (usuario != null) {
			// pass the request along the filter chain
			chain.doFilter(request, response);
		} else {
			// OBTENEMOS LA DIRECCIÓN DE ENTRADA Y EL VALOR DEL PARÁMETRO OPERATion
			String path = ((HttpServletRequest) request).getServletPath();
			String param = ((HttpServletRequest) request).getParameter("operation");
			if (param != null && param.equals("doLogin")) {

				chain.doFilter(request, response);
			}
			request.getRequestDispatcher("login.html").forward(request, response);
		}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
