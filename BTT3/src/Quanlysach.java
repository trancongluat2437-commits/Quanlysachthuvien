import java.util.Scanner;
public class QuanLySach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 100;
        String[] maSach = new String[MAX];
        String[] tenSach = new String[MAX];
        String[] tacGia = new String[MAX];
        int[] namXB = new int[MAX];
        double[] donGia = new double[MAX];
        int[] soLuong = new int[MAX];
        int[] loaiSach = new int[MAX];
        int n = 0;
        int chon;
        do {
            System.out.println("\n===== MENU QUAN LY SACH =====");
            System.out.println("1. Nhap danh sach sach");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tinh tong so luong va tong gia tri");
            System.out.println("4. Tim sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    System.out.print("Nhap so luong sach: ");
                    n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("\n===== NHAP SACH THU " + (i + 1) + " =====");
                        System.out.print("Nhap ma sach: ");
                        maSach[i] = sc.nextLine();
                        System.out.print("Nhap ten sach: ");
                        tenSach[i] = sc.nextLine();
                        System.out.print("Nhap tac gia: ");
                        tacGia[i] = sc.nextLine();
                        System.out.print("Nhap nam xuat ban: ");
                        namXB[i] = sc.nextInt();
                        System.out.print("Nhap don gia: ");
                        donGia[i] = sc.nextDouble();
                        System.out.print("Nhap so luong: ");
                        soLuong[i] = sc.nextInt();
                        System.out.println("\nChon loai sach:");
                        System.out.println("1. Sach giao khoa");
                        System.out.println("2. Sach tham khao");
                        System.out.println("3. Sach chuyen nganh");
                        System.out.println("4. Sach khac");
                        System.out.print("Lua chon: ");
                        loaiSach[i] = sc.nextInt();
                        sc.nextLine();
                    }
                    break;
                case 2:
                    if (n == 0) {
                        System.out.println("Chua co du lieu sach!");
                        break;
                    }
                    for (int i = 0; i < n; i++) {
                        double thanhTien = donGia[i] * soLuong[i];
                        double phiVanChuyen = thanhTien * 0.05;
                        double tongTienNhap = thanhTien + phiVanChuyen;
                        System.out.println("\n===== THONG TIN SACH =====");
                        System.out.println("Ma sach: " + maSach[i]);
                        System.out.println("Ten sach: " + tenSach[i]);
                        System.out.println("Tac gia: " + tacGia[i]);
                        System.out.println("Nam xuat ban: " + namXB[i]);
                        System.out.println("Don gia: " + donGia[i]);
                        System.out.println("So luong: " + soLuong[i]);
                        System.out.println("Thanh tien: " + thanhTien);
                        System.out.println("Phi van chuyen: " + phiVanChuyen);
                        System.out.println("Tong tien nhap: " + tongTienNhap);
                        if (donGia[i] > 0 && soLuong[i] >= 0 && namXB[i] > 0) {
                            System.out.println("Sach hop le.");
                        } else {
                            System.out.println("Sach khong hop le.");
                        }
                        System.out.print("Phan loai gia: ");
                        if (donGia[i] < 50000) {
                            System.out.println("Sach gia thap");
                        } else if (donGia[i] <= 100000) {
                            System.out.println("Sach gia trung binh");
                        } else if (donGia[i] <= 200000) {
                            System.out.println("Sach gia cao");
                        } else {
                            System.out.println("Sach gia dac biet");
                        }
                        System.out.print("Tinh trang ton kho: ");
                        if (soLuong[i] == 0) {
                            System.out.println("Het sach");
                        } else if (soLuong[i] <= 5) {
                            System.out.println("Sap het");
                        } else if (soLuong[i] <= 20) {
                            System.out.println("Con it");
                        } else {
                            System.out.println("Con nhieu");
                        }
                        System.out.print("Loai sach: ");
                        switch (loaiSach[i]) {
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
                                System.out.println("Loai sach khong hop le");
                        }
                    }
                    break;
                case 3:
                    int tongSoLuong = 0;
                    double tongGiaTri = 0;

                    for (int i = 0; i < n; i++) {
                        tongSoLuong += soLuong[i];
                        tongGiaTri += donGia[i] * soLuong[i];
                    }
                    System.out.println("\nTong so luong sach: " + tongSoLuong);
                    System.out.println("Tong gia tri sach: " + tongGiaTri);
                    break;
                case 4:
                    if (n == 0) {
                        System.out.println("Chua co du lieu sach!");
                        break;
                    }
                    System.out.print("Nhap ma sach can tim: ");
                    String maCanTim = sc.nextLine();
                    boolean timThay = false;
                    for (int i = 0; i < n; i++) {
                        if (maSach[i].equalsIgnoreCase(maCanTim)) {
                            System.out.println("\n===== TIM THAY SACH =====");
                            System.out.println("Ma sach: " + maSach[i]);
                            System.out.println("Ten sach: " + tenSach[i]);
                            System.out.println("Tac gia: " + tacGia[i]);
                            System.out.println("Nam xuat ban: " + namXB[i]);
                            System.out.println("Don gia: " + donGia[i]);
                            System.out.println("So luong: " + soLuong[i]);
                            timThay = true;
                            break;
                        }
                    }
                    if (!timThay) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
        sc.close();
    }
}