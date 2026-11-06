import java.util.ArrayList;
import java.util.Scanner;
class Sach {
    String maSach;
    String tenSach;
    String tacGia;
    int namXB;
    double donGia;
    int soLuong;
    int loaiSach;
    public Sach(String maSach, String tenSach, String tacGia,
                int namXB, double donGia,
                int soLuong, int loaiSach) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXB = namXB;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.loaiSach = loaiSach;
    }
}
public class QuanLySach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> dsSach = new ArrayList<>();
        int chon;
        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tong so luong sach");
            System.out.println("7. Tong gia tri sach");
            System.out.println("8. Thoat");
            System.out.print("Lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {

                case 1:

                    System.out.print("Nhap so luong sach can them: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {

                        System.out.println("\n===== NHAP SACH THU " + (i + 1) + " =====");

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

                        System.out.println("\n1. Sach giao khoa");
                        System.out.println("2. Sach tham khao");
                        System.out.println("3. Sach chuyen nganh");
                        System.out.println("4. Sach khac");
                        System.out.print("Lua chon: ");
                        int loaiSach = sc.nextInt();

                        sc.nextLine();

                        Sach s = new Sach(
                                maSach,
                                tenSach,
                                tacGia,
                                namXB,
                                donGia,
                                soLuong,
                                loaiSach);

                        dsSach.add(s);
                    }

                    break;

                case 2:

                    if (dsSach.isEmpty()) {
                        System.out.println("Chua co du lieu sach!");
                        break;
                    }

                    for (Sach s : dsSach) {

                        double thanhTien = s.donGia * s.soLuong;
                        double phiVanChuyen = thanhTien * 0.05;
                        double tongTienNhap = thanhTien + phiVanChuyen;

                        System.out.println("\n===== THONG TIN SACH =====");
                        System.out.println("Ma sach: " + s.maSach);
                        System.out.println("Ten sach: " + s.tenSach);
                        System.out.println("Tac gia: " + s.tacGia);
                        System.out.println("Nam XB: " + s.namXB);
                        System.out.println("Don gia: " + s.donGia);
                        System.out.println("So luong: " + s.soLuong);
                        System.out.println("Thanh tien: " + thanhTien);
                        System.out.println("Phi van chuyen: " + phiVanChuyen);
                        System.out.println("Tong tien nhap: " + tongTienNhap);

                        if (s.donGia > 0 && s.soLuong >= 0 && s.namXB > 0)
                            System.out.println("Sach hop le");
                        else
                            System.out.println("Sach khong hop le");

                        System.out.print("Phan loai gia: ");

                        if (s.donGia < 50000)
                            System.out.println("Sach gia thap");
                        else if (s.donGia <= 100000)
                            System.out.println("Sach gia trung binh");
                        else if (s.donGia <= 200000)
                            System.out.println("Sach gia cao");
                        else
                            System.out.println("Sach gia dac biet");

                        System.out.print("Tinh trang ton kho: ");

                        if (s.soLuong == 0)
                            System.out.println("Het sach");
                        else if (s.soLuong <= 5)
                            System.out.println("Sap het");
                        else if (s.soLuong <= 20)
                            System.out.println("Con it");
                        else
                            System.out.println("Con nhieu");

                        System.out.print("Loai sach: ");

                        switch (s.loaiSach) {
                            case 1:
                                System.out.println("Sach giao khoa");
                                break;
                            case 2:
                                System.out.println("Sach tham khao");
                                break;
                            case 3:
                                System.out.println("Sach chuyen nganh");
                                break;
                            case 4:
                                System.out.println("Sach khac");
                                break;
                            default:
                                System.out.println("Khong hop le");
                        }
                    }

                    break;

                case 3:

                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();

                    boolean found = false;

                    for (Sach s : dsSach) {
                        if (s.maSach.equalsIgnoreCase(maTim)) {

                            System.out.println("\n===== TIM THAY =====");
                            System.out.println("Ma sach: " + s.maSach);
                            System.out.println("Ten sach: " + s.tenSach);
                            System.out.println("Tac gia: " + s.tacGia);
                            System.out.println("Nam XB: " + s.namXB);
                            System.out.println("Don gia: " + s.donGia);
                            System.out.println("So luong: " + s.soLuong);

                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("Khong tim thay sach!");

                    break;

                case 4:

                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();

                    boolean daXoa = false;

                    for (int i = 0; i < dsSach.size(); i++) {
                        if (dsSach.get(i).maSach.equalsIgnoreCase(maXoa)) {

                            dsSach.remove(i);

                            daXoa = true;

                            System.out.println("Xoa thanh cong!");
                            break;
                        }
                    }

                    if (!daXoa)
                        System.out.println("Khong tim thay sach!");

                    break;

                case 5:

                    System.out.print("Nhap ma sach can sua: ");
                    String maSua = sc.nextLine();

                    boolean daSua = false;

                    for (Sach s : dsSach) {

                        if (s.maSach.equalsIgnoreCase(maSua)) {

                            System.out.print("Ten sach moi: ");
                            s.tenSach = sc.nextLine();

                            System.out.print("Tac gia moi: ");
                            s.tacGia = sc.nextLine();

                            System.out.print("Don gia moi: ");
                            s.donGia = sc.nextDouble();

                            System.out.print("So luong moi: ");
                            s.soLuong = sc.nextInt();
                            sc.nextLine();

                            daSua = true;

                            System.out.println("Cap nhat thanh cong!");
                            break;
                        }
                    }

                    if (!daSua)
                        System.out.println("Khong tim thay sach!");

                    break;

                case 6:

                    int tongSoLuong = 0;

                    for (Sach s : dsSach) {
                        tongSoLuong += s.soLuong;
                    }

                    System.out.println("Tong so luong sach: " + tongSoLuong);

                    break;

                case 7:

                    double tongGiaTri = 0;

                    for (Sach s : dsSach) {
                        tongGiaTri += s.donGia * s.soLuong;
                    }

                    System.out.println("Tong gia tri sach: " + tongGiaTri);

                    break;

                case 8:

                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 8);
        sc.close();
    }
}