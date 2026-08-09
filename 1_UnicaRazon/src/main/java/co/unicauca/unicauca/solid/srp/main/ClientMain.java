package co.unicauca.unicauca.solid.srp.main;

import co.unicauca.unicauca.solid.srp.access.ProductRepository;
import co.unicauca.unicauca.solid.srp.domain.Product;
import co.unicauca.unicauca.solid.srp.service.Service;


/**
 *
 * @author Libardo Pantoja, Julio A. Hurtado
 */
public class ClientMain {


    public static void main(String[] args) {
           
        Service service = new Service(new ProductRepository());
        Consola io = new Consola();
     
        // Crea dos productos y graba
        
        for(int i=0;i<2;i++){
            Product newProduct = new Product(io.readInt("Ingrese el Código"),
                                         io.readString("Ingrese el nomnre del Producto"),
                                         io.readDouble("Ingrese el valor"));         
            service.saveProduct(newProduct);
        }
        
        // Listar los productos
        for(Product p: service.listProducts()){
            io.show(p.toString());
        }       
    }
    
}