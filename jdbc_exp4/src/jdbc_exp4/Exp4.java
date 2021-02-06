package jdbc_exp4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Exp4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			// Create query
			System.out.println("Creating a table");
			String query="CREATE TABLE student.stu ("
					+ "stuno INT NOT NULL,"
					+ "name VARCHAR(45) NOT NULL,"
					+ "fee INT NOT NULL,"
					+ "dept VARCHAR(45) NOT NULL)";
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
			
			System.out.println("Table Created\n");
			// output: Table Created
			
			System.out.println("Inserting Values");
			String query1 = "INSERT INTO stu " + "VALUES (1216, 'Divya', 50000, 'IT')";
			stmt.executeUpdate(query1);
			query1 = "INSERT INTO stu " + "VALUES (0517, 'Santhoshi', 45000, 'CSE')";
			stmt.executeUpdate(query1);
			query1 = "INSERT INTO stu " + "VALUES (0218, 'Prathyusha', 50000, 'EEE')";
			stmt.executeUpdate(query1);
			query1 = "INSERT INTO stu " + "VALUES (0401, 'Supriya', 42000, 'MECH')";
			stmt.executeUpdate(query1);
			
			System.out.println("Displaying Values\n");
			ResultSet rs = stmt.executeQuery("SELECT * FROM stu");
	         System.out.println("stuno\tname\tfee\tdept");
	         
	         while (rs.next()) {
	            int stuno = rs.getInt("stuno");
	            String name = rs.getString("name");
	            String sal = rs.getString("fee");
	            String dept = rs.getString("dept");
	            System.out.println(stuno + "\t" + name + "\t" + sal + "\t" + dept);
	         }
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
