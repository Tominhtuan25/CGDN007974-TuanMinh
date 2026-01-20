package ss4_method.bai_tap;
import java.util.Scanner;
public class SumDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của ma trận vuông :");
        int n = Integer.parseInt(sc.nextLine());
        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhâp giá trị tại phần tử thứ :" + i + j);
                matrix[i][j] = Double.parseDouble(sc.nextLine());
            }
            double sum = 0;
            for (int k = 0; k < n; k++) {
                sum += matrix[k][k];
            }
            System.out.println("Tổng của đường chéo ma trận vuông là :" + sum);
        }
    }
}
