import java.sql.*;
import javax.swing.*;

public class ProjectTable
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bookstore","postgres","postgresql123");		//("jdbc:postgresql://192.168.1.21/ty24","ty24","");
			System.out.print("\nConnection successful");
			
			JFrame f = new JFrame("project details");
			
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("select * from books_info");
			
			ResultSetMetaData rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			
			int rows=0;
			while(rs.next())
			{
				rows++;	
			}
			rows++;
			//int rows = rs.getRow();
			System.out.println("rows :"+rows+"columns :"+cols);
			JTable t = new JTable(rows,cols);
			for(int i=1; i<=cols;i++)
			{
				t.setValueAt(rsmd.getColumnName(i),0,i-1);	
			}
			
			rs.close();
			rs = s.executeQuery("select * from books_info");
			
			int row=1;
			
			while(rs.next())
			{
				t.setValueAt(rs.getInt(1),row,0);				
				t.setValueAt(rs.getString(2),row,1);
				t.setValueAt(rs.getString(3),row,2);
				t.setValueAt(rs.getString(4),row,3);
				t.setValueAt(rs.getString(5),row,4);
				row++;	
			} 
			f.add(t);
			f.setVisible(true);
			f.setSize(400,400);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
