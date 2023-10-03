import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целые числа, разделяя их пробелом: ");
        String[] input = scan.nextLine().split(" ");
        int[] array = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        System.out.println("Числа, кратные 3:");
        divisibleBy3(array);
    }

    private static void divisibleBy3(int[] array) {
        for (int i : array) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
