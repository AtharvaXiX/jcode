import java.io.*;
import java.util.*;
public class Student
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Hashtable h=new Hashtable();
		int mno;
		String name=null;
		System.out.println("Enter the number of students: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name of the student: ");
			name=sc.next();
			System.out.println("Enter the mobile number of the student: ");
			mno=sc.nextInt();
			h.put(name, mno);
		}
		System.out.println("The Student Details Are: "+h);
	}
}

