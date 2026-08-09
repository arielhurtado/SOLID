/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.solid.openclose.domain;

/**
 *
 * @author ahurtado
 */
public class BoliviaDelivery implements IDelivery{

    @Override
    public double calculateCost(Order order) {
        return order.getWeight()*10*56/100;
    }
    
}
