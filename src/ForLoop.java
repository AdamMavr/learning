import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        do {
            System.out.println("Угадайте число");
            num = scan.nextInt();

        } while (num != 66);
        System.out.println("Правильно");
    }
}
