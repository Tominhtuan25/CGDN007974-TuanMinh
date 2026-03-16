package entity;

public class XeTuanTraMatTrang extends PhuongTien {
        private int capDoBucXa;

        public XeTuanTraMatTrang() {

        }
        public XeTuanTraMatTrang(String soHieuDangKi, String hangSanXuat, int namCheTao, String nguoiDieuPhoi, int capDoBucXa) {
                super(soHieuDangKi, hangSanXuat, namCheTao, nguoiDieuPhoi);
                this.capDoBucXa = capDoBucXa;
        }

        public float getCapDoBucXa() {
                return capDoBucXa;
        }

        public void setCapDoBucXa(int capDoBucXa) {

                this.capDoBucXa = capDoBucXa;
        }

        @Override
        public String getInfoToCSV() {
                return this.getSoHieuDangKi()+ ""+this.getHangSanXuat()+ ""+this.getNamCheTao()+ ""+this.getNguoiDieuPhoi()+ ""+this.getCapDoBucXa();
        }

        @Override
        public String toString() {
                return "XeTuanTraMatTrang{" +super.toString()
                        + "CapDoBucXa=" + capDoBucXa+
                        '}';
        }
}
