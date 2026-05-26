package entity;

public class ImportProduct extends Product {

    private double thueNhapKhau;

    public ImportProduct(){}

    public ImportProduct(String maSanPham,String tenSanPham,double gia,int soLuong,String quocGiaSanXuat,double thue){
        super(maSanPham,tenSanPham,gia,soLuong,quocGiaSanXuat);
        this.thueNhapKhau=thue;
    }

    @Override
    public String getInfoToCSV(){
        return maSanPham+","+tenSanPham+","+gia+","+soLuong+","+quocGiaSanXuat+","+thueNhapKhau;
    }

    @Override
    public String toString(){
        return "ImportProduct{"+super.toString()+", thue="+thueNhapKhau+"}";
    }
}