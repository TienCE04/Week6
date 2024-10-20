//• Viết mã nguồn cho lớp PhongBan với các thuộc tinh và phương thức như biểu
//đồ trên cùng phương thức khởi tạo với số lượng tham số cần thiết, biết rằng:
//• Việc thêm/xóa nhân viên được thực hiện theo cơ chế của stack
//• tongLuong() trả về tổng lương của các nhân viên trong phòng.
//• inTTin() hiển thị thông tin của phòng và thông tin của các nhân viên
//trong phòng.
package Baitap;

import Baitap.Nhanvien;
import java.util.Arrays;
import java.util.Stack;

public class Phongban extends Nhanvien{
     private String tenPhongBan;
     private int soNhanVien;
     public static int SoNhanVien_Max=100;
     private Nhanvien[] dsNhanVien;
    public Phongban(String tenPhongBan, int soNhanVien) {
        this.tenPhongBan = tenPhongBan;
        this.soNhanVien = soNhanVien;
        this.dsNhanVien=new Nhanvien[soNhanVien];
    }
   
    public Phongban() {
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public int getSoNhanVien() {
        return soNhanVien;
    }

    public void setSoNhanVien(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }

    public static int getSoNhanVien_Max() {
        return SoNhanVien_Max;
    }

    public static void setSoNhanVien_Max(int SoNhanVien_Max) {
        Phongban.SoNhanVien_Max = SoNhanVien_Max;
    }

    public Nhanvien[] getDsNhanVien() {
        return dsNhanVien;
    }

    public void setDsNhanVien(Nhanvien[] dsNhanVien) {
        this.dsNhanVien = dsNhanVien;
    }
    
    
    
    public void themNhanVien(Nhanvien nv){
        Nhanvien[] listnv=new Nhanvien[soNhanVien+1];
       for(int i=0;i<dsNhanVien.length;i++){
           listnv[i]=dsNhanVien[i];
       }
       listnv[soNhanVien]=nv;
       dsNhanVien=listnv;
       soNhanVien++;
    }
    public void xoaNhanVien(){
        Nhanvien[] listnv=new Nhanvien[soNhanVien-1];
       for(int i=0;i<dsNhanVien.length-1;i++){
           listnv[i]=dsNhanVien[i];
       }
       dsNhanVien=listnv;
       soNhanVien--;
    }
    public double tongLuong(){
        double tong=0;
      for (int i = 0; i < soNhanVien; i++) {
        if (dsNhanVien[i] != null) { // Kiểm tra nếu phần tử không null
            tong += dsNhanVien[i].tinhLuong();
        }
    }
   
        return tong;   
}
   
     @Override
    public void inTTin(){
         System.out.print("Ten phong ban la ");
         System.out.println(tenPhongBan);
         System.out.print("So luong nhan vien la ");
         System.out.println(soNhanVien);
         System.out.println("-------------------");
      for(int i=0;i<dsNhanVien.length;i++){       
         if (dsNhanVien[i] != null) { // Kiểm tra nếu nhân viên không null
            dsNhanVien[i].inTTin();
            System.out.println("-------------------");
        }
         }
         System.out.print("tong luong cua tat ca nhan vien la ");
         System.out.println(tongLuong());
    }
}