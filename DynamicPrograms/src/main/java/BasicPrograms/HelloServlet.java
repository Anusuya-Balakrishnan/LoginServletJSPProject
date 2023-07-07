package BasicPrograms;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	int n=1;
public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	
   PrintWriter out=res.getWriter();
   out.println("Hello world from servlet");
   out.println("Good morning");  
   out.println("n="+n);
   System.out.println("servlet is running"+n);
   n++;
}
}
