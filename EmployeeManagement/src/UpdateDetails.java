import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

public class UpdateDetails {
	public static void update()throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/e1";
;		String username="root";
		String password="Deepa2020";
		String Query="update  employee_det set emp_name='Yash' where emp_id='4'";
		Connection c1=DriverManager.getConnection(url,username,password);
		PreparedStatement p1=c1.prepareStatement(Query);
		p1.executeUpdate();
		p1.close();
	}
		public static void main(String[] args)throws Exception {
			update();
			
		}
		
	}


