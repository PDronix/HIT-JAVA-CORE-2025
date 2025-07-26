import java.util.Random;
import java.util.Scanner;

public class Task3w3 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int a = random.nextInt(101);       
        int b = random.nextInt(101);

        boolean isCorrect = random.nextBoolean();

        int c;
        if (isCorrect) {
            c = a + b;
        } else {

            int deviation;
            do {
                deviation = random.nextInt(21) - 10;
            } while (deviation == 0);
            c = a + b + deviation;
        }

        System.out.println("Phép toán của bạn là:");
        System.out.printf("%d + %d = %d\n", a, b, c);

        System.out.print("Dự đoán kết quả của phép toán (dung/sai): ");
        String answer = scanner.nextLine().trim().toLowerCase();

        if ((isCorrect && answer.equals("dung")) || (!isCorrect && answer.equals("sai"))) {
            System.out.println("Bạn đã trả lời đúng!");
        } else {
            System.out.println("Bạn đã trả lời sai!");
        }
    }
}