package ss4_class.bai_tap;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập a: ");
            double a = scanner.nextDouble();

            System.out.print("Nhập b: ");
            double b = scanner.nextDouble();

            System.out.print("Nhập c: ");
            double c = scanner.nextDouble();

            if (a == 0) {
                System.out.println("Đây không phải phương trình bậc hai!");
                return;
            }

            QuadraticEquation equation = new QuadraticEquation(a, b, c);

            double delta = equation.getDiscriminant();

            System.out.println("Delta = " + delta);

            if (delta > 0) {
                System.out.println("Phương trình có 2 nghiệm:");
                System.out.println("Nghiệm 1: " + equation.getRoot1());
                System.out.println("Nghiệm 2: " + equation.getRoot2());
            } else if (delta == 0) {
                System.out.println("Phương trình có 1 nghiệm kép:");
                System.out.println("Nghiệm: " + equation.getRoot1());
            } else {
                System.out.println("The equation has no roots");
            }
        }
    }
