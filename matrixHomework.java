import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class matrixHomework {
    public static void main(String[] args) {
        createMatrix(15, 15);}

    public static void createMatrix(int m, int n) {
        int[][] matrix = new int[m][n];
        int value = -121;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = value;
                value ++;}}
        printMatrix(matrix);
        createNegativeAndPositiveList(matrix,m,n);
        }



    private static void createNegativeAndPositiveList(int[][] matrix, int m, int n) {
        int negativeCount = 0;
        int positiveCount = 0;
        ArrayList<Integer> negative = new ArrayList<Integer>();
        ArrayList<Integer> positive = new ArrayList<Integer>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j]<0){
                    negativeCount ++;
                    negative.add(matrix[i][j]);}
                else if (matrix[i][j]>0) {
                    positiveCount ++;
                    positive.add(matrix[i][j]);

                }
            }
        }
        System.out.println("the negative numbers:"+negativeCount);
        System.out.println(negative);
        System.out.println("the positive numbers:"+positiveCount);
        System.out.println(positive);}

    public static void printMatrix(int[][] matrix) {
        for (int[] array : matrix) {
            for (int num : array) {
                System.out.print(String.format("%5d", num));}
            System.out.println();}}

/////////////////////////////////////////////////// нашёл метод java.util.concurrent.ThreadLocalRandom но реализовать не получилось :(

    public static int[][] generateRandomArray(int y) {
        int[] array = ThreadLocalRandom.current().ints().toArray();
        System.out.println("Generated random array: " + Arrays.toString(array));
        return new int[][]{array};
    }

}
