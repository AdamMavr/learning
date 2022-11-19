public class Multidimensional_arrays {
    public static void main (String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 5, 6}, {75, 523, 654, 655, 66, 65, 44}, {43, 234}}; // двумерный массив = массив массивов
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
