/*
  La clase GrafoAdcia define la tabla de vértices con sus respectivas listas de adyacencia.
Implementa las operaciones básicas para crear un grafo: añadir un vértice, insertar un arco, 
dar de baja un vértice y sus arcos
 */
package grafolista;

import java.util.LinkedList;

public class clsGrafoAdcia {
     //ATRIBUTOS
    int numVerts;
    static int maxVerts = 20;
    clsVerticeAdy [] tablAdc; //vector de vectices
    //COSNTRUCTOR
    //Crea la tabla de listas de adyacencia para un número de vértices preestablecido:
    public clsGrafoAdcia(int mx){
        tablAdc = new clsVerticeAdy[mx];//crea una lista cn max de vertices
        numVerts = 0;
        maxVerts = mx;
    }
    public clsGrafoAdcia() {
        this(maxVerts);
    }
     
    public clsVerticeAdy[] vertices(){
        return tablAdc;
    }
     // Devuelve la lista de adyacencia del vértice v
    public LinkedList listaAdyc(int v) throws Exception {
        //LinkedList permite una rápida inserción al inicio/final de la lista y funciona 
        //mucho más rápido que Arraylist  
        if (v < 0 || v >= numVerts){
            throw new Exception("VERTICES NO EXISTENTE");
        }
        return tablAdc[v].lad;
    }
     // Busca y devuelve el número de vértice, si no lo encuentra regresa -1
    public int numVertice(String nombre) {
        clsVerticeAdy v = new clsVerticeAdy(nombre);
        boolean encontrado = false;
        int i = 0;
        for (; (i < numVerts) && !encontrado;){
            encontrado = tablAdc[i].equals(v);
            //encontrado= a mi vector de vertices en esa pos donde 
            //equeals recibe un vertice y compara los nombres si existe es encontrado
            if (!encontrado){
                //si no es encontrado busca en la pos siguiente.
                i++;
            }
        }
        return (i < numVerts) ? i : -1;
    }
      // Crea un nuevo vértice
    public void nuevoVertice (String nombre) {
        boolean existe = numVertice(nombre) >= 0;
        if (!existe) {
            clsVerticeAdy v = new clsVerticeAdy(nombre);
            v.asigVert(numVerts);
            tablAdc[numVerts++] = v;
        }
    } 
    
    // Comprueba si dos vertices son adyacentes
    boolean adyacente(String a, String b) throws Exception{
        int v1, v2;
        v1 = numVertice(a);
        v2 = numVertice(b);
        if(v1 < 0 || v2 < 0) {
            throw new Exception ("VERTICE NO EXISTENTE");
        }
        if (tablAdc[v1].lad.contains(new clsArco(v2))) {
        //si en mi lista de ady(lad) dentro de c/vertice si lo tiene true
        //contains() devuelve un valor Boolean indicando si un nodo es descendiente de un nodo dado o no
            return true; 
        }
        else {
            return false;
        }
    }
    
    // Comprueba si dos vertices son adyacentes por el número de vértice no el nombre
    boolean adyacente(int v1, int v2) throws Exception{
        if (tablAdc[v1].lad.contains(new clsArco(v2))) {
            return true;
        } 
        else {
            return false;
        }
    }
    
    
    // Crea un nuevo arco
    public void nuevoArco(String a, String b) throws Exception {
        if (!adyacente(a,b)){//verifica si son adyasc si no son no lo crea
            int v1 = numVertice(a);
            int v2 = numVertice(b);
            if(v1 < 0 || v2 < 0) {
                throw new Exception ("VERTICE NO EXISTE");
            }
            clsArco ab = new clsArco(v2);
            tablAdc[v1].lad.addFirst(ab);
            //vector del vertice v1 de la lista de ady addFirst añade a la lista el arco ab
        }
    }
    
    // borra un arco ya creado
    public void borrarArco(String a, String b) throws Exception {
        int v1 = numVertice(a);
        int v2 = numVertice(b);
        if(v1 < 0 || v2 < 0) {
            throw new Exception ("El vértice no existe");
        }
        clsArco ab = new clsArco(v2);
        tablAdc[v1].lad.remove(ab);
        //remove inverso de addFirst lo saca.
    }
    
}
