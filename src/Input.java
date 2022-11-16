import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int value = scan.nextInt();
        System.out.println("Вы ввели: " + value);
    }
}
