public class RoadBike extends Bike {
    private int tireWidht;
    
    public void setTireWidht(int widht) {
        tireWidht = widht;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Tire Widht : " + tireWidht + " mm");
        System.out.println("Bike Type : Road Bike");
    }
}
