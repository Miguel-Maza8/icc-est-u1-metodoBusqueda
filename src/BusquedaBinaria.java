
import models.Product;
public class BusquedaBinaria {
    
    public int findByName ( Product[]  products, String nombre ){
        int bajo = 0;
        int alto = products.length - 1;
       //definamos bajo y alto 
       while (bajo <= alto ){
        // definamos el punto medio

        int central = (bajo + alto) / 2;
        // comparamos con la clave
        if (products[central].getName().equals(nombre)){
          return central;
       }
         // Si voy a la derecha o izquierda
         int comparacion = products[central].getName().compareTo(nombre);
         if (comparacion< 0)
            bajo = central +1 ;

        else 
            alto = central -1;
         
    }
    return -1; // no encontrado
  }

  public void sortByName(Product[]products) {
    for (int i = 0; i < products.length-1 ; i++){
        boolean swap = false;
      for ( int j = 0 ; j < products.length -i -1; j++){
        if (products[j].getName().compareTo(products[j+1].getName())< 0){
            Product aux = products[j];
            products[j]=  products[j+1];
            products[j+1]= aux;
             swap = true;


        }
      }
      if (!swap) break;

    }
  }
  public void imprimir ( int array[]){
    for ( int i : array){
      System.out.println(i + ",");
    }
  }
} 
