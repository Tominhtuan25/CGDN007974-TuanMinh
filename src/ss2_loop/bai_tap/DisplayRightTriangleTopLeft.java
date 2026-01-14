package ss2_loop.bai_tap;
import java.util.Scanner;
public class DisplayRightTriangleTopLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều cao của hình tam giác vuông : ");
        int height = Integer.parseInt(scanner.nextLine());
        for (int i = height; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
