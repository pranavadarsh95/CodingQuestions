package SystemDesign.DesignPattern.AbstractVehicleType_IMP.Vehicle.Auto;

public class SharedAuto extends Auto {

    public SharedAuto(){}

    @Override
    public void setVehicleType(){
        shareType = "Shared";
    }

    @Override
    public void setBaseCost(){
        baseCost = 0;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 10;
    }
}
