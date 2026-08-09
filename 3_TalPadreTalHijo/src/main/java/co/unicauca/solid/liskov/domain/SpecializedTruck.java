package co.unicauca.solid.liskov.domain;

/**
 *
 * @author Libardo, Julio
 */
public class SpecializedTruck extends Truck {

    public SpecializedTruck(String plateNumber, double odometer) {
        super(plateNumber, odometer);
    }
    @Override
    public void addTrip(Trip newTrip) {
        //Update odometer.
        odometer += newTrip.getDistance();    
        super.addTrip(newTrip);
    }
}
