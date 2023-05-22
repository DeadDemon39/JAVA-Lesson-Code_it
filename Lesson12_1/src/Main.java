
public class Main {
    public static void main(String[] args) {

        Body body = new Body("седан");
        Weels weels = new Weels(4);
        Engine engine = new Engine("BMW", 4.6);

        Car car = new Car(engine, body, weels);
        // System.out.println("Объем двигателя: " + car.getEngine().getVolume());
        System.out.println(car);
    }
}