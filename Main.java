package empleados;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) {
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del empleado:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del empleado:");
        String genero = JOptionPane.showInputDialog("Ingrese el género del empleado:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));

        LocalDate fechaNacimiento = obtenerFecha("Ingrese la fecha de nacimiento (YYYY-MM-DD):");
        LocalDate fechaIngreso = obtenerFecha("Ingrese la fecha de ingreso (YYYY-MM-DD):");

        Empleado empleado = new Empleado(cedula, nombre, apellido, genero, salario, fechaNacimiento, fechaIngreso);

        JOptionPane.showMessageDialog(null, empleado.toString(), "Información del Empleado", JOptionPane.INFORMATION_MESSAGE);

        // Modificar salario
        double nuevoSalario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo salario del empleado:"));
        empleado.modificarSalario(nuevoSalario);

        JOptionPane.showMessageDialog(null, empleado.toString(), "Información Actualizada del Empleado", JOptionPane.INFORMATION_MESSAGE);
    }

    private static LocalDate obtenerFecha(String mensaje) {
        LocalDate fecha = null;
        boolean fechaValida = false;
        while (!fechaValida) {
            String fechaStr = JOptionPane.showInputDialog(mensaje);
            try {
                fecha = LocalDate.parse(fechaStr, DateTimeFormatter.ISO_LOCAL_DATE);
                fechaValida = true;
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(null, "Fecha inválida. Inténtelo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return fecha;
    }
}
