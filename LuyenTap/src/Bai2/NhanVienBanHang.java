package Bai2;

public class NhanVienBanHang extends NhanVien {
    private int soLuongBanDuoc;

    public NhanVienBanHang(String ten, String diaChi, int soLuongBanDuoc) {
        super(ten, diaChi);
        this.soLuongBanDuoc = soLuongBanDuoc;
    }

    public int getSoLuongBanDuoc() {
        return soLuongBanDuoc;
    }

    public void setSoLuongBanDuoc(int soLuongBanDuoc) {
        this.soLuongBanDuoc = soLuongBanDuoc;
    }

    @Override
    public double TinhLuong() {
        return soLuongBanDuoc * 50000; // Giả sử mỗi sản phẩm bán được nhận 50000 đồng
    }

    @Override
    public void HienThi() {
        System.out.println("NhanVienBanHang{" +
                "ten='" + getTen() + '\'' +
                ", diaChi='" + getDiaChi() + '\'' +
                ", soLuongBanDuoc=" + soLuongBanDuoc +
                ", luong=" + TinhLuong() +
                '}');
    }
}

