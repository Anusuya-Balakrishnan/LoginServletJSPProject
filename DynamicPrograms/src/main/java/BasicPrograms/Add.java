package BasicPrograms;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Add extends HttpServlet {


	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException{
		int number1=Integer.parseInt(req.getParameter("number1"));
		int number2=Integer.parseInt(req.getParameter("number2"));
		PrintWriter out=res.getWriter();
		out.println("sum of two number"+(number1+number2));
		out.println("DoGet method is running");
		
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
		int number1=Integer.parseInt(req.getParameter("number1"));
		int number2=Integer.parseInt(req.getParameter("number2"));
		int sum=number1+number2;
		HttpSession session=req.getSession();
		session.setAttribute("sum", sum);
		res.sendRedirect("result");
//		req.setAttribute("result",(number1+number2) );
//		RequestDispatcher rd=req.getRequestDispatcher("result");
//		rd.forward(req, res);
	}
}
