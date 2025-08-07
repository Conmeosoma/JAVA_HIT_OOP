// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tx2_ontap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class CongNhanControl {

    static ArrayList<CongNhan> ds = new ArrayList<>();

    public void addData(CongNhan cn) {
        try {
            if (cn.getTenCn() == null || cn.getTenCn().trim().isEmpty()) {
                throw new Exception("Tên công nhân không được bỏ trống!");
            }
            if (cn.getTongGioLam() < 0) {
                throw new Exception("Giờ làm phải >= 0!");
            }
            for (CongNhan c : ds) {
                if (c.getMaCn().equalsIgnoreCase(cn.getMaCn())) {
                    throw new Exception("❌ Mã công nhân đã tồn tại!");
                }
            }

            ds.add(cn);
            System.out.println("✅ Thêm công nhân thành công.");
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public void fakeData() {
        ds.add(new CongNhan("001", "Nguyen Van A", CaType.CA1, 40));
        ds.add(new CongNhan("002", "Nguyen Van B", CaType.CA2, 41));
        ds.add(new CongNhan("003", "Nguyen Van C", CaType.CA2, 42));
        ds.add(new CongNhan("004", "Nguyen Van D", CaType.CA3, 43));
        ds.add(new CongNhan("005", "Nguyen Van E", CaType.CA3, 44));
    }

    public void sortData() {
        ds.sort(Comparator.comparingInt(CongNhan::getTongGioLam).reversed());
        System.out.println("Da sap xep giam dan theo tong gio lam.");
    }

    public void writeToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Ma Cong Nhan  Ten Cn            Ca lam viec   Gio lam\n");
            for (CongNhan cn : ds) {
                writer.write(String.format("%-10s %-20s %-15s %-5d\n", cn.getMaCn(), cn.getTenCn(), cn.getCaLam(), cn.getTongGioLam()));
            }
            System.out.println("Du lieu da duoc ghi vao file " + fileName);
        } catch (IOException e) {
            System.out.println("Loi khi ghi file: " + e.getMessage());
        }
    }

    public void readFromFile(String fileName) {
        try (Scanner sc = new Scanner(new java.io.File(fileName))) {
            sc.nextLine(); // Bỏ dòng tiêu đề
            ds.clear(); // Xóa danh sách hiện tại trước khi nạp mới

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.trim().split("\\s{2,}"); // Tách theo 2 khoảng trắng trở lên
                if (parts.length == 4) {
                    String ma = parts[0].trim();
                    String ten = parts[1].trim();
                    CaType ca = CaType.valueOf(parts[2].trim());
                    int gio = Integer.parseInt(parts[3].trim());
                    ds.add(new CongNhan(ma, ten, ca, gio));
                }
            }
            System.out.println("Đã đọc dữ liệu từ file " + fileName);
            hienThiDS();
        } catch (Exception e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }

    public void timKiemTheoMa(String maTim) {
        boolean found = false;
        for (CongNhan cn : ds) {
            if (cn.getMaCn().equalsIgnoreCase(maTim)) {
                System.out.println("Thông tin công nhân:");
                cn.outputData();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy công nhân có mã: " + maTim);
        }
    }

    public void xoaTheoMa(String maXoa) {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getMaCn().equalsIgnoreCase(maXoa)) {
                ds.remove(i);
                System.out.println("Đã xóa công nhân có mã: " + maXoa);
                return;
            }
        }
        System.out.println("Không tìm thấy mã công nhân để xóa.");
    }

    public void suaTheoMa(String maSua) {
        for (CongNhan cn : ds) {
            if (cn.getMaCn().equalsIgnoreCase(maSua)) {
                System.out.println("Nhập lại thông tin mới cho công nhân:");
                cn.inputData();
                System.out.println("Đã cập nhật thông tin.");
                return;
            }
        }
        System.out.println("Không tìm thấy mã công nhân để sửa.");
    }

    public void hienThiDS() {
        System.out.println("Ma Cong Nhan  Ten Cn            Ca lam viec   Gio lam");
        for (CongNhan cn : ds) {
            cn.outputData();
        }
    }

    public boolean maDaTonTai(String ma) {
        for (CongNhan c : ds) {
            if (c.getMaCn().equalsIgnoreCase(ma)) {
                return true;
            }
        }
        return false;
    }

}
