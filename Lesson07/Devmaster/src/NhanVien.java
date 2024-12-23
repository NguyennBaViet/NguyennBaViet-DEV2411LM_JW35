import luatdoanhnghiep.khoinhanuoc.*;


public class NhanVien {
    public static void main(String[] args) {
        int tham_nien_cong_tac=8;
        double luong =TienLuong.LuongCoBan(TienLuong.BAC_CAO_DANG,tham_nien_cong_tac);
        System.out.println("Luong NV: " +luong);
        double bhxh = TienLuong.BAC_CAO_DANG;
        System.out.println("Bao hiem xa hoi: " + bhxh);
    }
}
