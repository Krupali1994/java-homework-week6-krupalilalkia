package homeworkweek6;

import java.util.Scanner;

//Java programme to convert decimal to binary number
public class Programme17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a decimal number: ");
        double decimal = scanner.nextDouble();
        String binary = Integer.toString((int) decimal);
        System.out.println("Result is Binary number is: " + Integer.toBinaryString(Integer.parseInt(binary)));
        scanner.close();
    }
}
