import java.util.*;

public class ass1setb2
{
	public static void main(String[] args){
	Scanner s1 = new Scanner(System.in);
	HashMap hm = new HashMap();
	int rno;
        String nm;
	System.out.println("How many Students you want : ");
 	int n = s1.nextInt();

	System.out.println("Enter Roll No and name: ");
	for(int i = 0; i < n;i++)
        {
           System.out.println("Enter Student Rollno : ");
           rno = s1.nextInt();
           System.out.println("Enter Student Name : ");
           nm = s1.next();
	   hm.put(rno , nm);
	}
        
	
        System.out.println("After Sorting : ");
        TreeMap tm = new TreeMap(hm);
	System.out.println(tm);
	
		
	}

}
