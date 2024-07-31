package Day_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

//Program to retrieve data from the database by  using executeQuery() method and DQl Query

public class Question_1 {
	public static void main(String[] args) {		
		try {
//			Loading the Specific  Driver 
			Class cl = Class.forName("oracle.jdbc.driver.OracleDriver");
			
//			Established The Connection between Application and Database
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:MYSYSTEM", "MyDB11AM", "123");
			
//			
			Statement st = con.createStatement();
			
//			
			ResultSet rs = st.executeQuery("SELECT * FROM STUDENTS");
			
//			
			ResultSetMetaData  rm = rs.getMetaData();			
			int columnNum = rm.getColumnCount();
			for(int i=1; i<=columnNum; i++) {
				System.out.print(rm.getColumnName(i)+"\t");
			}
			
			System.out.println();
//			
			while(rs.next()) {
				System.out.print(rs.getInt("ROLL_NO")+"\t");
				System.out.print(rs.getString("STD_NAME")+"\t");
				System.out.println(rs.getInt("STD_MARKS")+"\t");
			}
			
			
		} catch (ClassNotFoundException e) {			
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}
}
