package ss4_method.bai_tap;
import java.util.Scanner;
public class SumColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài dòng của mảng 2 chiều :");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập độ dài cột của mảng 2 chiều :");
        int cols = Integer.parseInt(sc.nextLine());
        double[][] array = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Nhâp giá trị tại phần tử thứ :" + i + j);
                array[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
        System.out.println("Nhập vị trí cột(column) cần tính tổng");
        int col_index = Integer.parseInt(sc.nextLine());

        if(col_index < 0 || col_index > cols) {
            System.out.println("Vị trí cột cần tính tổng không hợp lệ");
            return;
        }
        double sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += array[i][col_index];
        }
        System.out.println("Tổng của ca phần tử có trong cột " +col_index + " là " + sum);
    }
}
