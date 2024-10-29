package empleados;

import java.time.LocalDate;
import java.time.Period;

public class Empleado {
    private String cedula;
    private String nombre;
    private String apellido;
    private String genero;
    private double salario;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;

    public Empleado(String cedula, String nombre, String apellido, String genero, double salario, LocalDate fechaNacimiento, LocalDate fechaIngreso) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }

    public void modificarSalario(double nuevoSalario) {
        this.salario = nuevoSalario;
    }

    public int calcularEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public double calcularPrestaciones() {
        int antiguedad = Period.between(fechaIngreso, LocalDate.now()).getYears();
        return (antiguedad * salario) / 12;
    }

    public String toString() {
        return "Empleado:\n" +
                "Cédula: " + cedula + "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Género: " + genero + "\n" +
                "Salario: " + salario + "\n" +
                "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
                "Fecha de Ingreso: " + fechaIngreso + "\n" +
                "Edad: " + calcularEdad() + " años\n" +
                "Prestaciones: " + calcularPrestaciones();
    }
}
