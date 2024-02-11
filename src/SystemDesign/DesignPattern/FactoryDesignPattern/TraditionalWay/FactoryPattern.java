package SystemDesign.DesignPattern.FactoryDesignPattern.TraditionalWay;

public class FactoryPattern {

    Vehicle getInstance(String vehicleType){
        if(vehicleType.equalsIgnoreCase("car")){
            return new Car();
        } else if(vehicleType.equalsIgnoreCase("bike")){
            return new Bike();
        } else if(vehicleType.equalsIgnoreCase("truck")){
            return new Truck();
        } else {
            return null;
        }
    }
}
