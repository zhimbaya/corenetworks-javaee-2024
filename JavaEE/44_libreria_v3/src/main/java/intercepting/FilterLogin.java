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

public class FilterLogin extends HttpFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// SI EL USUARIO ESTÁ AUTENTICADO (EXISTE EL ATRIBUTO DE SESION DE USUARIO)
		// LE DEJAMOS PASAR, SINO LE MANDAMOS A LA PÁGINA DE LOGIN.HTML
		HttpSession sesion = ((HttpServletRequest) request).getSession();
		String usuario = (String) sesion.getAttribute("usuario");
		if (usuario != null) {
			// pass the request along the filter chain
			chain.doFilter(request, response);
			return;
		} else {
			// OBTENEMOS LA DIRECCIÓN DE ENTRADA Y EL VALOR DEL PARÁMETRO OPERATion
			String path = ((HttpServletRequest) request).getServletPath();
			String param = ((HttpServletRequest) request).getParameter("operation");
			if (param != null && param.equals("doLogin")) {

				chain.doFilter(request, response);
				return;
			}else {
			request.getRequestDispatcher("inicio.html").forward(request, response);
			}
		}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
