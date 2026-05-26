package repository;

import entity.ImportProduct;
import java.util.List;

public interface IImportRepository {

    List<ImportProduct> findAll();

    void add(ImportProduct importProduct);

    boolean delete(String maSanPham);
}