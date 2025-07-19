import java.util.Scanner;

public class Bai4w2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Các phần tử: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Tổng: " + sum);

        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Giá trị lớn nhất: " + max);

        scanner.close();
    }
}
