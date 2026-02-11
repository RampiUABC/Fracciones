
/**
 * @author Ramiro
 * @version 1
 */
public class Fraccion{
    private int numerador;
    private int denominador;
    private int entero;
    
    public Fraccion (){
        denominador = 1;
        numerador = 0;
        entero = 0;
    }

    // usando validación de denominador
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        if (denominador == 0) {
            this.denominador = 1;
        } else {
            this.denominador = denominador;
        }
    }
    
    /*Metodo set para establecer el valor del numerador*/
    public void setNumerador(int numerador) { this.numerador = numerador; }
    public void setDenominador(int denominador) { 
        if(denominador != 0) this.denominador = denominador; 
    }
    /*Metodo set para establecer el valor del entero*/
    public void setEntero(int entero){this.entero = entero;}
     /*Metodo get para leer el valor del numerador*/
    public int getNumerador(){return numerador;}
     /*Metodo get para leer el valor del denominador*/
    public int getDenominador(){return denominador;}
     /*Metodo get para leer el valor del entero*/
    public int getEntero(){return entero;}
        
    
    
    public String toString() {
        if (entero == 0) {
            return numerador + "/" + denominador;
        } else {
            return entero + " " + numerador + "/" + denominador;
        }  
    }
    
    // Operaciones Matematicas
    // SUMA
    public Fraccion sumar(Fraccion fraccion1, Fraccion fraccion2) {
        Fraccion resultado = new Fraccion();
        // Denominadores iguales
        if (fraccion1.getDenominador() == fraccion2.getDenominador()) {
            resultado.setNumerador(fraccion1.getNumerador() + fraccion2.getNumerador());
            resultado.setDenominador(fraccion1.getDenominador()); 
        } 
        // Denominadores diferentes
        else {
            int num = (fraccion1.getNumerador() * fraccion2.getDenominador()) + (fraccion2.getNumerador() * fraccion1.getDenominador());
            int den = fraccion1.getDenominador() * fraccion2.getDenominador();
            resultado.setNumerador(num);
            resultado.setDenominador(den);
        }
        return resultado;
    }
    
}
    
