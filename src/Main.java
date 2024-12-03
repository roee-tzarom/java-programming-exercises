import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = scanner.nextInt();
        test(n);
    }

    public static void test(int n) {
        boolean prime = true;
        if (n <= 1) {
            prime = false;
        } else if (n % 2 == 0 && n != 2) {
            prime = false;
        } else {
            for (int i = 3; i < n; i += 2) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if (prime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
