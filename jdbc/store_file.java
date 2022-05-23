
import java.sql.*;
public class store_file {
  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mtech","root","khan");
      PreparedStatement stmt = conn.prepareStatement("Insert into EMP values (?,?,?,?,?)");
      stmt.setString(1, "Ratan");
      stmt.setInt(2, 3);
      stmt.setInt(3,46000);
      stmt.setString(4, "2009-09-03");
      stmt.setInt(5, 7);
      int i = stmt.executeUpdate();
      System.out.println(i+"rows affected");
    } catch(Exception e){
      e.printStackTrace();
    }
  }
}
