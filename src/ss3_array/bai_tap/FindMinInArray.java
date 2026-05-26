package ss3_array.bai_tap;
import java.util.Scanner;
public class FindMinInArray {
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
        int min = array[0];
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng đó là : " + min);
        System.out.println("Vị trí phần tử nhỏ nhất đó là :" +index);
    }
}
