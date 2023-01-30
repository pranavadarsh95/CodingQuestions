package SystemDesign.DesignPattern.AbstractVehicleType_IMP;

import SystemDesign.DesignPattern.AbstractVehicleType_IMP.Factory.AbstractVehicleFactory.AbstractVehicleFactory;
import SystemDesign.DesignPattern.AbstractVehicleType_IMP.Factory.FactoryProvider;
import SystemDesign.DesignPattern.AbstractVehicleType_IMP.Vehicle.Vehicle;

public class AbstractMain {
    public static void main(String[] args) {
        int distance = 10;

        /*
         * Book a Mini Car for a distance of 10 kms
         */
        AbstractVehicleFactory carFactory = FactoryProvider.getVehicleFactory("Car");
        Vehicle miniCar = carFactory.getVehicle("Mini");
        miniCar.book(distance);


        /*
         * Book a Personal Auto for a distance of 10 kms
         */
        AbstractVehicleFactory autoFactory = FactoryProvider.getVehicleFactory("Auto");
        Vehicle personalAuto = autoFactory.getVehicle("Personal");
        personalAuto.book(distance);

        /*
         * Book a Sports Bike for a distance of 10 kms
         */
        AbstractVehicleFactory bikeFactory = FactoryProvider.getVehicleFactory("Bike");
        Vehicle sportsBike = bikeFactory.getVehicle("Sports");
        sportsBike.book(distance);

    }
}