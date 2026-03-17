package controller;

import service.ImportProductService;
import service.IImportProductService;
import entity.ImportProduct;
import view.ImportProductView;
import exception.NotFoundProductException;

import java.util.Scanner;

public class ProductController {

   private IImportProductService importService = new ImportProductService();

    public void menu() {
       Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Thêm\n2. Xóa\n3. Hiển thị\n4. Tìmm\n5. Thoát");
            int choice;
            try {
                String input = sc.nextLine();

                if (input.trim().isEmpty()) {
                    System.out.println("Không được để trống!");
                    continue;
                }

                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Phải nhập số!");
                continue;
            }

            switch (choice) {
                case 1:
                    // Thêm sản phẩm import
                    ImportProductView view = new ImportProductView();
                    ImportProduct importProduct = view.input();
                    importService.add(importProduct);
                    break;

                case 2:
                    try {
                        System.out.print("Nhap ma san pham: ");
                        String maSanPham = sc.nextLine();

                        boolean found = importService.delete(maSanPham);

                        if (!found) {
                            throw new NotFoundProductException("San pham khong ton tai");
                        }

                        System.out.println("Da xoa!");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    // Hiển thị danh sách
                    importService.findAll().forEach(System.out::println);
                    break;

                case 4:
                    System.out.print("Nhập từ khoá: ");
                    String tuKhoa = sc.nextLine();

                    importService.findAll().forEach(p -> {
                        if (p.getMaSanPham().contains(tuKhoa) || p.getTenSanPham().contains(tuKhoa)) {
                            System.out.println(p);
                        }
                    });
                    break;

                case 5:
                    return;
            }
        }
    }
}