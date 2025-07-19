import java.util.Scanner;

public class Bai2w2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tenHocSinh = scanner.nextLine();
        int tuoi = scanner.nextInt();
        scanner.nextLine();
        String lopHoc = scanner.nextLine();
        double diemTrungBinh = scanner.nextDouble();
        System.out.printf("Tên: %s - Tuổi: %d - Lớp: %s - GPA: %.1f\n", tenHocSinh, tuoi, lopHoc, diemTrungBinh);
        scanner.close();
    }
}

