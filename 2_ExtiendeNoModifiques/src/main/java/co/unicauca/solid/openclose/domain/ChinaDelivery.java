/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.solid.openclose.domain;

/**
 *
 * @author ahurtado
 */
public class ChinaDelivery implements IDelivery {

    @Override
    public double calculateCost(Order order) {
    return order.getWeight()*10-order.getTotal()*0.05;
    }
    
}
