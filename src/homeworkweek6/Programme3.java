package homeworkweek6;

public class Programme3 {
    //(1)Declared one instance and one static variable
    int a = 50;
    static String name = "Krupali";

    //(2)Declared one instance method
    public void method1() {
        //(4)Called both variables into instance method
        System.out.println(a);
        System.out.println(name);
    }

    //(3)Declared one static method
    public static void staticmethod() {
        //(4)Called both variables into static method
        Programme3 obj = new Programme3();
        System.out.println(obj.a);
        System.out.println(name);
    }

    //(5)Declared one main method
    public static void main(String[] args) {
        //(6)Called both methods into main method
        Programme3 obj = new Programme3();
        obj.method1();
        staticmethod();
    }

}
