import java.util.Scanner;

public class Task2w3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input.toUpperCase());
            System.out.println("Chuỗi này đối xứng.");
        } else {
            System.out.println(input.toLowerCase());
            System.out.println("Chuỗi này không đối xứng.");
        }
    }

    public static boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
