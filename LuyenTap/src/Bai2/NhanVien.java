package Bai2;
    public abstract class NhanVien {
        private String ten;
        private String diaChi;

        public NhanVien(String ten, String diaChi) {
            this.ten = ten;
            this.diaChi = diaChi;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getDiaChi() {
            return diaChi;
        }

        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }

        public abstract double TinhLuong();
        public abstract void HienThi();
    }
