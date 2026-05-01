package MultiVehicleRentalSystem;

public class Bikes implements VehicleStatus{
    @Override
    public void rent(){
        System.out.println("The bike has been rented");
    }
    @Override
    public void returnVehicle(){
        System.out.println("The bike has been returned");
    }
}