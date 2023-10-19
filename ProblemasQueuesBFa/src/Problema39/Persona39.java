package Problema39;
import java.util.Calendar;
import ADTsException.ADTsException;

/**
 * Problema 39
 * @author EDI
 */
public class Persona39 implements Comparable<Persona39> {
    private int dia, mes, anio;
    private String nombre;
    
    public Persona39() {
        this(1,1,3000,"vacio");
    }
    
    public Persona39(int d, int m, int a, String nom) {
        dia = d;    mes = m;    anio = a;
        nombre = nom;
    }
    
    public String toString() {
        // TODO...
        String cade;
        cade = "[ Nombre: " + nombre +
                ", Nac: " + dia + "-" + mes + "-" + anio +
                ", Edad: " + "NO TENGO LA EDAD AL 31DIC." + " ]";
        return cade;
    }
    
    // Calcula la edad al 31 de diciembre del año actual
    public int getEdad31dicAct() {
        int edad;
        // TODO...
        // Obtencion del anhio actual
        Calendar cal= null;
        int anioAct= 0;
        
        // Edad al 31 de diciembre del anio actual
        edad= 0;

        return edad;
    }
    
    // int compareTo(otra) de la interface Comparable<T>;
    // <0: this<otra;  0: iguales;  >0: this>otra
    public int compareTo(Persona39 otra) {
        if ( otra == null ) throw new
            ADTsException("compareTo(...): otra null.\n");
        
        int result= 0;
        
        if (this.getCode()<otra.getCode()) {
            result=1;
        }  
        
        if(this.getCode()>otra.getCode()){
            result=-1;
        }
            
        
        return result;
    }
    
      public int getCode() {
        if ( this == null ) throw new
            ADTsException("compareTo(...): otra null.\n");

        // Se usara un Code único  dado porla fecha de nacimiento
        // El codigo mostrara que persona nació antes
        return (this.anio*10000)+(this.mes*100)+(this.dia); //de forma que regresa 19780101 para alguien del (01/01/1978) 
        //De forma q menor sea el codigo, mas viejo es uno
      }
    
    
}
