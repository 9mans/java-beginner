package poly.car1;

public class Driver {

    private Car car;

    public void setCar(Car car) {
        System.out.println("차량등록");
        this.car = car;
    }

    public void drive() {
        System.out.println("Driver.Drive");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
