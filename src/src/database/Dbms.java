package src.database;
import java.sql.*;

public class Dbms {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "root");
		
		Statement st=con.createStatement();
		
		ResultSet rs= st.executeQuery("select * from home");
		String x="";
		while(rs.next())
		
		{ x= rs.getInt(1)+":"+rs.getString(2);
		
        System.out.println(x);
		}
		st.close();
		con.close();
		
		
		
	}

}
