import java.sql.*;
public class delete_stmt {
  static void print_table(Connection conn, Statement stmt) throws SQLException{
      ResultSet rs = stmt.executeQuery("select * from EMP");
      while (rs.next()) {
        System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
      }
  }
  public static void main(String[] args) throws Exception {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mtech","root","khan");
      Statement stmt = conn.createStatement();
      print_table(conn, stmt);
      int result = stmt.executeUpdate("delete from EMP where EMP_ID=3");
      print_table(conn, stmt);
      conn.close();
    } catch(Exception e){
      e.printStackTrace();
    }
  }
}
