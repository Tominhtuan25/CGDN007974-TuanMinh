package ss2_loop.bai_tap;
import java.util.Scanner;
public class DisplayRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài của hình chữ nhật :");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chiều rộng của hình chữ nhật :");
        int width = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
