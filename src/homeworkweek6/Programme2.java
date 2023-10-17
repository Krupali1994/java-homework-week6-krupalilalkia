package homeworkweek6;

public class Programme2 {
    //(1)Declared two static variables
    static int a = 50;
    static String name = "Krupali";

    //(2)Declared one static method
    public static void method1() {
        //(3)Called both static variables into static method inside print method
        System.out.println(a);
        System.out.println(name);
    }

    //(4)Declared main method
    public static void main(String[] args) {
        //(5)Called the above static method into Main method
        method1();
    }
}
