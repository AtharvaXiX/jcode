import java.util.*;
public class ass1seta4
{
    public static void main(String args[])
    {
        Scanner s1 = new Scanner(System.in);
        Hashtable hash = new Hashtable();
        String nm ;
        int mob;
        System.out.println("How Many Student Name you want  : ");
        int n = s1.nextInt();
        System.out.println("Enter Student Name and Mobile Number  : ");
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Student Name : ");
            nm = s1.next();
            System.out.println("Enter Student Mobile Number : ");
            mob = s1.nextInt();
            hash.put(nm , mob);
        }
           System.out.println( hash);
      
    }
}

