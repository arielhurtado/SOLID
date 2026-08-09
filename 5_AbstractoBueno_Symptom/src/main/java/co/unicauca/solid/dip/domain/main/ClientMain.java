
package co.unicauca.solid.dip.domain.main;


import co.unicauca.solid.dip.domain.Product;
import co.unicauca.solid.dip.domain.access.ProductRepository;
import co.unicauca.solid.dip.domain.service.Service;


/**
 *
 * @author Libardo, Julio
 */
public class ClientMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Service service = new Service(new ProductRepository());
        
        Product newProduct = new Product(4,"TV samgung RTR-123", 2500000d);         
        service.saveProduct(newProduct);

        newProduct = new Product(6,"Nevera LG FGET-233", 2500000d);
        service.saveProduct(newProduct);
        
        for(Product p: service.listProducts()){
            System.out.println(p);
        }
        
        
        
    }
    
}
