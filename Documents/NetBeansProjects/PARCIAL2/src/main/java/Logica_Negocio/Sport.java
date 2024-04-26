/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author deiner stiven
 */
public class Sport extends Moto {

    public String motor;
    public String potencia;
    public String tanque;

    public Sport(String placa, int modelo, int cilindraje, String motor, String potencia, String tanque) {
        super(placa, modelo, cilindraje);
        this.motor = motor;
        this.potencia = potencia;
        this.tanque = tanque;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getTanque() {
        return tanque;
    }

    public void setTanque(String tanque) {
        this.tanque = tanque;
    }

    public static void motorGarantia(String motor) {
        if (motor.equals("4T")) {
            System.out.println("La garantía de la moto es por 2 años");
        } else if (motor.equals("monocilíndrico")) {
            System.out.println("La garantía de la moto es por 1 año");
        } else {
            System.out.println("Tipo de motor no válido para la garantía");
        }
    }
}