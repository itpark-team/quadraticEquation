import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program solve ax^2 + bx + c = 0 task");

        System.out.print("input a: ");
        double a = scanner.nextDouble();

        System.out.print("input b: ");
        double b = scanner.nextDouble();

        System.out.print("input c: ");
        double c = scanner.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println(String.format("task has two roots x1 = %.2f x2 = %.2f", x1, x2));
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println(String.format("task has one root x = %.2f ", x));
        } else if (discriminant < 0) {
            System.out.println("task has no roots");
        }

    }
}