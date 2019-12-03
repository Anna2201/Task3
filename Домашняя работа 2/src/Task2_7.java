import java.util.Scanner;

public class Task2_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение переменных a и b");
        int a = in.nextInt();
        int b = in.nextInt();
        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
