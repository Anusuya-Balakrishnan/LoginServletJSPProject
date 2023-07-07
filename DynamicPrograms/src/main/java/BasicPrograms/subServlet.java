package BasicPrograms;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class subServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
	int number1=Integer.parseInt(req.getParameter("number1"));
	int number2=Integer.parseInt(req.getParameter("number2"));
	PrintWriter out=res.getWriter();
	out.println("sub of two number"+(number1-number2));
	}
}
