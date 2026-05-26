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
            System.out.println("------------Quản lý sản phẩm-------------" +
                    "\n 1.Thêm Mới" +
                    "\n 2.Xoá" +
                    "\n 3.Xem danh sách các sản phẩm" +
                    "\n 4.Tìm kiếm" +
                    "\n 5.Thoát");
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