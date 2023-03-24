package abstractfactory;

public class LuxuryCarFactory implements CarFactory {
    public Engine createEngine() {
        return new TurboEngine();
    }
    public Suspension createSuspension() {
        return new SportsSuspension();
    }
    public Transmission createTransmission() {
        return new AutomaticTransmission();
    }
}