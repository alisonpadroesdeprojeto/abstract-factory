package abstractfactory;

public class EconomyCarFactory implements CarFactory {
    public Engine createEngine() {
        return new BasicEngine();
    }
    public Suspension createSuspension() {
        return new BasicSuspension();
    }
    public Transmission createTransmission() {
        return new ManualTransmission();
    }
}