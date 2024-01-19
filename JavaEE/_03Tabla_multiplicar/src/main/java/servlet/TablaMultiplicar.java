package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TablaMultiplicar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body><table border=\"1\">");
		
		for (int i = 0; i <= 10; i++) {
			out.println("<tr>");
			for (int j = 0; j <= 10; j++) {
				out.println("<td> 10 x " + i + " = " + (i * j) + "</td>");
			}
			out.println("</tr>");
		}
		out.println("</table></body></html>");
		out.close();
	}

}
