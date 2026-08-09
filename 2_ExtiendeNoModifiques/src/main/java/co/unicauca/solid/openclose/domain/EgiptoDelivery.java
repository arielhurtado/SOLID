/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.solid.openclose.domain;

/**
 *
 * @author ahurtado
 */
public class EgiptoDelivery implements IDelivery{

    @Override
    public double calculateCost(Order order) {
    double cost;
    if (order.getTotal()> 20.0) cost = 3;
    else cost= order.getTotal()*0.1;
    return cost;
    }
    
}
