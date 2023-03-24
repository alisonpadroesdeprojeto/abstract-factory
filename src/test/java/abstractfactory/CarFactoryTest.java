package abstractfactory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarFactoryTest {

    @Test
    public void testBasicEngine() {
        CarFactory carFactory = new EconomyCarFactory();
        Car car = new Car(carFactory);
        assertEquals("Basic engine started", car.startEngine());
    }

    @Test
    public void testBasicSuspension() {
        CarFactory carFactory = new EconomyCarFactory();
        Car car = new Car(carFactory);
        assertEquals("Basic suspension", car.getSuspensionType());
    }

    @Test
    public void testManualTransmission() {
        CarFactory carFactory = new EconomyCarFactory();
        Car car = new Car(carFactory);
        assertEquals("Manual transmission", car.getTransmissionType());
    }

    @Test
    public void testTurboEngine() {
        CarFactory carFactory = new LuxuryCarFactory();
        Car car = new Car(carFactory);
        assertEquals("Turbo engine started", car.startEngine());
    }

    @Test
    public void testSportsSuspension() {
        CarFactory carFactory = new LuxuryCarFactory();
        Car car = new Car(carFactory);
        assertEquals("Sports suspension", car.getSuspensionType());
    }

    @Test
    public void testAutomaticTransmission() {
        CarFactory carFactory = new LuxuryCarFactory();
        Car car = new Car(carFactory);
        assertEquals("Automatic transmission", car.getTransmissionType());
    }
}