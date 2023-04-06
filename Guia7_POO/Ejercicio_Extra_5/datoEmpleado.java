
package Ejercicio_Extra_5;

import java.util.Scanner;

public class datoEmpleado {
    
public String nombre;
    private int edad;
    private double salario;

    public void datosEmpleado() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado :");
        nombre = sc.nextLine();
        System.out.println("Ingrese su edad :");
        edad = sc.nextInt();
        System.out.println("Ingrese su Salario :");
        salario = sc.nextDouble();  
    }
    
    public double calcularAumento() {
        if (edad < 30) {
            salario = salario * 1.05;
        } else {
            salario = salario * 1.10;
        }
        return salario;
    }

    public String getNombre() {
        return nombre;
    }
}
    