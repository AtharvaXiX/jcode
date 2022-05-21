import java.io.*;
import java.lang.String.*;
class ass2seta2 extends Thread
{
    public static void main(String args[])
    {
        Thread t  = Thread.currentThread();
        System.out.println("Current Thread is : " + t);
        t.setName("Vrushali");
        System.out.println("After changing Name of Thread is : " + t);
        try
        {
           for(int n = 100 ; n>0 ;n--)
           {
              System.out.println(n);
              sleep(6000);
           }
       }
        catch(Exception e)
        {

         }
   }
}

