package productos;
public class Producto {
    private String nombre;
    private double precio;
    private boolean tieneIVA;

    public Producto(String nombre, double precio, boolean tieneIVA) {
        this.nombre = nombre;
        this.precio = precio;
        this.tieneIVA = tieneIVA;
    }

    public double calcularIVA() {
        if (!tieneIVA) {
            return 0;
        } else if (precio <= 500) {
            return precio * 0.12;
        } else if (precio > 500 && precio <= 1500) {
            return precio * 0.14;
        } else {
            return precio * 0.15;
        }
    }

    public double getPrecioConIVA() {
        return precio + calcularIVA();
    }

    public String toString() {
        return "Producto:\n" +
                "Nombre: " + nombre + "\n" +
                "Precio: " + precio + "\n" +
                "Tiene IVA: " + (tieneIVA ? "Sí" : "No") + "\n" +
                "IVA: " + calcularIVA() + "\n" +
                "Precio con IVA: " + getPrecioConIVA();
    }
}
