import java.sql.*;

public class update_table{
  public static void main(String[] args) {
    try{
      Class.forName("com.mysql.jdbc.Driver");
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mtech","root","khan");

      PreparedStatement ps = conn.prepareStatement("update EMP set EMP_Name=? where EMP_ID=?");
      ps.setString(1,"RATAN");
      ps.setInt(2, 3);

      int i = ps.executeUpdate();
      System.out.println(i+"rows updated");
      conn.close();
    }
    catch (Exception e){
      e.printStackTrace();
    }
  }
}
