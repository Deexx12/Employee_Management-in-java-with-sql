import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

public class InsertDetils {
public static void insert() throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/e1";
	String username="root";
	String password="Deepa2020";
	String Query="insert into employee_det values (?,?,?,?,?,?)";
	Connection e1=DriverManager.getConnection(url,username,password);
	PreparedStatement p1=e1.prepareStatement(Query);
	p1.setInt(1, 1);
	p1.setString(2, "Deepa");
	p1.setString(3,"female");
	p1.setInt(4,21);
	p1.setString(5, "java Developer");
	p1.setInt(6, 40000);p1.setInt(1, 2);
	p1.setString(2, "Kavi");
	p1.setString(3,"male");
	p1.setInt(4,22);
	p1.setString(5, "Data Analytics");
	p1.setInt(6, 50000);
	
	p1.setInt(1, 3);
	p1.setString(2, "Saneam");
	p1.setString(3,"female");
	p1.setInt(4,24);
	p1.setString(5, "Product Analyst");
	p1.setInt(6, 25000);
	
	p1.setInt(1, 4);
	p1.setString(2, "Arora");
	p1.setString(3,"male");
	p1.setInt(4,27);
	p1.setString(5, "Sales Manager");
	p1.setInt(6, 35000);
	
	
	
	
	
	p1.executeUpdate();
	e1.close();
}
	public static void main(String[] args)throws Exception{
		
		insert();
		}
		
	
	
}

