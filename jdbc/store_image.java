import java.sql.*;
import java.io.*;

public class store_image{
  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mtech","root","khan");
      PreparedStatement ps = conn.prepareStatement("Insert into Img values (?,?)");
      ps.setString(1, "TempImage");
      
      FileInputStream fin = new FileInputStream("/home/afshan/Pictures/vtodo.png");
      ps.setBinaryStream(2,fin,fin.available());
      int i = ps.executeUpdate();
      System.out.println(i+" rows affected");
      conn.close();
    } catch(Exception e){
      e.printStackTrace();
    }
  }
}
