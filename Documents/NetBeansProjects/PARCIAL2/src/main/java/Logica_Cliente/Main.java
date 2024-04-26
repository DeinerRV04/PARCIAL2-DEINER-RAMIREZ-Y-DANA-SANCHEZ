package Logica_Cliente;

import Logica_Negocio.ChevroletSail;
import static Logica_Negocio.ChevroletSail.Seguro;
import static Logica_Negocio.ChevroletSail.precioSeguro;
import static Logica_Negocio.Sedan.frenosABS;
import Logica_Negocio.Sport;
import static Logica_Negocio.Sport.motorGarantia;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author deiner stiven
 */
public class Main {

    public static void main(String[] args) {

        int opc = 0, ModeloCar, ModeloMoto, Cilindraje;
        String PlacaCar, TanqueChevrolet, PlacaMoto, MotorMoto, PotenciaMoto, TanqueMoto;
        double Precio, MotorSedan;
        boolean Frenos, SeguroChevrolet;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("\n****** CONCESIONARIO CAUCANA DE VEHÍCULOS S.A.********");
            System.out.println("******* REGISTRO DE VEHÍCULOS VENDIDOS********");
            System.out.println();
            System.out.println("1. Registro de automóviles");
            System.out.println("2. Registro de motos");
            System.out.println("3. Vendedor");
            System.out.println("4. Salir");

            do {
                try {
                    System.out.print("Digite una opcion valida: ");
                    opc = scan.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Error");
                }
                scan.nextLine(); //Limpiar el buffer
            } while (opc <= 0);

            switch (opc) {
                case 1:
                    System.out.println("Ingrese los datos del automóvil");
                    System.out.print("Placa del automóvil: ");
                    PlacaCar = scan.nextLine();
                    System.out.print("Modelo del automóvil: ");
                    ModeloCar = scan.nextInt();
                    System.out.print("Precio del automóvil: ");
                    Precio = scan.nextDouble();
                    scan.nextLine(); //Limpiar el buffer

                    System.out.println();

                    System.out.println("Ingrese los datos del Sedan");
                    System.out.print("Motor: ");
                    MotorSedan = scan.nextDouble();
                    System.out.print("Frenos ABS (true/false): ");
                    Frenos = scan.nextBoolean();
                    frenosABS(Frenos);

                    System.out.println();

                    System.out.println("Ingrese los datos de ChevroletSail");
                    scan.nextLine(); //Limpiar el buffer
                    System.out.print("Tanque: ");
                    TanqueChevrolet = scan.nextLine();
                    System.out.print("Seguro (true/false): ");
                    SeguroChevrolet = scan.nextBoolean();
                    Seguro(SeguroChevrolet);
                    precioSeguro(Precio);

                    ChevroletSail chevrolet = new ChevroletSail(PlacaCar, ModeloCar, Precio, MotorSedan, Frenos, TanqueChevrolet, SeguroChevrolet);

                    System.out.println("\nDatos del automóvil registrados:");
                    System.out.println("Placa: " + chevrolet.getPlaca());
                    System.out.println("Modelo: " + chevrolet.getModelo());
                    System.out.println("Precio: " + chevrolet.getPrecio());
                    System.out.println("Motor del Sedan: " + chevrolet.getMotor());
                    System.out.println("Frenos ABS: " + chevrolet.isFrenos());
                    System.out.println("Tanque del ChevroletSail: " + chevrolet.getTanque());
                    System.out.println("Seguro del ChevroletSail: " + chevrolet.isSeguro());
                    break;

                case 2:
                    System.out.println("Ingrese los datos de la moto");
                    System.out.print("Placa de la moto: ");
                    PlacaMoto = scan.nextLine();
                    System.out.print("Modelo de la moto: ");
                    ModeloMoto = scan.nextInt();
                    System.out.print("Cilindraje de la moto: ");
                    Cilindraje = scan.nextInt();
                    scan.nextLine(); //Limpiar el buffer
                    System.out.println();

                    System.out.println("Ingrese los datos de Sport");
                    System.out.print("Motor: ");
                    MotorMoto = scan.nextLine();
                    motorGarantia(MotorMoto);
                    System.out.print("Potencia: ");
                    PotenciaMoto = scan.nextLine();
                    System.out.print("Tanque: ");
                    TanqueMoto = scan.nextLine();
                    System.out.println();

                    Sport sport = new Sport(PlacaMoto, ModeloMoto, Cilindraje, MotorMoto, PotenciaMoto, TanqueMoto);

                    System.out.println("\nDatos de la moto registrados:");
                    System.out.println("Placa: " + sport.getPlaca());
                    System.out.println("Modelo: " + sport.getModelo());
                    System.out.println("Cilindraje: " + sport.getCilindraje());
                    System.out.println("Motor del Sport: " + sport.getMotor());
                    System.out.println("Potencia del Sport: " + sport.getPotencia());
                    System.out.println("Tanque del Sport: " + sport.getTanque());
                    break;

                case 3:
                    System.out.println("Vendedor: Deiner Stiven Ramírez Vente");
                    System.out.println("Vendedora: Dora Imelda Ulcue Sánchez");
                    break;
            }
        } while (opc != 4);
    }
}
