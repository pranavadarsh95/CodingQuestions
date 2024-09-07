package SystemDesign.DesignPattern.AbstractVehicleType_IMP.Vehicle;

public interface Vehicle {
    void book(int distance);
    void setVehicleType();
    void setBaseCost();
    void setVehicleChargesPerUnitDistance();
    int calculateCostOfBooking(int distance);
}
