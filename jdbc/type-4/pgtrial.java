import java.sql.*;

public class pgtrial{
    public static void main(String[] args) {
    Connection con = null ;
    String url = "jdbc:postgresql://localhost/";
    String db = "studentdb";
    String driver = "org.postgresql.Driver";

    try{
      Class.forName(driver);
      con = DriverManager.getConnection(url+db,"student","");
      try{
        Statement st = con.createStatement();
	
        int val = st.executeUpdate("INSERT INTO Emp VALUES("+13+","+"'Aman'"+")");
        System.out.println("1 row affected");
      }
      catch (SQLException s){
        System.out.println("Sql exception");
        s.printStackTrace();
      }
    }
    catch (Exception e){
      System.out.println("forname exception");
      e.printStackTrace();
    }
  }
}
