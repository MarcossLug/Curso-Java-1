package entidad;

public class Cadena {
    
    /*
    Atributos
    */
   private String frase;
   private int longitud;
   /*
   //constructor
   */
    
   public Cadena(){
       
    //this. para diferenciar el atributo(definido en class) del argumento(mandado desde el main)
       this.frase=frase;
       this.longitud=longitud; 
       
   }
   
   public void setFrase(String frase){
       
       this.frase=frase;
       
       
   }
   public String getFrase(){
       
       return frase;
   }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
   public void mostrarVocales(){
        
       int vocales=0;
       
        for (int i = 0; i < this.longitud; i++) {
           
            String letra=this.frase.substring(i, i+1);
            
           if(letra.equalsIgnoreCase("a") ||letra.equalsIgnoreCase("e")||
                   letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") 
                   ||letra.equalsIgnoreCase("u")){
               
               vocales++;
           } 
       }
        System.out.println("La cantidad de vocales es: " + vocales);
        
    }
   
}
