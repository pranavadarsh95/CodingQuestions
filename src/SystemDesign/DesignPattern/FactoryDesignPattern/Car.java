package SystemDesign.DesignPattern.FactoryDesignPattern;

public class Car implements Vehicle{
    @Override
    public void vehicleInfo() {
        System.out.println("Hello Car! is ready!!!");
    }
}
