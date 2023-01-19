package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFromDataBase {
	
	public static void main(String[] args) throws SQLException {
		
		Driver dbDriver = new Driver();
		
		DriverManager.registerDriver(dbDriver);
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/advasele","root" , "root");
		Statement statement = connect.createStatement();
		ResultSet result = statement.executeQuery("select * from students;");
		while(result.next()) {
			System.out.println(result.getInt(1)+"\t"+result.getString(2));
			
		}
		connect.close();
		
		
	}

}
