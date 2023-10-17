package homeworkweek6;

import java.util.Scanner;

//Java programme to convert given string into lower case
public class Programme19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the string: ");
        String statement = scanner.nextLine();
        statement = statement.toLowerCase();
        System.out.println(statement);
        scanner.close();
    }
}
