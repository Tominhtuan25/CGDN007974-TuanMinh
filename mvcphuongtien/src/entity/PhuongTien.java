package entity;

public abstract class PhuongTien {
    private String soHieuDangKi;
    private String hangSanXuat;
    private int namCheTao;
    private String nguoiDieuPhoi;

    public PhuongTien() {
    }

    public PhuongTien(String soHieuDangKi, String hangSanXuat, int namCheTao, String nguoiDieuPhoi) {
        this.soHieuDangKi = soHieuDangKi;
        this.hangSanXuat = hangSanXuat;
        this.namCheTao = namCheTao;
        this.nguoiDieuPhoi = nguoiDieuPhoi;
    }

    public String getSoHieuDangKi() {
        return soHieuDangKi;
    }

    public void setSoHieuDangKi(String soHieuDangKi) {
        this.soHieuDangKi = soHieuDangKi;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getNamCheTao() {
        return namCheTao;
    }

    public void setNamCheTao(int namCheTao) {
        this.namCheTao = namCheTao;
    }

    public String getNguoiDieuPhoi() {
        return nguoiDieuPhoi;
    }

    public void setNguoiDieuPhoi(String nguoiDieuPhoi) {
        this.nguoiDieuPhoi = nguoiDieuPhoi;
    }
    public abstract String getInfoToCSV();

    @Override
    public String toString() {
        return "PhuongTien{" +
                "soHieuDangKi='" + soHieuDangKi + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", namCheTao=" + namCheTao +
                ", nguoiDieuPhoi='" + nguoiDieuPhoi + '\'' +
                '}';
    }
}
