package homeworkweek6;

import java.util.Scanner;

//Java programme to calculate the Average
public class Programme13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter First Number: ");
        int number1 = scanner.nextInt();
        System.out.println("Please enter Second Number: ");
        int number2 = scanner.nextInt();
        System.out.println("Please enter Third Number: ");
        int number3 = scanner.nextInt();
        System.out.println("Average of the Three numbers is :" + (number1 + number2 + number3));
        scanner.close();
    }
}
