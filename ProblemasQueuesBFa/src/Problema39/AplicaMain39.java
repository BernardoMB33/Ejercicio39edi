package Problema39;
import Queues.*;
import ADTsException.ADTsException;


/**
 * Problema 37 
 * @since Today
 * @author EDI
 * @version 3.6
 */
public class AplicaMain39 {
    
    public static void main(String[] args) {
        
        // Instanciar objetos Persona
        Persona39 per1 = new Persona39(2,6,2010,"Alfonso");
        System.out.println(" Persona39: " + per1.toString());
        
        Persona39 per2 = new Persona39(12,11,2005,"Renata");
        System.out.println(" Persona39: " + per2.toString());
       
        // Creacion de una estructura Queue
        CArrayQueue<Persona39> q1 = new CArrayQueue(20); 
        q1.enqueue(per1);
        q1.enqueue(per2);
        Persona39 per3 = new Persona39(8,10,2003,"Alma");
        q1.enqueue(per3);
        Persona39 per4 = new Persona39(1,1,2001,"Mario");
        q1.enqueue(per4);
        System.out.println("\nq1 inicial: \n" + q1.toString() + "\n");

        // TODO...        
        // Edad de Renata al 31 de diciembre actual
        System.out.println("Edad de Renata al 31 de dic: " +
                " NO TENGO LA EDAD AL 31DIC.");

        // Ordenar por edad la queue q1
        ordenxEdad(q1);
        System.out.println("\nq1 por edad: \n" + " TODAVIA NO." + "\n");   
        
    }

    /**
     * ordenaxEdad(...) Ordena una cola por edad de Persona37s
     * @param que The queue of Persona37s
     */ 
    
    
    public static void ordenxEdad(CArrayQueue<Persona39> que) {
        if(que==null) throw new
            ADTsException("ordenEdad(...): que null.\n");
        
        int i=0;
        Persona39[] arrayEx= new Persona39[que.size()];
        // TODO...        
        while (!que.isEmpty()){
            arrayEx[i]=que.dequeue();
            i++;
        }
        
        boolean estaOrdenado=true;
        //bubbleSort; no es el más eficiente, pero al ser filas de aviones no se requiere un método tan sofisticadfo
        while(estaOrdenado){
            estaOrdenado=false;
            for(int j=0; j<arrayEx.length-1; j++){
                if(arrayEx[j].compareTo(arrayEx[j+1])<1){
                    Persona39 exec= arrayEx[j];
                    arrayEx[j]= arrayEx[j+1];
                    arrayEx[j+1]=exec;
                    estaOrdenado=true;
                }
            }
            
        }
        
        // regresamos a la fila
        for (int k=0; k<arrayEx.length; k++){
            que.enqueue(arrayEx[k]);
        }
    }
    

    
}
