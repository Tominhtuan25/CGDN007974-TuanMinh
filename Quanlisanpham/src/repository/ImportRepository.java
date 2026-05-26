package repository;

import entity.ImportProduct;
import util.ReadAndWriteFile;

import java.util.*;

public class ImportRepository implements IImportRepository {

    private final String IMPORT_FILE = "data/ImportProducts.csv";

    @Override
    public List<ImportProduct> findAll() {

        List<String> list = ReadAndWriteFile.readFileCSVToStringList(IMPORT_FILE);
        List<ImportProduct> result = new ArrayList<>();

        for (String line : list) {
            String[] arr = line.split(",");
            result.add(new ImportProduct(
                    arr[0], arr[1],
                    Double.parseDouble(arr[2]),
                    Integer.parseInt(arr[3]),
                    arr[4],
                    Double.parseDouble(arr[5])
            ));
        }

        return result;
    }

    @Override
    public void add(ImportProduct importProduct) {
        List<String> data = new ArrayList<>();
        data.add(importProduct.getInfoToCSV());
        ReadAndWriteFile.writeStringListToCSV(IMPORT_FILE, data, true);
    }

    @Override
    public boolean delete(String maSanPham) {

        List<ImportProduct> list = findAll();

        boolean xoa = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaSanPham().equalsIgnoreCase(maSanPham)) {
                list.remove(i);
                xoa = true;
                i--;

                List<String> data = new ArrayList<>();
                for (ImportProduct importProduct : list) {
                    data.add(importProduct.getInfoToCSV());

                }

                ReadAndWriteFile.writeStringListToCSV(IMPORT_FILE, data, false);

                return xoa;
            }
        }
        return xoa;
    }
}