package homeworkweek6;

import java.util.Scanner;

//Calculated the Area of the Triangle
public class Programme8 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Scanner h = new Scanner(System.in);
        System.out.println("Enter the length of the triangle: ");
        int length = l.nextInt();
        System.out.println("Enter the height of the triangle: ");
        int height = h.nextInt();
        int answer = (length * height / 2);
        System.out.println("Area of the Triangle is: " + answer);
        l.close();
        h.close();
    }
}
