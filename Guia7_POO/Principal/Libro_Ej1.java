
package Principal;

import entidad.DatoLibro;
import java.util.Scanner;

public class Libro_Ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //llama a la clase de arriba "nombre de la variable" = new "public nombre()" para llamar a la funcion
        DatoLibro libro1= new DatoLibro();
        
        
        System.out.print("Ingrese ISBN:");
        int isbn=sc.nextInt();
        
        System.out.print("Título del Libro: ");
        String titulo=sc.next();
        
        System.out.print("Autor:");
        String autor=sc.next();
        
        System.out.print("Número de páginas:");
        int numPag=sc.nextInt();
        
        libro1.setDatos(isbn,titulo,autor,numPag);
              
        libro1.mostrarDato();
        
        
    }
    
}
