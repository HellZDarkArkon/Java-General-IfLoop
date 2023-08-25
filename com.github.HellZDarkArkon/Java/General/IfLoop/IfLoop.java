package Java.General.IfLoop;

public class IfLoop {
    public static void main(String[] args) {
        int i = 3;
        float f = 0.01f;
        double d = 0.000001;
        char c = 'c';
        String str = "Hello";
        boolean b = true;

        if(i == 3) {
            System.out.println(str);
        } else {
            System.out.println("Goodbye");
        }
        if(f <= 0.01f) {
            System.out.println(str);
        } else {
            System.out.println("Goodbye");
        }
        if (d < 1.0) {
            System.out.println(str);
        } else {
            System.out.println("Goodbye");
        }
        if(c == 'c') {
            System.out.println(str);
        } else {
            System.out.println("Goodbye");
        }
        if (str == "Hello") {
            System.out.println(str);
        } else {
            System.out.println("Goodbye");
        }
        if (b != true) {
            System.out.println(str);
        }
        else {
            System.out.println("Goodbye");
        }
    }
}