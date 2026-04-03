package poly.car1;

import poly.car0.K3Car;
import poly.car0.Model3Car;

public class Driver {

    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다" + car);
        this.car = car;
    }

    public void drive(){
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
