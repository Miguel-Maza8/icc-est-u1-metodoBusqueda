
import models.Person;

public class BusquedaBinaria {
    
    public int findByEdad ( Person[]  personas, int edad ){
        int bajo = 0;
        int alto = personas.length - 1;
       //definamos bajo y alto 
       while (bajo <= alto ){
        for(int i = bajo; i<= alto ; i ++){
          
          System.out.print(personas[i].getEdad() + " |");
        }
        System.out.println();
        // definamos el punto medio
        int central = (bajo + alto) / 2;
        System.out.print("bajo ="+ bajo + "    ");
        System.out.print("alto= "+ alto+ "   ");
        System.out.print("centro="+ central + "   ");
        System.out.print("valorCentro="+ personas[central].getEdad()+ "   ");
        if (personas[central].getEdad()==(edad)){
          System.out.print("--> ENCONTRADO");
          System.out.println();
          System.out.println();
          return central;
       }
         // Si voy a la derecha o izquierda
        int comparacion = personas[central].getEdad() - (edad);
         if (comparacion< 0){
          System.out.print("--> DERECHA");
            bajo = central +1 ;
          System.out.println();
          System.out.println();
           } else {
            System.out.print("--> IZQUIERDA");
            alto = central -1;
            System.out.println();
            System.out.println();
           
    }
    
    
  }
   return -1; // no encontrado
  }

  public void sortByName(Person[]personas) {
    for (int i = 0; i < personas.length-1 ; i++){
        boolean swap = false;
      for ( int j = 0 ; j < personas.length -i -1; j++){
        if (personas[j].getEdad() > (personas[j+1].getEdad())){
            Person aux = personas[j];
            personas[j]=  personas[j+1];
            personas[j+1]= aux;
             swap = true;


        }
      }
      if (!swap) break;

    }
  }
    
} 
