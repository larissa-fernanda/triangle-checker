package fatec.lg;

public class TriangleValidator {

    public static boolean isValid(Triangle triangle) {
        double a = triangle.getSideA();
        double b = triangle.getSideB();
        double c = triangle.getSideC();
        boolean valid = false;

        if (a > 0 && b > 0 && c > 0) {
            if ((a + b > c) && (a + c > b) && (b + c > a)) {
                valid = true;
            }
        }

        return valid;
    }
}
