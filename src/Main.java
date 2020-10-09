import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array size n: ");

        int n = input.nextInt();

        System.out.println("The random array is");

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = ((int)(Math.random() + 0.5));
            }
        }

        int maxRow = 0;
        int maxCol = 0;

        int previousMaxRow = 0;
        int previousMaxCol = 0;

        for (int i = 0; i < n; i++) {
            int rowCount = 0;
            int colCount = 0;

            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) rowCount++;
                if (matrix[j][i] == 1) colCount++;

                if (rowCount > previousMaxRow) {
                   maxRow = i + 1;
                    previousMaxRow = rowCount;
                }

                if (colCount > previousMaxCol) {
                    maxCol = i + 1;
                    previousMaxCol = colCount;
                }

                System.out.print(matrix[i][j]);
            }
            System.out.println();

        }
        System.out.println("The max row is: " + maxRow);
        System.out.println("The max col is: " + maxCol);

    }
}
