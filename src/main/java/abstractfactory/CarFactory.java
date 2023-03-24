package abstractfactory;

public interface CarFactory {
    Engine createEngine();
    Suspension createSuspension();
    Transmission createTransmission();
}