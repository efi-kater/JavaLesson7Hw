package Cars;

public class BMW extends Car implements IDrivable{
    @Override
    public void drive() {
        System.out.println(140);
    }
}
