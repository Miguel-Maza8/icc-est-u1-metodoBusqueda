import models.Product;


public class App {
    public static void main(String[] args) throws Exception {
    Product[] products = {
        new Product("laptop", 20),
        new Product("celular", 30),
        new Product("tablet", 10),
        new Product("Monitor", 5),
        new Product("Keyboard", 15),  

  
    };
    BusquedaBinaria bBinaria = new BusquedaBinaria();


    int res = bBinaria.findByName(products, "Monitor");
    if (res >= 0){
        System.out.println("Producto en pos: " + res);
    } else {
        System.out.println("Producto no encontrado");
    }
     }

}
