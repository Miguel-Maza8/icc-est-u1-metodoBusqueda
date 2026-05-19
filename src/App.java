import models.Person;



public class App {
    public static void main(String[] args) throws Exception {
    Person[] personas =generatePersonsList() ;
    BusquedaBinaria busqueda = new BusquedaBinaria();
    busqueda.sortByEdad(personas);
    System.out.println();
    int res = busqueda.findByEdad( personas , 18 );
     if (res >= 0){
         System.out.println();
         System.out.println("La persona con la edad " + personas[res].getEdad() + " es "+ personas[res].getNombre());
         System.out.println();
     }else 
         System.out.println("Producto no encontrado");

     }
    public static Person[] generatePersonsList() {
    Person[] personas = new Person[9];
       personas[0]= new Person("Pablo", 4);
       personas[1]= new Person ("Maria",5);
       personas[2]= new Person("Juan", 18);
       personas[3]= new Person("David",60);
       personas[4]= new Person("Mateo",25);
       personas[5]= new Person("Diego",12);
       personas[6]= new Person("Ana", 8);
       personas[7]= new Person("Alicia", 9);
       personas[8]= new Person("Jaime", 40);
       return personas;
    
    }
   
 
}
