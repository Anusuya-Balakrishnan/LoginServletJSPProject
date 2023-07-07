package BasicPrograms;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@WebServlet("/resultServlet")
public class ResultServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException  {
		PrintWriter out=res.getWriter();
//		int result=Integer.parseInt(req.getParameter("sum"));
		HttpSession session=req.getSession();
		
//		session.removeAttribute("sum");
		int result=(int)session.getAttribute("sum");		
//		int output=(int)req.getAttribute("result");
		out.println("result servlet is running"+result);
	}
	
}
