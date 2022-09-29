public class runner {
    public static void main(String[] args){
        Car myCar = new Car();
        FuelType diesel = new FuelType();
        diesel.name = "diesel";
        diesel.FUEL_CONSUMPTION = 0.015;
        diesel.costPerLiter = 1.7;
        myCar.refuel(10);
        myCar.accelerate(100);
        myCar.brake();
    }
    
}
