package homeworkweek6;

public class Programme1 {
    //(1)Declared two variables
    int a = 50;
    String name = "Krupali";

    //(2)Declared one instance method
    public void method1() {
        //(3)Called both instance variables into instance method inside print method
        System.out.println(a);
        System.out.println(name);
    }

    //(4)Declared main method
    public static void main(String[] args) {
        //(5)Called the above instance method into Main method
        Programme1 obj = new Programme1();
        obj.method1();
    }
}
