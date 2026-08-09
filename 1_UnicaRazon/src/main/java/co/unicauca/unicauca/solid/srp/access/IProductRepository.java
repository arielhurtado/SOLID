/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.unicauca.unicauca.solid.srp.access;

import co.unicauca.unicauca.solid.srp.domain.Product;
import java.util.List;

/**
 *
 * @author ahurtado
 */
public interface IProductRepository {

    List<Product> listProducts();

    boolean saveProduct(Product newProduct);
    
}
