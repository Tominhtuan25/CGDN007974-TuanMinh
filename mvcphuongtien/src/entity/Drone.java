package entity;

public class Drone extends PhuongTien {
    private float tamBayToiDa;

    public Drone() {
    }
    public Drone(String soHieuDangKi, String hangSanXuat, int namCheTao, String nguoiDieuPhoi, float tamBayToiDa) {
        super(soHieuDangKi, hangSanXuat, namCheTao, nguoiDieuPhoi);
        this.tamBayToiDa = tamBayToiDa;
    }


    public float getTamBayToiDa() {
        return tamBayToiDa;
    }

    public void setTamBayToiDa(float tamBayToiDa) {
        this.tamBayToiDa = tamBayToiDa;
    }

    @Override
    public String getInfoToCSV() {
        return this.getSoHieuDangKi()+ ""+this.getHangSanXuat()+ ""+this.getNamCheTao()+ ""+this.getNguoiDieuPhoi()+ ""+this.getTamBayToiDa();
    }

    @Override
    public String toString() {
        return "Drone{" +super.toString()
                + "tamBayToiDa=" + tamBayToiDa+
                '}';
    }
}
