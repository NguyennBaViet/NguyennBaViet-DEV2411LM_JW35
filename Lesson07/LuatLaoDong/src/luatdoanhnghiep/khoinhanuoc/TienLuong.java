package luatdoanhnghiep.khoinhanuoc;

public class TienLuong {
    public static final float BAC_TRUNG_CAP=1.55f;
    public static final float BAC_CAO_DANG=1.80f;
    public static final float BAC_DAI_HOC=2.34f;

    public static  final float LUONG_CO_BAN=2889000f;
    public static final float HE_SO_BHXH = 16;
    public static final float HE_SO_THAM_NIEN =5;

    public static double LuongCoBan(float hocVi,int namCongTac){
        double LuongCoBan = (hocVi*LUONG_CO_BAN)+namCongTac*(5*LUONG_CO_BAN/100);
        return LuongCoBan;
    }
    /**
     * Viết static method tính số tiền bảo hiểm mà công ty phải óng dựa trên số tiền lương
     * @param luong Số tiền lương nhận được
     */
    public static double soTienBaoHiem(double luong){
        return (HE_SO_BHXH/100)*luong;
    }
}
