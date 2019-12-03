import java.util.Scanner;
public class Task2_8 {
    public static void
    main(String[] args) {
        Scanner in = new
                Scanner(System.in);
        System.out.println("Введите 3 числа");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a==c || a==b || b==c) {
            System.out.println("No"); }
        else {
            if ((a > b) | (a > c)) {
                if (a > b & a > c) {
                    if (b > c) {
                        System.out.println(b); }
                    else {
                        System.out.println(c); } }
                else {
                    System.out.println(a); } }
            else {
                if (b > c) {
                    System.out.println(c); }
                else {
                    System.out.println(b);
                }
            }
        }
    }
}