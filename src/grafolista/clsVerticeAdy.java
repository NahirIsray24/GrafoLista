
package grafolista;

/**
 *
 * @author NAHIR ISRAY , CARLOS PORCEL
 */
import java.util.LinkedList;
public class clsVerticeAdy {
     //ATRIBUTOS
    String nombre;//para identificar el vertice
    int numVertice;//me sirve para controlarlo en una estructura
    LinkedList<Object> lad; // lista enlazada c/vertice tendra una de tipo obejto
    // constructor de la clase
    public clsVerticeAdy(String x){
    nombre = x;
    numVertice = -1; 
    //-1 valir con el que "nacen" los vertices
    lad = new LinkedList();
    } 
    //Método que devuelve Identificador del Vertice
    public String nomVertice() {
        return nombre;
    }
    //equals se utiliza para la comparacion y obtendra un objeto d
    public boolean equals(Object  d){ // true, si dos vértices son iguales
       clsVerticeAdy a= (clsVerticeAdy)d; //d se crea para comparar
       //clsVerticeAdy)n se utiliza la conversion del objeto recibido en vertice 
        return nombre.equals(a.nombre); 
        //devuelve el nombre comparado con el otro nombre del vertice a
    }
    public void asigVert(int n){ // establece el número de vértices
        numVertice = n;
    }
   
    public String toString(){ // características del vértice
        return nombre + " (" + numVertice + ")";
    }

    
}
