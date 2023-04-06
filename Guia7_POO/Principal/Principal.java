package Principal;

import entidad.Cadena;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // a la derecha de new "nombre del constructor"
        Cadena cadena1=new Cadena();
        //set -> para setear valores
        
        System.out.println("Ingrese una frase:");
        String FraseUsuario=sc.nextLine();
        cadena1.setFrase(FraseUsuario);
        
        //get para retornar valores y mostrarlos
        String frase=cadena1.getFrase();
        int longitudFrase=frase.length();
        
        // para saber la longitud en una sola linea
        int num = cadena1.getFrase().length();
        cadena1.setLongitud(longitudFrase);
        
        //todo en una linea
        cadena1.setLongitud(cadena1.getFrase().length());
        
        System.out.println(cadena1.getLongitud());
        
        cadena1.mostrarVocales();
        
        
        
    }
}
