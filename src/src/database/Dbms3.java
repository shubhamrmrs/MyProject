package src.database;
import java.sql.*;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class Dbms3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "root");
		
		Statement st =con.createStatement();
	int count = st.executeUpdate("insert into home values(6,'xy')");
	
		System.out.println(count+"row affected");
		st.close();
		con.close();
		
		
		
		
	}

}
