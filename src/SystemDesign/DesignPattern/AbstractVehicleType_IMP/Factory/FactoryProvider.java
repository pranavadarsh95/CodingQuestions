package SystemDesign.DesignPattern.AbstractVehicleType_IMP.Factory;

import SystemDesign.DesignPattern.AbstractVehicleType_IMP.Factory.AbstractVehicleFactory.AbstractVehicleFactory;
import SystemDesign.DesignPattern.AbstractVehicleType_IMP.Factory.AbstractVehicleFactory.AutoFactory;
import SystemDesign.DesignPattern.AbstractVehicleType_IMP.Factory.AbstractVehicleFactory.BikeFactory;
import SystemDesign.DesignPattern.AbstractVehicleType_IMP.Factory.AbstractVehicleFactory.CarFactory;

public class FactoryProvider {
    public static AbstractVehicleFactory getVehicleFactory(String factoryType){
        if(factoryType.equalsIgnoreCase("Car")) {
            return new CarFactory();
        } else if(factoryType.equalsIgnoreCase("Auto")) {
            return new AutoFactory();
        }
        else if(factoryType.equalsIgnoreCase("Bike")) {
            return new BikeFactory();
        } else {
            return new CarFactory();
        }
    }
}
