package CALCULADORA;

import javax.swing.*;

public class InicioPrograma {
    public static void main(String[] args) {
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo de la calculadora:");
        ObjCalculadora objCal = new ObjCalculadora();
        objCal.ingresoInformacion(modelo);
        objCal.ingresoOperaciones();
    }
}
