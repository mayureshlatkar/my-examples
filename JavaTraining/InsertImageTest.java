

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertImageTest {

   public static void main(String[] args) throws SQLException {
       InsertImageTest imageTest = new InsertImageTest();
       imageTest.insertImage();
   }

   public Connection getConnection() {
       Connection connection = null;

       try {
           Class.forName("com.mysql.jdbc.Driver");
           connection = DriverManager.getConnection("jdbc:mysql://localhost/dblearn", "ftp60", "ftp60");
       } catch (Exception e) {
           System.out.println("Error Occured While Getting the Connection: - " + e);
       }
       return connection;
   }

   public void insertImage() {
       Connection connection = null;
       PreparedStatement statement = null;
       FileInputStream inputStream = null;

       try {
           File image = new File("C:/Chrysanthemum.jpg");
           inputStream = new FileInputStream(image);

           connection = getConnection();
           statement = connection.prepareStatement("insert into trn_imgs(img_title, img_data) " + "values(?,?)");
           statement.setString(1, "Sample Image");
           statement.setBinaryStream(2, (InputStream) inputStream, (int)(image.length()));

           statement.executeUpdate();

       } catch (FileNotFoundException e) {
           System.out.println("FileNotFoundException: - " + e);
       } catch (SQLException e) {
           System.out.println("SQLException: - " + e);
       } finally {

           try {
               connection.close();
               statement.close();
           } catch (SQLException e) {
               System.out.println("SQLException Finally: - " + e);
           }

       }

   }


}