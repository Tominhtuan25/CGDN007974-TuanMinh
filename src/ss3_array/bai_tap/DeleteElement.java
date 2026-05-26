package ss3_array.bai_tap;
import java.util.Scanner;
public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập giá trị cho phần tử thứ " + i);
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng đã tạo là :");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("Nhập phần tử cần xoá: ");
        int a = Integer.parseInt(sc.nextLine());

        boolean found = false;
        int index_delete = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == a) {
                found = true;
                index_delete = i;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy phần tử " + a + " trong mảng.");
        } else {
            for (int i = index_delete; i < n-1; i++) {
                array[i] = array[i+1];

            }
            n--;
            System.out.println("Mảng sau khi xoá là :");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
