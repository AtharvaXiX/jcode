import java.util.*;
class ass1seta2
{
   public static void main(String args[])
   {
       Scanner s1 = new Scanner(System.in);
       System.out.println("How Many Friend You want : ");
       int n = s1.nextInt();
       System.out.println("Enter Friends Name : ");
       LinkedList a1 = new LinkedList();
       for(int i=1; i<=n; i++)
       {
	   String name = s1.next();
           a1.add(name);
       }
       System.out.println("Dislay Friends Name : ");
       Iterator it = a1.iterator();
       while(it.hasNext())
       {
           System.out.println(it.next());
       }
   }
}

