import java.io.*;
import java.lang.String.*;
class multi extends Thread
{
    String msg = "";
    int n;
    multi(String msg , int n)
    {
        this.msg = msg;
        this.n = n;
    }
    public void run()
    {
        try
        {
           for(int i=1;i<=n;i++)
           {
              System.out.println(msg + "" + i + "times");
           }
           System.out.println("\n");
        }
        catch(Exception e)
        {

         }
   }
}
class ass2seta1
{
    public static void main(String args[])
    {
     
    //int n = Integer.parseInt(a[0]);
    multi t1 = new multi("COVID19",10);
    t1.start();
    multi t2 = new multi("LockDown 2020",20);
    t2.start();
    multi t3 = new multi("Vaccinated 2021",30);
    t3.start();
    }
} 
