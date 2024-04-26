/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author deiner stiven
 */
public class ChevroletSail extends Sedan {
    
    private String tanque;
    private boolean seguro;

    public ChevroletSail(String placa, int modelo, double precio, double motor, boolean frenos, String tanque, boolean seguro) {
        super(placa, modelo, precio, motor, frenos);
        this.tanque = tanque;
        this.seguro = seguro;
    }

    public String getTanque() {
        return tanque;
    }

    public void setTanque(String tanque) {
        this.tanque = tanque;
    }

    public boolean isSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }
    
    public static void Seguro(boolean Seguro) {
        if (Seguro) {
            System.out.println("El automóvil tiene seguro de todo riesgo");
        } else {
            System.out.println("El automóvil no tiene seguro de todo riesgo");
        }
    }
    
    public static void precioSeguro(double Precio) {
        if (Precio > 50000000) {
            double valorSeguro = Precio * 0.1;
            System.out.println("El valor del seguro es: " + valorSeguro);
        } else {
            System.out.println("No hay valor del seguro puesto que el valor del automóvil es menor a 50'000.000");
        }
    }
}

