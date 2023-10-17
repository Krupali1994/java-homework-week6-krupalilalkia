package homeworkweek6;

import java.util.Scanner;

//Convert the temperature - Fahrenheit to Celsius
public class Programme7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the temperature in Fahrenheit");
        double Fahrenheit = scanner.nextInt();
        double celsius = (Fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius is: " + celsius);
        scanner.close();
    }
}

