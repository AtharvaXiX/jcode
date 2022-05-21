import java.sql.*;
import javax.swing.*;
public class ass3seta3
{
    public static void main(String args[])throws Exception
    {
              Statement stmt ;
              Class.forName("org.postgresql.Driver");
              Connection conn = DriverManager.getConnection("jdbc:postgresql://192.168.1.21/ty30","ty30","");
              System.out.println("Establish the connection");
              stmt = conn.createStatement();
              ResultSet rs = stmt.executeQuery("select * from DONAR");
              ResultSetMetaData rsmd = rs.getMetaData();
              int no_of_column = rsmd.getColumnCount();
              System.out.println("Number of Columns : " + no_of_column);
              for(int i=1 ; i<=no_of_column ; i++)
              {
                   System.out.println("Column NO : " + i);
                   System.out.println("Column Name : " + rsmd.getColumnName(i));
                   System.out.println("Column Type : " + rsmd.getColumnTypeName(i));
                   System.out.println("Column Display Size : " + rsmd.getColumnDisplaySize(i));
              }
              conn.close();
     }
}
 
