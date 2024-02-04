import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetDetails {
	static void get()throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/e1";
		String username="root";
		String password="Deepa2020";
		String Query="Select* from employee_det where emp_id=2";
		Connection c1=DriverManager.getConnection(url, username, password);
		PreparedStatement p1=c1.prepareStatement(Query);
		Statement s1=c1.createStatement();
		ResultSet r1=s1.executeQuery(Query);
		while(r1.next()) {
			System.out.println("Emp_ id:"+r1.getInt(1));
			System.out.println("Emp_name:"+r1.getString(2));
			System.out.println("Emp_gender:"+r1.getString(3));
			System.out.println("Emp_age:"+r1.getInt(4));
			System.out.println("Emp_dept:"+r1.getString(5));
			System.out.println("Emp_salary:"+r1.getInt(6));
		}
		}
			public static void main(String[] args) throws Exception{
				get();
			}
		
		
		

}
