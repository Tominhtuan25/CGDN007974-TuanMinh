package service;

import entity.ImportProduct;
import repository.ImportRepository;

import java.util.List;

public class ImportProductService implements IImportProductService {
    private ImportRepository repository=new ImportRepository();

    public List<ImportProduct> findAll(){
        return repository.findAll();
    }

    public void add(ImportProduct importProduct){
        repository.add(importProduct);
    }

    public boolean delete(String maSanPham){
        return repository.delete(maSanPham);
    }
}
