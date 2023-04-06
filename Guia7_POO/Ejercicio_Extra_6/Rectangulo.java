
package Ejercicio_Extra_6;

import java.util.Scanner;

public class Rectangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese lado 1 =");
        int lado1=sc.nextInt();
        System.out.print("Ingrese lado 2 =");
        int lado2=sc.nextInt();
        datoRectangulo rectangulo1 = new datoRectangulo(lado1,lado2);
        System.out.println("el area de su rectangulo es " + rectangulo1.calcularArea());
        
    }
    
}
