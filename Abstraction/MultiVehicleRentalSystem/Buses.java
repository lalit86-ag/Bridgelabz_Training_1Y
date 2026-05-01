package MultiVehicleRentalSystem;


public class Buses implements VehicleStatus{
    @Override
    public void rent(){
        System.out.println("The bus has been rented");
    }
    @Override
    public void returnVehicle(){
        System.out.println("The bus has been returned");
    }
}