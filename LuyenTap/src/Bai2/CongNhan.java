package Bai2;

public class CongNhan extends NhanVien {
    private int soLuongSanPham;

    public CongNhan(String ten, String diaChi, int soLuongSanPham) {
        super(ten, diaChi);
        this.soLuongSanPham = soLuongSanPham;
    }

    public int getSoLuongSanPham() {
        return soLuongSanPham;
    }

    public void setSoLuongSanPham(int soLuongSanPham) {
        this.soLuongSanPham = soLuongSanPham;
    }

    @Override
    public double TinhLuong() {
        return soLuongSanPham * 40000; // Giả sử mỗi sản phẩm nhận 40000 đồng
    }

    @Override
    public void HienThi() {
        System.out.println("CongNhan{" +
                "ten='" + getTen() + '\'' +
                ", diaChi='" + getDiaChi() + '\'' +
                ", soLuongSanPham=" + soLuongSanPham +
                ", luong=" + TinhLuong() +
                '}');
    }
}

