package SystemDesign.DesignPattern.AbstractVehicleType_IMP.Factory.AbstractVehicleFactory;

import SystemDesign.DesignPattern.AbstractVehicleType_IMP.Vehicle.Car.MegaCar;
import SystemDesign.DesignPattern.AbstractVehicleType_IMP.Vehicle.Car.MicroCar;
import SystemDesign.DesignPattern.AbstractVehicleType_IMP.Vehicle.Car.MiniCar;
import SystemDesign.DesignPattern.AbstractVehicleType_IMP.Vehicle.Vehicle;

public class CarFactory extends AbstractVehicleFactory {

    @Override
    public Vehicle getVehicle(String type) {
        if(type.equalsIgnoreCase("Micro")) {
            return new MicroCar();
        }
        else if(type.equalsIgnoreCase("Mini")) {
            return new MiniCar();
        }
        else if(type.equalsIgnoreCase("Mega")) {
            return new MegaCar();
        }
        else{
            return new MiniCar();
        }
    }
}