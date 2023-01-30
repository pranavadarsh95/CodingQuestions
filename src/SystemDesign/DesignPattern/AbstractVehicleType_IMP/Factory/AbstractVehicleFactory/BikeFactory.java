package SystemDesign.DesignPattern.AbstractVehicleType_IMP.Factory.AbstractVehicleFactory;

import SystemDesign.DesignPattern.AbstractVehicleType_IMP.Vehicle.Bike.NormalBike;
import SystemDesign.DesignPattern.AbstractVehicleType_IMP.Vehicle.Bike.SportsBike;
import SystemDesign.DesignPattern.AbstractVehicleType_IMP.Vehicle.Vehicle;

public class BikeFactory extends AbstractVehicleFactory {

    @Override
    public Vehicle getVehicle(String type){
        if(type.equalsIgnoreCase("Normal")) {
            return new NormalBike();
        }
        else if(type.equalsIgnoreCase("Sports")) {
            return new SportsBike();
        }
        else{
            return new NormalBike();
        }
    }
}
