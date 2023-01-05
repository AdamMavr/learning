import java.util.Scanner;

public class Lesson8_DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value;
        do {
            System.out.println("Введи число");
            value = scan.nextInt();
        } while (value != 5);
        System.out.println("Вы ввели 5");
    }
}
