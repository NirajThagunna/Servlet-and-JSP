package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import model.Users;

/*
 * @Author: Niraj Thagunna
 * ControllerServlet.java
 * This servlet acts as a page controller for the application, handling all the requests from the user.
 */
public class ControllerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	// object for the UserDAO class
	private UserDAO userDAO;

	// get the database config parameter i.e. init() parameter
	public void init() {
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");

		// call the UserDAO constructor
		userDAO = new UserDAO(jdbcURL, jdbcUsername, jdbcPassword);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}

	protected void doService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = request.getServletPath();

		try {
			switch (action) {
			case "/signUpServlet":
				signUp(request, response);
				break;
			}
		}
		catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	// signUp
	public void signUp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {

		// getting all the parameter value from the client side form
		String userName = request.getParameter("user_name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmPass = request.getParameter("confirm_pass");

		// Submit all the data to the Users.java Model class
		Users newUser = new Users(userName, email, password, confirmPass);

		// all the fetched data store in the database using UserDAO
		userDAO.insertUser(newUser);

		System.out.println("Registration successfully!!!");

		// Creating a session object to show the user about successful registration
		//		HttpSession session = request.getSession();
		//		session.setAttribute("alertMsg", userName + ", You have successfully registed!");
		//
		//		response.sendRedirect("registration.jsp");
	}

}


