package com.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestDbServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = "springstudent";
		String pass = "springstudent";
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/spring_app_database?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try {
			PrintWriter out = response.getWriter();
			
			out.println("connecting to database: " + jdbcUrl);
			
			Class.forName(driver);
			Connection myCon = DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("connected");
			myCon.close();
		}
catch (Exception e) {
	e.printStackTrace();
	throw new ServletException(e);
}	
	}

}
