package homeworkweek6;

import java.util.Scanner;

//Java programme to swap two variables
public class Programme15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first variable: ");
        int a = scanner.nextInt();
        System.out.println("Please enter the second variable: ");
        int b = scanner.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("Variables before swapping: a, b = " + b + "," + a);
        System.out.println("Variables after swapping: b, a = " + a + "," + b);
        scanner.close();
    }
}
