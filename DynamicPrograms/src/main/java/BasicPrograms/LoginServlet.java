package BasicPrograms;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String useremail = req.getParameter("useremail");
		String password = req.getParameter("password");
		PrintWriter out = res.getWriter();
		HttpSession session = req.getSession();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDatabase", "root",
					"ocean");

			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select name, email, password from studentdata");
			while (rs.next()) {
				if (useremail.equals(rs.getString("email")) && password.equals(rs.getString("password"))) {
					session.setAttribute("username", rs.getString("name"));
					break;
				}
			}
			res.sendRedirect("homeServlet");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
