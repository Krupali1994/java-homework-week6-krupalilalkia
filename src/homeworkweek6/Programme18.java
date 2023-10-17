package homeworkweek6;

import java.util.Scanner;

//Java programme tp print sum of addition, multiply, subtract, divide & remainder
public class Programme18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input First number: ");
        int n1 = scanner.nextInt();
        System.out.println("Please input Second number: ");
        int n2 = scanner.nextInt();
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1 + n2));
        System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
        System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
        System.out.println(n1 + "mod" + n2 + " = " + (n1 / n2));
        scanner.close();
    }

}
