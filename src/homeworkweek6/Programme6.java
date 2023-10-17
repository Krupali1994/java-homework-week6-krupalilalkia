package homeworkweek6;

import java.util.Scanner;
//Calculate the area of the circle

public class Programme6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any radius value of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle with radius is: " + area);
        scanner.close();

    }
}
