import java.util.Scanner;

public class Factorial {

    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        System.out.println("Factorial: " + calculateFactorial(number));
    }
}
