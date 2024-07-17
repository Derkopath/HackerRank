package Java;
import java.util.*;


public class Datatypes {

    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int intMin = (int)Math.pow(-2, 31);
        int intMax = (int)Math.pow(2, 31);
        long longMin = (long)Math.pow(-2, 63);
        long longMax = (long)Math.pow(2, 63);

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code

                //Short
                if(x>=-32768 && x<=32767)System.out.println("* short");

                //int
                if(x>=intMin && x<=intMax)System.out.println("* int");

                //long
                if(x<=longMax)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



