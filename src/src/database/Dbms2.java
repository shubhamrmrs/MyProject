package src.database;
import java.sql.*;

public class Dbms2 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "root");
		
		Statement st= con.createStatement();
		ResultSet rs =st.executeQuery("select rname from home where rno=3");
		rs.next();
		
		String sk= rs.getString(1);
		System.out.println(sk);
		
		st.close();
		con.close();
	}

}
