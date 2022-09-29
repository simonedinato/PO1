public class Car {
    double fuel;
    //double FUEL_CONSUMPTION = 0.01; // 1% of fuel per km
    double speed;
    FuelType fuelType;
    void brake(){
        speed = 0.0;
    }

    void refuel(double amount){
        fuel += amount;
    }

    void accelerate(double amount){
        if (fuel > 0){
            speed += amount;
            fuel -= amount*fuelType.FUEL_CONSUMPTION;
        }
    }
    

    
}
