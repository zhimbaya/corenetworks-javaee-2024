package helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionLocator {
	static String cadenaCon="jdbc:mysql://localhost:3306/formacion";
	static String user="root";
	static String pwd="root";
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(cadenaCon, user, pwd);
	}
}
