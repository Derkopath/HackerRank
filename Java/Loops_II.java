package Java;
import java.util.*;


class Loops_II{
    public static void main(String []argh){
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Numero de consultas: ");
        int t=in.nextInt();
        in.close();
        */

        int t = 1;

        for(int i=0;i<t;i++){
            int a = 3;
            int b = 3;
            int n = 3;

            for(int j=0;j<n;j++) {

                a = a + (int)Math.pow(2,j) * b;

                System.out.print(a + " ");
            }
            System.out.println("");
        }

    }
}
