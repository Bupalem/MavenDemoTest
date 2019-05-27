package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.testng.annotations.Test;

import com.mysql.cj.protocol.Resultset;

public class DatabaseTest {
  
	@Test
  public void dataBase() throws Throwable {
		//we are loading jar file of driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","pavan@3103");
		System.out.println("Connected to Mysql DB");
		Statement stm=con.createStatement();
		ResultSet set=stm.executeQuery("select * from actor");
		String fname;
		ArrayList<String> str=new ArrayList<String>();
		while(set.next()){
			fname= set.getString("first_name");
			str.add(fname);
			System.out.println("first column name:"+fname);
			}
		System.out.println("Size of fname:"+str.size());
	
	}
}
