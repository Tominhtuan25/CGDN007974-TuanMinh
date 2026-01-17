package ss3_array.bai_tap;
import java.util.Scanner;
public class FindMaxIn2dArray {
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
        double max = array[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("Phần tử lớn náất trong mảng 2 chiều là :" +max);
        System.out.println("Toạ độ của phần tử lớn nhất trong mảng 2 chiều đó là : " + maxRow + "," + maxCol);
    }

}
