package Cars;

public class Fiat extends Car implements IDrivable{
    @Override
    public void drive() {
        System.out.println(100);
    }
}
