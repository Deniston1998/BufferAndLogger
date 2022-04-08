package basee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataBaseTest {
	

	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		
		//which db should use
   Class.forName("com.mysql.jdbc.Driver");
   //create connection with db..
   Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/seleniumuser");
   //for sending sql statement
  Statement statement = connection.createStatement();
 ResultSet result = statement.executeQuery("SELECT * FROM login");
 while(result.next()) {
	 System.out.println("Names:" +result.getString(1)+"  password:"+result.getString(2));
	 
 }
  
}
}