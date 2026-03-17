package view;

import entity.ImportProduct;
import java.util.Scanner;

public class ImportProductView {
    private static Scanner scanner=new Scanner(System.in);

    public static ImportProduct input(){

        String ma;

        while(true){
            System.out.println("Nhập mã Sản Phẩm (SP-XXXX)");
            ma=scanner.nextLine();
            if(ma.matches("SP-\\d{4}")) break;
            System.out.println("Sai định dạng!");
        }

        System.out.println("Tên:");
        String ten=scanner.nextLine();

        double gia;
        while(true){
            gia=Double.parseDouble(scanner.nextLine());
            if(gia>0) break;
            System.out.println("Giá >0");
        }

        int soLuong;
        while(true){
            soLuong=Integer.parseInt(scanner.nextLine());
            if(soLuong>0) break;
        }

        System.out.println("Quốc gia Sảnc Xuất:");
        String quocGia=scanner.nextLine();

        double thue;
        while(true){
            thue=Double.parseDouble(scanner.nextLine());
            if(thue>0) break;
        }

        return new ImportProduct(ma,ten,gia,soLuong,quocGia,thue);
    }
}
