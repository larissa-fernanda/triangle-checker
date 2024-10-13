package fatec.lg;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void testEscalenoValido() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(TriangleType.ESCALENO, TriangleTypeValidator.getTriangleType(triangle));
    }

    @Test
    public void testIsoscelesValido() {
        Triangle triangle = new Triangle(5, 5, 7);
        assertEquals(TriangleType.ISOSCELES, TriangleTypeValidator.getTriangleType(triangle));
    }

    @Test
    public void testEquilateroValido() {
        Triangle triangle = new Triangle(6, 6, 6);
        assertEquals(TriangleType.EQUILATERO, TriangleTypeValidator.getTriangleType(triangle));
    }

    @Test
    public void testIsoscelesPermutacao1() {
        Triangle triangle = new Triangle(7, 5, 7);
        assertEquals(TriangleType.ISOSCELES, TriangleTypeValidator.getTriangleType(triangle));
    }

    @Test
    public void testIsoscelesPermutacao2() {
        Triangle triangle = new Triangle(5, 7, 7);
        assertEquals(TriangleType.ISOSCELES, TriangleTypeValidator.getTriangleType(triangle));
    }

    @Test
    public void testIsoscelesPermutacao3() {
        Triangle triangle = new Triangle(7, 7, 5);
        assertEquals(TriangleType.ISOSCELES, TriangleTypeValidator.getTriangleType(triangle));
    }

    @Test
    public void testValorZero() {
        Triangle triangle = new Triangle(0, 4, 5);
        assertEquals(TriangleType.INVALIDO, TriangleTypeValidator.getTriangleType(triangle));
    }

    @Test
    public void testValorNegativo() {
        Triangle triangle = new Triangle(-3, 4, 5);
        assertEquals(TriangleType.INVALIDO, TriangleTypeValidator.getTriangleType(triangle));
    }

    @Test
    public void testSomaIgualTerceiroLado1() {
        Triangle triangle = new Triangle(3, 4, 7);
        assertEquals(TriangleType.INVALIDO, TriangleTypeValidator.getTriangleType(triangle));
    }

    @Test
    public void testSomaIgualTerceiroLado2() {
        Triangle triangle = new Triangle(7, 3, 4);
        assertEquals(TriangleType.INVALIDO, TriangleTypeValidator.getTriangleType(triangle));
    }

    @Test
    public void testSomaIgualTerceiroLado3() {
        Triangle triangle = new Triangle(4, 7, 3);
        assertEquals(TriangleType.INVALIDO, TriangleTypeValidator.getTriangleType(triangle));
    }

    @Test
    public void testSomaMenorTerceiroLado1() {
        Triangle triangle = new Triangle(2, 3, 6);
        assertEquals(TriangleType.INVALIDO, TriangleTypeValidator.getTriangleType(triangle));
    }

    @Test
    public void testSomaMenorTerceiroLado2() {
        Triangle triangle = new Triangle(6, 2, 3);
        assertEquals(TriangleType.INVALIDO, TriangleTypeValidator.getTriangleType(triangle));
    }

    @Test
    public void testSomaMenorTerceiroLado3() {
        Triangle triangle = new Triangle(3, 6, 2);
        assertEquals(TriangleType.INVALIDO, TriangleTypeValidator.getTriangleType(triangle));
    }

    @Test
    public void testTodosZeros() {
        Triangle triangle = new Triangle(0, 0, 0);
        assertEquals(TriangleType.INVALIDO, TriangleTypeValidator.getTriangleType(triangle));
    }
}

