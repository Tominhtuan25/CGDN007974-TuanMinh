package entity;

public abstract class Product {

    protected String maSanPham;
    protected String tenSanPham;
    protected double gia;
    protected int soLuong;
    protected String quocGiaSanXuat;

    public Product(){}

    public Product(String maSanPham,String tenSanPham,double gia,int soLuong,String quocGiaSanXuat){
        this.maSanPham=maSanPham;
        this.tenSanPham=tenSanPham;
        this.gia=gia;
        this.soLuong=soLuong;
        this.quocGiaSanXuat=quocGiaSanXuat;
    }

    public String getMaSanPham(){
        return maSanPham;
    }

    public String getTenSanPham(){
        return tenSanPham;
    }

    public abstract String getInfoToCSV();

    @Override
    public String toString(){
        return "maSanPham='"+maSanPham+"', tenSanPham='"+tenSanPham+"', gia="+gia+
                ", soLuong="+soLuong+", quocGiaSanXuat='"+quocGiaSanXuat+"'";
    }
}