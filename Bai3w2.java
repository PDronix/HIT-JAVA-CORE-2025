import java.util.Scanner;

public class Bai3w2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Cộng: " + (a + b));
        System.out.println("Trừ: " + (a - b));
        System.out.println("Nhân: " + (a * b));

        if (b != 0) {
            System.out.println("Chia: " + ((double) a / b));
            System.out.println("Chia lấy dư: " + (a % b));
        } else {
            System.out.println("Không thể chia cho 0");
        }

        if (a == b) {
            System.out.println("Hai số bằng nhau");
        } else {
            System.out.println("Hai số không bằng nhau");
        }

        scanner.close();
    }
}