import java.util.*;
import java.util.Set;
import java.util.TreeSet;
public class ass1seta3
{
    public static void main(String args[])
    {
       Scanner s1 = new Scanner(System.in);
       Set ts = new TreeSet();
       System.out.println("How Many Colours You want : ");
       int n = s1.nextInt();
       System.out.println("Enter Colour Name  : ");
       for(int i=0;i<n;i++)
       {
          String col = s1.next();
          ts.add(col);
       }
       System.out.println("Colours are : " + ts);
    }
}
