import java.sql.*;
public class mysql_thin{
  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mtech","root","khan");
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery("select * from EMP");
      while (rs.next()) {
        System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
      }
      conn.close();
    } catch(Exception e){
      e.printStackTrace();
    }
  }
}
