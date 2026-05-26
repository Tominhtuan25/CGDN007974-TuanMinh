package ss3_array.bai_tap;
import java.util.Scanner;
public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] array = new int[n+1];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập giá trị cho phần tử thứ " + i);
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng đã tạo là :");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("Nhập phần tử cần chèn: ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập vị trí cần chèn: ");
        int index = Integer.parseInt(sc.nextLine());
        if (index < 0 || index > n){
            System.out.println("Không chèn được phần tử vào mảng!");
        } else {
            for (int i = n; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = a;
            n++;
            System.out.println("Mảng sau khi chèn:");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
