import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        sc.nextLine();

        String fruits[] = new String[n];

        System.out.println("Enter the Strings:");
        for (int i = 0; i < n; i++) {
            fruits[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (fruits[i].compareTo(fruits[j]) > 0) {
                    String temp = fruits[i];
                    fruits[i] = fruits[j];
                    fruits[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(fruits));
    }
}
