import java.sql.*;

public class InsertValue{
  public static void main(String[] args) {
    System.out.println("Inserting values in Mysql database table!");
    Connection con = null;
    String url = "jdbc:postgresql://localhost/";
    String db = "jdbctutorial";
    String driver = "org.postgresql.Driver";
    try{
      Class.forName(driver);
      con = DriverManager.getConnection(url+db,"","");
      try{
        Statement st = con.createStatement();
	
        int val = st.executeUpdate("INSERT INTO employee VALUES("+13+","+"'Aman'"+")");
        System.out.println("1 row affected");
      }
      catch (SQLException s){
	  s.printStackTrace();
      }
    }
    catch (Exception e){
      e.printStackTrace();
    }
  }
} 
