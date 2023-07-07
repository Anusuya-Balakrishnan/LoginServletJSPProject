package BasicPrograms;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/signupServlet")
public class signupServlet extends HttpServlet {
	
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		String rollno=req.getParameter("rollno");
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		int mark=Integer.parseInt(req.getParameter("mark"));
		String useremail = req.getParameter("useremail");
		String password = req.getParameter("password");
		PrintWriter out = res.getWriter();
		HttpSession session = req.getSession();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDatabase", "root",
					"ocean");
			String query="insert into studentdata(rollno,name,age,email,password,mark)"
					+ "values(?,?,?,?,?,?)";
			PreparedStatement statement=connection.prepareStatement(query);
			statement.setString(1, rollno);
			statement.setString(2, name);
			statement.setInt(3, age);
			statement.setString(4, useremail);
			statement.setString(5,password);			
			statement.setInt(6,mark);
			statement.executeUpdate();
			session.setAttribute("username", name);
			res.sendRedirect("homeServlet");
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
