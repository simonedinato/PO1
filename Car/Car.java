public class Car {
    double fuel;
    //double FUEL_CONSUMPTION = 0.01; // 1% of fuel per km
    double speed;
    FuelType fuelType;
    void brake(){
        speed = 0.0;
    }

    void refuel(FuelTank tank){
        if(tank.type.name.equals(fuelType.name)) fuel += tank.amount;
        else System.err.println("I cannot use" + tank.type.name + "with a car with" + fuelType.name);
    }

    void accelerate(double amount){
        if (fuel > 0){
            speed += amount;
            fuel -= amount*fuelType.FUEL_CONSUMPTION;
        }
    }
    

    
}
