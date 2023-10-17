package homeworkweek6;

import java.util.Scanner;

public class Programme5 {

    //instance variable
    public void addition(int a, int b) {
        int answer = a + b;
        //concatenation
        System.out.println("addition of two numbers " + a + " and " + b + " is: " + answer);
    }

    //instance variable
    public void subtraction(int a, int b) {
        int answer = a - b;
        //concatenation
        System.out.println("subtraction of two numbers " + b + " and " + a + " is: " + answer);
    }

    //static variable
    public static void multiplication(int a, int b) {
        int answer = a * b;
        //concatenation
        System.out.println("multiplication of two numbers " + a + " and " + b + " is: " + answer);
    }

    //static variable
    public static void division(int a, int b) {
        int answer = a / b;
        //concatenation
        System.out.println("division of two numbers " + a + " and " + b + " is: " + answer);
    }

    //Declared main method with scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Programme5 obj = new Programme5();
        System.out.println("Enter first digit: ");
        int a = scanner.nextInt();
        System.out.println("Enter second digit: ");
        int b = scanner.nextInt();
        obj.addition(a, b);
        obj.subtraction(a, b);
        multiplication(a, b);
        division(a, b);
        scanner.close();
    }
}