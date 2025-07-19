import java.util.Scanner;

public class Task2w2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                int left = (i > 0) ? A[i - 1] : 0;
                int right = (i < n - 1) ? A[i + 1] : 0;
                A[i] += Math.abs(left - right);
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(A[i]);
            if (i < n - 1) System.out.print(" ");
        }

        scanner.close();
    }
}
