package SystemDesign.DesignPattern.FactoryDesignPattern.TraditionalWay;

import java.io.IOException;
import java.util.Scanner;

public class FactoryMain {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter any vehicle type ex:- car, bike, truck:- ");
        Scanner scn = new Scanner(System.in);
        String vehicleType = scn.nextLine();
//        int i = scn.nextInt();
//        System.out.println("i is :- "+i);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String vehicleType = br.readLine();
                //String str = "xyz"; // pass any vehicle type

        FactoryPattern factoryPattern = new FactoryPattern();
         Vehicle vehicle = factoryPattern.getInstance(vehicleType);
         if(vehicle!=null)
            vehicle.vehicleInfo();
         else {
             System.out.println("your search is not found!!!");
         }
    }
}
