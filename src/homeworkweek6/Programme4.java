package homeworkweek6;

public class Programme4 {
    //(1)Declared two instance and two static variables
    int a = 50;
    String name = "Krupali";
    static int b = 100;
    static String surname = "Lalkia";

    //(2)Declared one instance method
    public void method1() {
        //(4)Called all variables into instance method
        System.out.println(a);
        System.out.println(name);
        Programme4 obj = new Programme4();
        System.out.println(obj.b);
        System.out.println(obj.surname);
    }

    //(3)Declared one static method
    public static void staticmethod() {
        //(4)Called both variables into static method
        Programme4 obj = new Programme4();
        System.out.println(obj.a);
        System.out.println(obj.name);
        System.out.println(b);
        System.out.println(surname);
    }

    //(5)Declared main method
    public static void main(String[] args) {
        //(6)Called both method into main method
        Programme4 obj = new Programme4();
        obj.method1();
        staticmethod();
    }
}
