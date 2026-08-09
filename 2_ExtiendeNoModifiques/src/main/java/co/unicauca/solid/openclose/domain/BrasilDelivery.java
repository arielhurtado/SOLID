/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.solid.openclose.domain;

/**
 *
 * @author ahurtado
 */
public class BrasilDelivery implements IDelivery {

    public BrasilDelivery() {
    }

    @Override
    public double calculateCost(Order order) {
    
        return order.getTotal()*10*order.getWeight()/500;
    
    }
    
}
