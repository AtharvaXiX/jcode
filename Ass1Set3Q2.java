import java.util.*;

public class practice  
{  
    public static void main(String args[])  
    {  
        Scanner sc=new Scanner(System.in);
        LinkedList l=new LinkedList();
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
		{
			l.add(sc.next());
		}
        System.out.println("The elements are: "+l);
        System.out.println("Enter the element to be added first: ");
        l.addFirst(sc.nextInt());
        System.out.println("The elements are: "+l);
        l.removeLast();
        System.out.println("The last element is removed: ");
        System.out.println("The elements are: "+l);
        
        System.out.println("The size is: "+l.size());
    }  
} 
