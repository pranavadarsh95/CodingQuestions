package SystemDesign.DesignPattern.AbstractVehicleType_IMP.Vehicle.Car;

public class MiniCar extends Car {

    public MiniCar(){};

    @Override
    public void setVehicleType(){
        carType = "Mini";
    }

    @Override
    public void setBaseCost(){
        baseCost = 100;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 20;
    }
}

