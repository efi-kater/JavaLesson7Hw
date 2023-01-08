package Cars;

public class Porsche extends Car implements IDrivable {
    @Override
    public void drive() {
        System.out.println(180);
    }
}
