

public class Bike {
    private String brand;
    private int speed;
    private int gear=1;

    //gear 1:max 5km/h, gear 2:max 10km/h, gear 3;... gear 6:max 60km/h

    private final int [] GEAR_SPEED_LIMIT = {5, 10, 25, 30, 40, 60};
    public void setBrand(String brandName){
        brand = brandName;
    }

    public void gearChanges(int gearValue){
        if (gearValue < 1 || gearValue > 6){
            System.out.println("invalid gear value. Gear must be between 1 and 6.");
        }
        else{
            gear = gearValue;
        }
    }

    public int speedAcceleration(int increment) {
        speed += increment;
        if (speed > GEAR_SPEED_LIMIT[gear - 1]) {
            speed = GEAR_SPEED_LIMIT[gear - 1];
        }
        return speed;
    }

    public int speedDeceleration(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
        return speed;
    }

    public void printInfo(){
        System.out.println("Bike Information:");
        System.out.println("Brand :" + brand);
        System.out.println("Speed :" + speed);
        System.out.println("Gear :" + gear);
    }
}