
package Ejercicio_Extra_5;

import java.util.Scanner;

public class Empleado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        datoEmpleado emp1= new datoEmpleado();
        
        System.out.println("Ingrese cantidad de empleados:");
        int empleados=sc.nextInt();
        
     
        
        for (int i = 0; i < empleados; i++) {
            
            emp1.datosEmpleado();
            System.out.println(emp1.getNombre() + " Su salario con aumento es : " + emp1.calcularAumento());
            
            
        }
        
        
        
    }
    
}
