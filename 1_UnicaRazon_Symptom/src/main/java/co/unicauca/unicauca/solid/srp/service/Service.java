package co.unicauca.unicauca.solid.srp.service;

//import co.unicauca.unicauca.solid.srp.domain.Product;
import co.unicauca.unicauca.solid.srp.domain.Product;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import co.unicauca.solid.srp.persistencia.Repository;

/**
 * Servicio es la clase que concentra la lógica de negocio
 *
 * @author libardo, julio Docs Sqlite; https://www.sqlitetutorial.net/sqlite-java/
 */
public class Service {

    private Repository repository;

    public Service() {
        repository = new Repository();
    }

    // Razon 1: A futuro podria cambiar la lógica para calcular el impuesto
    
    /**
     * Una lógica de negocio sencilla: validad datos y calcular un impouesto del
     * producto
     *
     * @param product
     * @return
     */
    public double calculateProductTax(Product product) {

        //Validate product.
        if (product == null) {
            return 0;
        }
        double TAX = 0.19d;
        double productTax = product.getPrice() * TAX;
        return productTax;
    }

    // Razon 2: A futuro podriamos cambiar el motor de base de datosm usar un 
    // ORM, o cambiar la estructura de la base de datos
    /**
     * Lógica de acceso a datos
     *
     * @param newProduct producto a ser almacenado en la base de datos
     * @return true si fue posible guardar el producto, false en caso contrario
     */
    public boolean saveProduct(Product newProduct) {
        
        return repository.saveProduct(newProduct);
    }

    public List<Product> listProducts() {
        
        return repository.listProducts();
    }

}
