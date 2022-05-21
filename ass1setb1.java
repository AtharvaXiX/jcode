import java.util.*;
public class ass1setb1
{
	public static void main(String args[])
	{
		
		Set ts = new TreeSet();
		Scanner s = new Scanner(System.in);

		System.out.println("Enter how many Number you want");
		int n = s.nextInt();

		System.out.println("Enter a number ");

			for(int i=0; i<n; i++)
			{
			ts.add(s.nextInt());
			}

		System.out.println(ts);
	}
}
