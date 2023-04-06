
package Ejercicio_Extra_6;

public class datoRectangulo {

    private int lado1;
    private int lado2;

    public datoRectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcularArea() {

        return lado1 * lado2;
    }
    
}

