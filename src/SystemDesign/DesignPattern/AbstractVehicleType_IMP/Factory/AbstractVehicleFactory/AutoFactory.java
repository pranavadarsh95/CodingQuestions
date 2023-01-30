package SystemDesign.DesignPattern.AbstractVehicleType_IMP.Factory.AbstractVehicleFactory;

import SystemDesign.DesignPattern.AbstractVehicleType_IMP.Vehicle.Auto.ReservedAuto;
import SystemDesign.DesignPattern.AbstractVehicleType_IMP.Vehicle.Auto.SharedAuto;
import SystemDesign.DesignPattern.AbstractVehicleType_IMP.Vehicle.Vehicle;

public class AutoFactory extends AbstractVehicleFactory {

    @Override
    public Vehicle getVehicle(String type){
        if(type.equalsIgnoreCase("Reserved")) {
            return new ReservedAuto();
        }
        else if(type.equalsIgnoreCase("Shared")) {
            return new SharedAuto();
        }
        else{
            return new ReservedAuto();
        }
    }
}