package ss4_method.bai_tap;
import java.util.Scanner;
public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi String bất kì");
        String str = sc.nextLine();
        System.out.println("Nhập kí tự cần đếm");
        char x = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == x) {
                count++;
            }
        }
        System.out.println("Tổng sô kí tự : " + x + "có trong chuỗi là :" + count);
    }
}
