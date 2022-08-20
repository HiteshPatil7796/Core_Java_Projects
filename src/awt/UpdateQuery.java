package awt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateQuery {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","");
			
			PreparedStatement stmt=con.prepareStatement("update student set name=? where rollno=?");
			stmt.setString(1,"Onee");
			stmt.setInt(2, 106);
			
			int i=stmt.executeUpdate();
			System.out.println(i+" records updated");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
