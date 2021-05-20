package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Users;

/*
 * @Author: Niraj Thagunna
 * DAO - Data Access Layer
 * It provides the CRUD operation for the table users in the database.
 */ 

public class UserDAO {

	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private Connection jdbcConnection;

	public UserDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}

	// get the connection
	// Creating a new connection
	protected void connect() throws SQLException {
		if (jdbcConnection == null || jdbcConnection.isClosed()) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			}
			catch (ClassNotFoundException ex) {
				throw new SQLException(ex);
			}
			jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		}
	}

	// Close the connection
	// disconnect() the connection
	protected void disconnect() throws SQLException {
		if (jdbcConnection != null && !jdbcConnection.isClosed()) {
			jdbcConnection.close();
		}
	}

	// Inserting the user registration data into the database
	public boolean insertUser(Users users) throws SQLException {

		// sql format to insert the data
		String sql = "INSERT INTO users (user_name, email, password, confirm_pass) VALUES (?, ?, ?, ?)";

		// connect to the database
		connect();

		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, users.getUserName());
		statement.setString(2, users.getEmail());
		statement.setString(3, users.getPassword());
		statement.setString(4, users.getConfirmPass());

		// Taking the data, as how many rows are inserted into the table
		boolean rowInserted = statement.executeUpdate() > 0;

		// closing all the stream
		statement.close();
		disconnect();

		// return 
		return rowInserted;
	}
}
