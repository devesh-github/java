import java.sql.*;
public class clsDatabase 
{
  public static void main(String args[]) 
{
    // URL for where the database is
	String url = "jdbc:postgresql://localhost:5432/interview";
    // Load the postgres driver
    try{Class.forName("org.postgresql.Driver");}
    
    catch( Exception e ){System.out.println("Failed to load mSQL driver.");return;}
    
    try {
    // Get the connection object using the drivermanager class
      Connection con = DriverManager.getConnection(url, "postgres", "pass@1234!@#$");
      // create a statement object using the connection object
      Statement select = con.createStatement();
      // get the resultset by firing the query using the statement object
      ResultSet result = select.executeQuery("Select * from users");         
      // loop through the resul object and display the name field
      while(result.next()) 
      { 
        String key = result.getString(1);
        System.out.println(key);
      }
      select.close();
      con.close();
    }
    catch( Exception e ) 
    {
      e.printStackTrace();
    }
  }
}


