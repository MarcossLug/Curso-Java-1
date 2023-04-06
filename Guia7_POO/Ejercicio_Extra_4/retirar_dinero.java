
package Ejercicio_Extra_4;

import java.util.Random;
import java.util.Scanner;

public class retirar_dinero {

    private double saldo;
    private String titular;
    private double monto;

    //public Cuenta(){
    public void datoCuenta() {
        Scanner leer = new Scanner(System.in);
        Random rdm = new Random();
        saldo = rdm.nextInt(50000);
        System.out.println("Ingrese el nombre");
        this.titular = leer.nextLine();
        System.out.println("Su saldo es " + saldo);

    }

    public double retirarDinero() {
        Scanner leer = new Scanner(System.in);
        //System.out.println("Ingrese el monto a retirar :");
        //this.monto = leer.nextDouble();
        //saldo = saldo - monto;
        String op = "";
        do {

            System.out.println(titular + " Su saldo es $ " + saldo);
            System.out.println("Ingrese el monto a retirar :");
            this.monto = leer.nextDouble();
            //saldo = saldo - monto;
            if (saldo > monto) {
                saldo = saldo - monto;
            }else{
                System.out.println("Su saldo es negativo, no puede se puede realizar");
            }

                if (saldo > 0) {
                    System.out.println(titular + " Su saldo es $ " + saldo);

                } else {
                    System.out.println("Su saldo es negativo, no se puede realizar ");
                }

                System.out.println("Dese realizar otra operacion Si/No");
                op = leer.next();
            }
            while (op.equalsIgnoreCase("si"));
            return saldo;
        
    
    }

}


