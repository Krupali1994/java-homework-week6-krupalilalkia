package homeworkweek6;

import java.util.Scanner;

//Programme to convert Upper case into Lower case
public class Programme9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter anything in Upper case: ");
        String string1 = scanner.nextLine();
        String string2 = string1.toLowerCase();
        System.out.println("Converted into Lower case: " + string2);
        scanner.close();
    }
}
