import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число.");
        if (scan.nextInt() > 7) {
            System.out.println("Привет");
        }
    }
}
