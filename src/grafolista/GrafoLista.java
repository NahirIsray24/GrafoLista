
package grafolista;

/**
 *
 * @author NAHIR ISRAY , CARLOS PORCEL
 */
public class GrafoLista {

    public static void main(String[] args) {
      clsGrafoAdcia grafoLista = new clsGrafoAdcia(5); //5 es mx maximo
        //creo los nuevos vertices
        grafoLista.nuevoVertice("1");
        grafoLista.nuevoVertice("2");
        grafoLista.nuevoVertice("3");
        grafoLista.nuevoVertice("4");
        grafoLista.nuevoVertice("5");
        
        try {
            //arcos entre vertices 
            grafoLista.nuevoArco("1", "3");
            grafoLista.nuevoArco("2", "4");
            grafoLista.nuevoArco("2", "1");
            grafoLista.nuevoArco("5", "2");
            grafoLista.nuevoArco("5", "1");
            
            for (int i = 0; i < grafoLista.tablAdc.length; i++) {
                System.out.println("POSICION DEL VECTOR: " + i);
                for (int j = 0; j < grafoLista.tablAdc[i].lad.size(); j++) {
                    System.out.println(grafoLista.tablAdc[i].lad.get(j).getClass());
                //me va a mostrar en la posicion x cuantos arcos tendra
                // poscion 0= 2 arcos.
                }
            }
            
        }   catch (Exception e) {
             e.printStackTrace();//Se utiliza para mostrar el nombre de una excepción junto con el mensaje que devuelve getMessage().
             }
    }
    }
    

