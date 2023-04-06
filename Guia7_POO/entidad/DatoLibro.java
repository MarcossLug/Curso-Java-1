package entidad;

public class DatoLibro{
    
    int ISBN;
    String titulo;
    String autor;
    int numPag;
    
    public void setDatos(int isbn,String titulo,String autor,int numPag){

        this.ISBN=isbn;
        this.autor=autor;
        this.titulo=titulo;
        this.numPag=numPag;    
    }
    public void mostrarDato(){
        System.out.println("-------------------------------");
        System.out.println("El libro " + titulo +" del autor "+autor);
        System.out.println("Posee " + numPag + " paginas con un ISBN:"+ISBN);
        
    }
    
    
    
}
