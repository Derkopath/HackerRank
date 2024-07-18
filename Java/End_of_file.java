package Java;
import java.util.*;

public class End_of_file {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = 1;

        while (scan.hasNext()) {

            System.out.println(i + " " + scan.nextLine());
            i++;
        }
        scan.close();
    }
}