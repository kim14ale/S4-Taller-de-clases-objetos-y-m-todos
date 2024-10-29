package CALCULADORA;

import java.util.Scanner;

public class CICalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Buenos días");

        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = sc.nextLine();
        System.out.println("El nombre es: " + nombre + "\nSu apellido es: " + apellido);

        // Operación de suma
        System.out.print("Ingrese el primer número para sumar: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número para sumar: ");
        int num2 = sc.nextInt();
        double resultadoSuma = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultadoSuma);

        // Operación de multiplicación
        System.out.print("Ingrese el primer número para multiplicar: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número para multiplicar: ");
        num2 = sc.nextInt();
        double resultadoMultiplicacion = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);

    }
}
