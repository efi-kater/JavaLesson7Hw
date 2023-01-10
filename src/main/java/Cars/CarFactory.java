package Cars;

public class CarFactory {
    public static Car getCarType(String carType) throws Exception {
        String type=carType;
        Car car = null;
        if (carType.equalsIgnoreCase(String.valueOf(CarTypes.Fiat))){
            car = new Fiat();
        } else if (carType.equalsIgnoreCase(String.valueOf(CarTypes.BMW))) {
            car = new BMW();

        } else if (carType.equalsIgnoreCase(String.valueOf(CarTypes.Porsche))) {
            car= new Porsche();

        } else {
            throw new Exception("type of car is not supported, please try again");
        }
        return car;

    }
}
