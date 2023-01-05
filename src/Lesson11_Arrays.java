public class Lesson11_Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

//public class Arrays {
//    public static void main(String[] args) {
//        int[] numbers = new int[100];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = i + 1;
//        }
//        for (int nums: numbers) {
//            System.out.println(nums);
//        }
//    }
//}