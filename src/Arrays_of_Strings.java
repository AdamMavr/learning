import java.util.Scanner;

public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 10;
        String[] names = new String[4];
        names[0] = "Adam";
        names[1] = "Vella";
        names[2] = "Elena";
        names[3] = "Sirius";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("");
        for (String familyNames:names) {
            System.out.println(familyNames);
        }

        int[] nums = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number: nums) {
            sum += number;
        }
        System.out.println(sum);

        int value = 0;
        String word;

    }
}
