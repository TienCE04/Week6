//Viết mã nguồn cho lớp PhongBan với các thuộc tinh và phương thức như biểu
//đồ trên cùng phương thức khởi tạo với số lượng tham số cần thiết, biết rằng:
//• Việc thêm/xóa nhân viên được thực hiện theo cơ chế của stack
//• tongLuong() trả về tổng lương của các nhân viên trong phòng.
//• inTTin() hiển thị thông tin của phòng và thông tin của các nhân viên
//trong phòng.
package Baitap;

public class Nhanvien {
    public static double Luong_Max=20000000;
    protected String tenNhanVien;
    protected double heSoLuong;
    protected double luongCoBan=750000;

    public static double getLuong_Max() {
        return Luong_Max;
    }

    public static void setLuong_Max(double Luong_Max) {
        Nhanvien.Luong_Max = Luong_Max;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public Nhanvien() {
    }

    public Nhanvien(String tenNhanVien, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.heSoLuong = heSoLuong;
    }

    public boolean tangLuong(double hs){
        if(luongCoBan*hs>Luong_Max){
            return false;
    }
        else{
            heSoLuong=hs;
            return true;
        }
}
    public  double tinhLuong(){
            double Luong=luongCoBan*heSoLuong;
            return Luong;
    }
    public void inTTin(){
        System.out.print("Ho ten nhan vien la ");
        System.out.println(tenNhanVien);
        System.out.print("He so luong cua nhan vien la ");
        System.out.println(heSoLuong);
        System.out.print("Luong co ban cua nhan vien la ");
        System.out.println(luongCoBan);
        System.out.print("Luong chinh thuc cua nhan vien la ");
        System.out.println(tinhLuong());
    }
}
