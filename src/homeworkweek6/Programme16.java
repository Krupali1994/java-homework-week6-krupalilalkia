package homeworkweek6;

import java.util.Scanner;

//Java programme to add two binary numbers
public class Programme16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter First binary digit: ");
        String x = scanner.nextLine();
        System.out.println("Please enter Second binary digit: ");
        String y = scanner.nextLine();
        int number1 = Integer.parseInt(x, 2);
        int number2 = Integer.parseInt(y, 2);
        int result = number1 + number2;
        System.out.println("Result of binary: " + Integer.toBinaryString(result));
        scanner.close();

    }
}

