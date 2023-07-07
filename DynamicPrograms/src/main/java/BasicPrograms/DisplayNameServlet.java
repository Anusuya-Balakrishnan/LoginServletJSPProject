package BasicPrograms;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DisplayNameServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String myFirstName=req.getParameter("FirstName");
		String myLastName=req.getParameter("lastName");
		PrintWriter out=res.getWriter();
		out.println("Hello "+myFirstName+" "+myLastName);
	}
}
