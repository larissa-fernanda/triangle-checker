package fatec.lg;

public class TriangleTypeValidator {

    public static TriangleType getTriangleType(Triangle triangle) {
        if (!TriangleValidator.isValid(triangle)) {
            return TriangleType.INVALIDO;
        }

        double a = triangle.getSideA();
        double b = triangle.getSideB();
        double c = triangle.getSideC();

        if (a == b && b == c) {
            return TriangleType.EQUILATERO;
        } else if (a == b || b == c || a == c) {
            return TriangleType.ISOSCELES;
        } else {
            return TriangleType.ESCALENO;
        }
    }
}
