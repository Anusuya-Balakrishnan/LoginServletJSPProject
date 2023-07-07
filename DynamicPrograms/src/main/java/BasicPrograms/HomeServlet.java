package BasicPrograms;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/homeServlet")
public class HomeServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		HttpSession session = req.getSession();
		String username = (String) session.getAttribute("username");
		if (username == null) {
			res.sendRedirect("LoginPage.html");
		} else {
			res.sendRedirect("homeJSP.jsp");
			
		}

	}
}
