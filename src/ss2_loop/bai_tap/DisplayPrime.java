package ss2_loop.bai_tap;
import java.util.Scanner;
public class DisplayPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers: ");
        int num = Integer.parseInt(sc.nextLine());
        int count = 0;
        int N = 2;
        while (count < num) {
            if (isPrime(N)) {
                System.out.println(N + " ");
                count++;
            }
            N++;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}