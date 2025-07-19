import java.util.Scanner;

public class Bai1w2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ten = scanner.nextLine();
        int tuoi = scanner.nextInt();
        double chieuCao = scanner.nextDouble();

        System.out.printf("Xin chào %s, bạn %d tuổi và cao %.2f mét.\n", ten, tuoi, chieuCao);

        scanner.close();
    }
}
