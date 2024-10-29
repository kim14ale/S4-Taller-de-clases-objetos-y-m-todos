package CALCULADORA;

import javax.swing.*;

public class ObjCalculadora {
    private String pantalla;
    private String modelo;
    private String operacion;
    private double numero1;
    private double numero2;

    public void ingresoInformacion(String modelo) {
        this.modelo = modelo;
        pantalla = JOptionPane.showInputDialog("Ingrese el tipo de pantalla (LCD, LED, etc.):");
    }

    public void ingresoOperaciones() {
        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        operacion = JOptionPane.showInputDialog("Ingrese la operación (+, -, *, /):");

        JOptionPane.showMessageDialog(null, "Modelo: " + modelo + "\nPantalla: " + pantalla);

        double resultado = calcularOperacion();
        if (!Double.isNaN(resultado)) {
            JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
        }
    }

    public double calcularOperacion() {
        double resultado = 0;

        switch (operacion) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                if (numero2 == 0) {
                    JOptionPane.showMessageDialog(null, "Error: No se puede dividir por 0");
                    return Double.NaN; // Retornar NaN en caso de división por cero
                } else {
                    resultado = numero1 / numero2;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operación no reconocida");
                return Double.NaN;
        }
        return resultado;
    }
}
