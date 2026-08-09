package co.unicauca.solid.openclose.main;

import co.unicauca.solid.openclose.domain.Order;
import co.unicauca.solid.openclose.domain.CountryEnum;
import co.unicauca.solid.openclose.domain.Factory;
import co.unicauca.solid.openclose.domain.IDelivery;
import co.unicauca.solid.openclose.domain.Store;

/**
 *
 * @author Libardo Pantoja, Julio Hurtado
 */
public class ClienteMain {

    public static void main(String[] args) {
        

    
        
        Store store = new Store();

        Order orderOne = new Order(CountryEnum.BRASIL, 8000, 10000);

        Order orderTwo = new Order(CountryEnum.COLOMBIA, 100000, 10);
        
        Order orderThree = new Order(CountryEnum.PERU, 100000, 10);
        
        Order orderFour = new Order(CountryEnum.GUATEMALA, 100000, 10000);
        
        Order orderFive = new Order(CountryEnum.CHINA, 100000, 1000);

        Order orderSix = new Order(CountryEnum.EGIPTO, 50, 1000);

        double costOne = store.calculateDeliveryCost(orderOne);

        System.out.println("Order One cost:" + costOne + " reales");

        double costTwo = store.calculateDeliveryCost(orderTwo);
        System.out.println("Order Two cost: " + costTwo + " pesos colombianos");
        
        double costThree = store.calculateDeliveryCost(orderThree);
        System.out.println("Order Three cost: " + costThree + " nuevos soles");
        
        double costFour = store.calculateDeliveryCost(orderFour);
        System.out.println("Order Four cost: " + costFour + "Quetzales");
        
        double costSix = store.calculateDeliveryCost(orderSix);
        System.out.println("Order Four cost: " + costFour + "Libra Egipcia");
        
        
        double costFive = store.calculateDeliveryCost(orderFive);
        System.out.println("Order Five cost: " + costFive + "Yens");
    }

}
