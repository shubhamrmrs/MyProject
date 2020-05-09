package src.database;
import java.sql.*;
public class Dbms4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
			Class.forName("com.mysql.jdbc.Driver");
		
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "root");
			String s= "create table house2(hno int, hname varchar(20))";
			
			Statement st=con.createStatement();
			
			st.executeUpdate(s);
			System.out.println("table............");
			st.close();
			con.close();
			
				
	
		
		
	}

}
