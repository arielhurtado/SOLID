
package co.unicauca.unicauca.solid.srp.presentation;

import co.unicauca.unicauca.solid.srp.domain.Product;
import co.unicauca.unicauca.solid.srp.service.Service;
import java.util.List;

/**
 *
 * @author libardo
 */
public class ClientMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        Service service = new Service();
        Consola io = new Consola();
        
        // Crea dos productos y graba    
        
        for(int i=0;i<2;i++){
            Product newProduct = new Product(io.readInt("Ingrese el Código"),
                                         io.readString("Ingrese el nomnre del Producto"),
                                         io.readDouble("Ingrese el valor"));         
            service.saveProduct(newProduct);
        }
        
        for(Product p: service.listProducts()){
            System.out.println(p);
        }
        
        
        
    }
    
}
