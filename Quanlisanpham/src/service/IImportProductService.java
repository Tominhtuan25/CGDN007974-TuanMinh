package service;

import entity.ImportProduct;

import java.util.List;

public interface IImportProductService {
    List<ImportProduct> findAll();

    void add(ImportProduct importProduct);

    boolean delete(String maSanPham);
}
