package fatec.lg;

import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado A:");
        double a = scanner.nextInt();

        System.out.println("Digite o lado B:");
        double b = scanner.nextInt();

        System.out.println("Digite o lado C:");
        double c = scanner.nextInt();

        Triangle triangle = new Triangle(a, b, c);
        TriangleType type = TriangleTypeValidator.getTriangleType(triangle);

        if (type == TriangleType.INVALIDO) {
            System.out.println("O triângulo é inválido.");
        } else {
            System.out.println("O triângulo é do tipo: " + type);
        }

        scanner.close();
    }
}