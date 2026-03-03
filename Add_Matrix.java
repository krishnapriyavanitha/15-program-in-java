import java.util.Scanner;

public class Add_Matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter rows of first matrix: ");
        int p = s.nextInt();

        System.out.print("Enter columns of first matrix: ");
        int q = s.nextInt();

        System.out.print("Enter rows of second matrix: ");
        int m = s.nextInt();

        System.out.print("Enter columns of second matrix: ");
        int n = s.nextInt();

        if (p == m && q == n) {
            int a[][] = new int[p][q];
            int b[][] = new int[m][n];
            int c[][] = new int[m][n];

            System.out.println("Enter elements of first matrix:");
            for (int i = 0; i < p; i++)
                for (int j = 0; j < q; j++)
                    a[i][j] = s.nextInt();

            System.out.println("Enter elements of second matrix:");
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++)
                    b[i][j] = s.nextInt();

            for (int i = 0; i < p; i++)
                for (int j = 0; j < q; j++)
                    c[i][j] = a[i][j] + b[i][j];

            System.out.println("Matrix after addition:");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++)
                    System.out.print(c[i][j] + " ");
                System.out.println();
            }
        } else {
            System.out.println("Matrix dimensions do not match.");
        }
    }
}
