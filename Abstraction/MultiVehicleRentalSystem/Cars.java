package MultiVehicleRentalSystem;

public class Cars implements VehicleStatus{
    @Override
    public void rent(){
        System.out.println("The car has been rented");
    }
    @Override
    public void returnVehicle(){
        System.out.println("The car has been returned");
    }
}