/*
 Para poder generar adyascencia entre 2 vertices debe existir un 
arco q los conecta , puede ser dirigido o no y con un factor de peso
 */

package grafolista;
public class clsArco {
    //ATRIBUTOS
    int destino; //num del vertice a cual esta destinado
    double peso;
    //CONSTRUCTORES
    public clsArco(int d){
        destino = d;
    }
    public clsArco(int d, double p){
    this(d); //hace uso del constructor de arriba
    peso = p;
    }
    //METODOS
    public int getDestino(){
        return destino;
    }
    //comparacion de destinos
    public boolean equals(Object n){
        clsArco a =(clsArco)n;
        return destino == a.destino;
    }
}
