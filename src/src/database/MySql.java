package src.database;

import java.sql.*;
public class MySql {

	public static void main(String[] args) throws Exception
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "root");
		
		Statement st=con.createStatement();
		ResultSet rs = st.executeQuery("select ename from room where eno=3");
		
		rs.next();
		String name =rs.getString("ename");
		System.out.println(name);
        
		st.close();
		con.close();
		
		
	}
	

}
