/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.solid.dip.domain.access;

import co.unicauca.solid.dip.domain.Product;
import java.util.List;

/**
 *
 * @author ahurtado
 */
public interface IProductRepository {

    void connect();

    void disconnect();

    List<Product> listProducts();

    boolean saveProduct(Product newProduct);
    
}
