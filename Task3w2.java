import java.util.Scanner;

public class Task3w2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];

        int value = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (value <= n * n) {
            for (int i = left; i <= right && value <= n * n; i++) {
                arr[top][i] = value++;
            }
            top++;

            for (int i = top; i <= bottom && value <= n * n; i++) {
                arr[i][right] = value++;
            }
            right--;

            for (int i = right; i >= left && value <= n * n; i--) {
                arr[bottom][i] = value++;
            }
            bottom--;

            for (int i = bottom; i >= top && value <= n * n; i--) {
                arr[i][left] = value++;
            }
            left++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
