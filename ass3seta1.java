import java.sql.*;
import javax.swing.*;
public class ass3seta1
{
    public static void main(String args[])
    {
        try
         {
              Class.forName("org.postgresql.Driver");
              Connection conn = DriverManager.getConnection("jdbc:postgresql://192.168.1.21/ty30","ty30","");
              System.out.println("Establish the connection");
              JFrame f = new JFrame("Project Details");
              Statement s = conn.createStatement();
              ResultSet rs = s.executeQuery("select * from project ");
              ResultSetMetaData rsmd = rs.getMetaData();
              int cols = rsmd.getColumnCount();
            
              int rows = 0;
              while(rs.next())
              {
                 rows++;
              }
              rows++;
              System.out.println("Rows :  " + rows + "  cols : " + cols);
              rs.close(); 
 
              rs = s.executeQuery("select * from project");
              JTable t = new JTable(rows , cols);
              rows = 1;
              for(int i=1 ; i<=cols ; i++)
              {
                 t.setValueAt(rsmd.getColumnName(i) , 0 , i-1);
              }
              while(rs.next())
              { 
                 t.setValueAt(rs.getInt(1) , rows , 0);
                 t.setValueAt(rs.getString(2) , rows , 1);
                 t.setValueAt(rs.getString(3) , rows , 2);
                 t.setValueAt(rs.getString(4) , rows , 3); 
                 rows++;
              }
              f.add(t);
              f.setVisible(true);
              f.setSize(400 , 400);
              f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         }
        catch(Exception e)
        {
        }
   }
}
