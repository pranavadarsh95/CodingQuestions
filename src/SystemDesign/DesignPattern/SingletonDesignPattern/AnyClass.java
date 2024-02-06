package SystemDesign.DesignPattern.SingletonDesignPattern;

public class AnyClass {

    private static AnyClass ac = new AnyClass();

    private AnyClass(){

    }

    public static AnyClass getInstance(){
        return ac;
    }

}
