package Java;

import java.util.Scanner;

public class Static_Initializer_Block {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Breadth: ");
        int b = scan.nextInt();

        System.out.print("Height: ");
        int h = scan.nextInt();
        scan.close();

        try {
            if (b > 0 && h > 0) {
                int a = b * h;
                System.out.println(a);
            } else {
                throw new java.lang.Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
