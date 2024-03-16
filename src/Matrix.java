import java.util.Scanner;
import java.util.Random;
public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк (M): ");
        int M = scanner.nextInt();
        System.out.print("Введите количество столбцов (N): ");
        int N = scanner.nextInt();


        int[][] matrix1 = new int[M][N];
        int[][] matrix2 = new int[N][M];

        fillRandom(matrix1);
        fillRandom(matrix2);




        System.out.println("Первая матрица " + M + " x " + N + ":");
        printMatrix(matrix1);
        System.out.println("Вторая матрица " + N + " x " + M + " (транспонированная первая):");
        printMatrix(matrix2);

        scanner.close();
    }

    private static void fillRandom(int[][]matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
            }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


