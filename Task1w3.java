import java.util.Scanner;

public class Task1w3 {

    public static final String SQUARE = "Square";
    public static final String TRIANGLE = "Triangle";
    public static final String CIRCLE = "Circle";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập loại hình: ");
        String type = scanner.nextLine();

        if (!isValidType(type)) {
            System.out.println("Hình dạng không hợp lệ!");
            return;
        }

        double dientich = calculateArea(type, scanner);
        System.out.println("Diện tích: " + dientich);
    }

    public static boolean isValidType(String type) {
        return type.equals(SQUARE) || type.equals(TRIANGLE) || type.equals(CIRCLE);
    }

    public static double calculateArea(String type, Scanner scanner) {
        switch (type) {
            case SQUARE:
                System.out.print("Nhập cạnh: ");
                double canh = scanner.nextDouble();
                return canh * canh;
            case TRIANGLE:
                System.out.print("Nhập đáy: ");
                double day = scanner.nextDouble();
                System.out.print("Nhập chiều cao: ");
                double cao = scanner.nextDouble();
                return 0.5 * day * cao;
            case CIRCLE:
                System.out.print("Nhập bán kính: ");
                double bankinh = scanner.nextDouble();
                return Math.PI * bankinh * bankinh;
            default:
                return 0;
        }
    }
}
