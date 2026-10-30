import java.util.Scanner;
public class QuanLySach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        String maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        int namXB = sc.nextInt();
        System.out.print("Nhap don gia: ");
        double donGia = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        int soLuong = sc.nextInt();

        double thanhTien = donGia * soLuong;

        double phiVanChuyen = thanhTien * 0.05;

        double tongTienNhap = thanhTien + phiVanChuyen;

        System.out.println("\n===== THONG TIN SACH =====");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXB);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);

        System.out.println("\nThanh tien: " + thanhTien);
        System.out.println("Phi van chuyen: " + phiVanChuyen);
        System.out.println("Tong tien nhap: " + tongTienNhap);

        sc.close();
    }
}