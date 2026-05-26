package entity;

public class ExportProduct extends Product {

    private String quocGiaNhapSanPham;

    public ExportProduct(){}

    public ExportProduct(String maSanPham,String tenSanPham,double gia,int soLuong,String quocGiaSanXuat,String quocGiaNhapSanPham){
        super(maSanPham,tenSanPham,gia,soLuong,quocGiaSanXuat);
        this.quocGiaNhapSanPham=quocGiaNhapSanPham;
    }

    @Override
    public String getInfoToCSV(){
        return maSanPham+","+tenSanPham+","+gia+","+soLuong+","+quocGiaSanXuat+","+quocGiaNhapSanPham;
    }

    @Override
    public String toString(){
        return "ExportProduct{"+super.toString()+", quocGiaNhap='"+quocGiaNhapSanPham+"'}";
    }
}