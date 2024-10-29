package Figuras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculadoraFiguras {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Cálculo del cuadrado
            System.out.print("Ingrese la longitud del lado del cuadrado: ");
            double ladoCuadrado = Double.parseDouble(reader.readLine());
            double areaCuadrado = ladoCuadrado * ladoCuadrado;
            double perimetroCuadrado = 4 * ladoCuadrado;
            System.out.println("Área del cuadrado: " + areaCuadrado);
            System.out.println("Perímetro del cuadrado: " + perimetroCuadrado);

            // Cálculo del rectángulo
            System.out.print("Ingrese la base del rectángulo: ");
            double baseRectangulo = Double.parseDouble(reader.readLine());
            System.out.print("Ingrese la altura del rectángulo: ");
            double alturaRectangulo = Double.parseDouble(reader.readLine());
            double areaRectangulo = baseRectangulo * alturaRectangulo;
            double perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);
            System.out.println("Área del rectángulo: " + areaRectangulo);
            System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);

            // Cálculo del triángulo
            System.out.print("Ingrese la base del triángulo: ");
            double baseTriangulo = Double.parseDouble(reader.readLine());
            System.out.print("Ingrese la altura del triángulo: ");
            double alturaTriangulo = Double.parseDouble(reader.readLine());
            double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
            System.out.println("Área del triángulo: " + areaTriangulo);

            // Asumiendo que es un triángulo equilátero para el perímetro
            double ladoTriangulo = Math.sqrt(Math.pow(baseTriangulo / 2, 2) + Math.pow(alturaTriangulo, 2)) * 2;
            double perimetroTriangulo = ladoTriangulo + baseTriangulo + ladoTriangulo;
            System.out.println("Perímetro del triángulo: " + perimetroTriangulo);

        } catch (IOException e) {
            System.out.println("Error en la entrada de datos.");
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un número válido.");
        }
    }
}

