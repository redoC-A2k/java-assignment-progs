import java.sql.*;
import java.io.*;

public class JDBCFIRST {
  public static void main(String ag[]) {
    Connection con;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost/mtech", "root", "khan");
      Statement st = con.createStatement();
      st.executeUpdate("CREATE TABLE EMP (EMP_Name VARCHAR(32),EMP_ID INTEGER,SALARY FLOAT,DATE_of_HIRED DATE,TOTAL_YEAR INTEGER)");
      System.out.println("Table created successfully");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println(e.toString());
      e.printStackTrace();
    }
    catch (SQLException e) {
      System.out.println(e.toString());
      e.printStackTrace();
    }
  }

}
