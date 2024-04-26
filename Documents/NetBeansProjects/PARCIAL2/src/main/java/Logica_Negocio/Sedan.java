/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author deiner stiven
 */
public class Sedan extends Automovil {

    private double motor;
    private boolean frenos;
    
    public Sedan() {
    }

    public Sedan(String placa, int modelo, double precio, double motor, boolean frenos) {
        super(placa, modelo, precio);
        this.motor = motor;
        this.frenos = frenos;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public boolean isFrenos() {
        return frenos;
    }

    public void setFrenos(boolean frenos) {
        this.frenos = frenos;
    }
 
    public static void frenosABS(boolean frenos) {
        if (frenos == true) {
            System.out.println("El automóvil tiene frenos ABS");
        } else {
            System.out.println("El automóvil no tiene frenos ABS");
        }
    }
}

