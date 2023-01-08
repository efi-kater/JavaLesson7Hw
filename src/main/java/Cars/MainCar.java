package Cars;

import java.util.Scanner;

public class MainCar {
    public static void main(String[] args) {
        System.out.println("enter a car type");
        Scanner scanner = new Scanner(System.in);
        String typeOfCar = scanner.next();
        Car car = null;
        try {
            car=CarFactory.getCarType(typeOfCar);
            car.drive();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
