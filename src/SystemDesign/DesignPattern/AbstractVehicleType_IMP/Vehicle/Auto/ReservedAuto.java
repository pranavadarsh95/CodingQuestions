package SystemDesign.DesignPattern.AbstractVehicleType_IMP.Vehicle.Auto;

public class ReservedAuto extends Auto {

    public ReservedAuto(){}

    @Override
    public void setVehicleType(){
        shareType = "Personal";
    }

    @Override
    public void setBaseCost(){
        baseCost = 10;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 15;
    }
}
