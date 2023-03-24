package abstractfactory;

public class Car {
    private final Engine engine;
    private final Suspension suspension;
    private final Transmission transmission;

    public Car(CarFactory carFactory) {
        this.engine = carFactory.createEngine();
        this.suspension = carFactory.createSuspension();
        this.transmission = carFactory.createTransmission();
    }

    public String startEngine() {
        return this.engine.start();
    }

    public String getSuspensionType() {
        return this.suspension.getType();
    }

    public String getTransmissionType() {
        return this.transmission.getType();
    }
}
