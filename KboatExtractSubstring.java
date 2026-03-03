import java.util.Scanner;

public class KboatExtractSubstring {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = in.nextLine();

        int len = s.length();

        System.out.print("Enter start index: ");
        int n = in.nextInt();

        if (n < 0 || n >= len) {
            System.out.println("Invalid index");
            System.exit(1);
        }

        System.out.print("Enter no.of characters to extract: ");
        int m = in.nextInt();

        int substrlen = n + m;

        if (m <= 0 || substrlen > len) {
            System.out.println("Invalid no.of characters");
            System.exit(1);
        }

        String substr = s.substring(n, substrlen);
        System.out.println("Substring = " + substr);
    }
}
