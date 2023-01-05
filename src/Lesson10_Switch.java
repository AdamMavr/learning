 import java.util.Scanner;

public class Lesson10_Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько лет");
        int age = scan.nextInt();
        switch (age) {
            case 0:
                System.out.println("Ты родился");
                break;
            case 7:
                System.out.println("Ты пошёл в школу");
                break;
            case 18:
                System.out.println("Ты закончил школу");
                break;
            case 70:
                System.out.println("Ты на пенсии");
                break;
            default:
                System.out.println("Ничего не подошло");
        }
    }
}

//import java.util.Scanner;
//
//public class Switch {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Сколько лет");
//        String  age = scan.nextLine();
//        switch (age) {
//            case "Ноль":
//                System.out.println("Ты родился");
//                break;
//            case "Семь":
//                System.out.println("Ты пошёл в школу");
//                break;
//            case "Восемнадцать":
//                System.out.println("Ты закончил школу");
//                break;
//            case "Семьдесят":
//                System.out.println("Ты на пенсии");
//                break;
//            default:
//                System.out.println("Ничего не подошло");
//        }
//    }
//}