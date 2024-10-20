import Baitap.Nhanvien;
import Baitap.Phongban;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String tenPhongBan;
        int soLuongNhanVien;
        int lc;
        Scanner sc = new Scanner(System.in);
        
        // Nhập tên phòng ban
        System.out.println("Nhap vao ten phong ban: ");
        tenPhongBan = sc.nextLine();
        
        // Nhập số lượng nhân viên ban đầu
        System.out.println("Nhap vao so luong nhan vien ban dau: ");
        soLuongNhanVien = sc.nextInt();
        sc.nextLine();  // Tiêu thụ dòng trống còn lại
        
        // Tạo đối tượng Phongban
        Phongban pb = new Phongban(tenPhongBan,0);
        System.out.println("-----------MENU------------");
        do {            
            System.out.println("1.Them thong tin cho tung nhan vien");
            System.out.println("2.Xoa nhan vien");
            System.out.println("3.In thong tin nhan vien");
            System.out.println("4.Thoat");
            System.out.print("nhap lua chon cua ban la ");
            lc=sc.nextInt();
            sc.nextLine();
            if(lc==1){
                 for (int i = 0; i < soLuongNhanVien; i++) {
            System.out.println("Nhap vao thong tin nhan vien thu " + (i + 1) + ":");
            
            // Nhập tên nhân viên
            System.out.println("Nhap vao ten nhan vien: ");
            String tenNhanVien = sc.nextLine();
            
            // Nhập hệ số lương
            System.out.println("Nhap vao he so luong cua nhan vien: ");
            double heSoLuong = sc.nextDouble();
            sc.nextLine();  // Tiêu thụ dòng trống còn lại
            
            // Tạo đối tượng NhanVien
            Nhanvien nv = new Nhanvien(tenNhanVien, heSoLuong);
            
            // Thêm nhân viên vào phòng ban
            pb.themNhanVien(nv);
        }
            }
            
            if(lc==2){
                pb.xoaNhanVien();
            }
            if(lc==3){
                    System.out.println("-------------------");
                    pb.inTTin();
            }
            
        } while (lc!=4);   
        sc.close();
    }
}
