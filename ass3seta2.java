import java.sql.*;
import javax.swing.*;
public class ass3seta2
{
    public static void main(String args[])throws Exception
    {
              ResultSet rs = null;
              Class.forName("org.postgresql.Driver");
              Connection conn = DriverManager.getConnection("jdbc:postgresql://192.168.1.21/ty30","ty30","");
              System.out.println("Establish the connection");
              DatabaseMetaData dbmd = conn.getMetaData();
              System.out.println("Database Product Name : " + dbmd.getDatabaseProductName());
              System.out.println("Database Product Version : " + dbmd.getDatabaseProductVersion());
              System.out.println("Driver Name : " + dbmd.getDriverName());
              System.out.println("User Name : " + dbmd.getUserName());
              rs = dbmd.getTables(null ,null , null , new String[]{"TABLE"});
              System.out.println("List of Tables ");
              while(rs.next())
              {
                 String table_nm = rs.getString("TABLE_NAME");
                 System.out.println("Table :  " + table_nm);
              }
              conn.close();
     }
}

