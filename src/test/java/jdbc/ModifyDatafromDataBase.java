package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ModifyDatafromDataBase {
	
	public static void main(String[] args) throws SQLException {

	
	Driver dbDriver = new Driver();
	
	DriverManager.registerDriver(dbDriver);
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/advasele","root" , "root");
	Statement statement = connect.createStatement();
	int result = statement.executeUpdate("insert into students(id,name,address)values(108,'xyz','hyd');");
	{
	if(result==1) {
		System.out.println("DB updated Sucessfully");
	}
	else
	{
		System.out.println("DB not updated");
		
	}
	connect.close();

}
}
}
