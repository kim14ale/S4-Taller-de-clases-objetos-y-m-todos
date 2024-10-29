package vehiculos;
public class Vehiculo {
    private String numeroMotor;
    private int numeroVentanas;
    private int cantidadPuertas;
    private String marca;
    private String modelo;
    private double kilometrajeInicial;
    private double kilometrajeFinal;

    public Vehiculo(String numeroMotor, int numeroVentanas, int cantidadPuertas, String marca, String modelo, double kilometrajeInicial, double kilometrajeFinal) {
        this.numeroMotor = numeroMotor;
        this.numeroVentanas = numeroVentanas;
        this.cantidadPuertas = cantidadPuertas;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometrajeInicial = kilometrajeInicial;
        this.kilometrajeFinal = kilometrajeFinal;
    }

    public double calcularKilometrajeRecorrido() {
        return kilometrajeFinal - kilometrajeInicial;
    }

    public String toString() {
        return "Vehículo:\n" +
                "Número de Motor: " + numeroMotor + "\n" +
                "Número de Ventanas: " + numeroVentanas + "\n" +
                "Cantidad de Puertas: " + cantidadPuertas + "\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Kilometraje Inicial: " + kilometrajeInicial + "\n" +
                "Kilometraje Final: " + kilometrajeFinal + "\n" +
                "Kilómetros Recorridos: " + calcularKilometrajeRecorrido();
    }
}
