package ClassExample;

/**
 * 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author 
 *
 */
public class ViewStudentProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
	    try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String connectionUrl = "jdbc:mysql://localhost:3306/programdb";
		String connectionUser = "root";			
		String connectionPassword = "admin";
		
		conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT s.firstName, s.lastName, p.programName FROM student s, Program p where s.programCode=p.programCode");
		while (rs.next()) {
				 System.out.println("First Name: " + rs.getString(1));
                 System.out.println("Last Name : " + rs.getString(2));
                 System.out.println("Program   : " + rs.getString(3));
                 System.out.println("________________________________");
                 
		   }
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
