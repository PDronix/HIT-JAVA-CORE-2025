import java.util.Scanner;
import java.text.DecimalFormat;

public class Task1w2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double pi = 3.14;
        double chuVi = 2 * pi * r;
        double dienTich = pi * r * r;
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(chuVi) + " " + df.format(dienTich));
        scanner.close();
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.