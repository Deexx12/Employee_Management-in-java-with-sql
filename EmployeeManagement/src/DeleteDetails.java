import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;


public class DeleteDetails {
	static void delete()throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/e1";
	String username="root";
	String password="Deepa2020";
	String Query="delete from employee_det where emp_id='4'";
	Connection c1=DriverManager.getConnection(url, username, password);
	PreparedStatement p1=c1.prepareStatement(Query);
	p1.executeUpdate();
	c1.close();
	}
	public static void main(String[] args) throws Exception{
		delete();
	}
	
	

}
