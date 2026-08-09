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
public class GuatemalaDelivery implements IDelivery{

    @Override
    public double calculateCost(Order order) {
        return order.getTotal()*0.2;
    }
}
