import java.util.*;
import java.io.*;
public class ass1seta1
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList A1=new ArrayList();
		System.out.println("How many cities : ");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter city Names : \n");	
		for(int i=1; i<=n; i++)
		{
			A1.add(br.readLine());
		}
		System.out.println("City names are: "+A1);
		A1.remove(A1);
		System.out.println("Removed"+A1);
	}
}
		
