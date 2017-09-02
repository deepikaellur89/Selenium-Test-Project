package testscripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*public class DataBaseConnection 
{

	public static void main(String[] args) throws SQLException 
	{
		
		try 
		{
		
		 Connection con = DriverManager.getConnection(
                 "jdbc:sybase:menagerie.stanford.edu:1025", "journalview", "highwire");
		 con.createStatement();
		 Class.forName("com.sybase.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		//Statement stmt = con.createStatement();	
		//stmt.executeQuery(select * from alert);

	}

}
*/

import java.sql.*;

public class DataBaseConnection
{
    public static void main( String args[] )
    {
        try
        {
            String arg;
            Connection con;

            // Select the JDBC driver and create a connection.
            // May throw a SQLException.
            // Choices are:
            // 1. jConnect driver
            // 2. SQL Anywhere JDBC 3.0 driver
            // 3. SQL Anywhere JDBC 4.0 driver
            arg = "jdbc4";
           
                con = DriverManager.getConnection(
                		"jdbc:sybase:menagerie.stanford.edu:1025", "journalview", "highwire");
                       
            System.out.println("Using "+arg+" driver");
            
            // Create a statement object, the container for the SQL
            // statement. May throw a SQLException.
            Statement stmt = con.createStatement();

            // Create a result set object by executing the query.
            // May throw a SQLException.
            ResultSet rs = stmt.executeQuery(
                "SELECT alertid FROM Alert");

            // Process the result set.
            while (rs.next())
            {
                int value = rs.getInt(1);
                String FirstName = rs.getString(2);
                String LastName = rs.getString(3);
                System.out.println(value+" "+FirstName+" "+LastName);
            }
            rs.close();
            stmt.close();
            con.close();
        }
        catch (SQLException sqe)
        {
            System.out.println("Unexpected exception : " +
                                sqe.toString() + ", sqlstate = " +
                                sqe.getSQLState());
            System.exit(1);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.exit(1);
        }

        System.exit(0);
    }
}
