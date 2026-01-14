package ss1_introduction.bai_tap;
import java.util.Scanner;
public class ExchangeMoney {
    public static void main(String[] args) {
        double rate = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền usd cần đổi ");
        usd = Double.parseDouble(scanner.nextLine());
        double vnd = rate * usd;
        System.out.println("Số vnd đã được đổi từ usd là :" +vnd);
    }
}
