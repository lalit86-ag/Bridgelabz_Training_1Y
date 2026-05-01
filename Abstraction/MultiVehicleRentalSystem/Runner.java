package MultiVehicleRentalSystem;
public class Runner {
    public static void main(String[] args){
        VehicleStatus car1=new Cars();
        VehicleStatus bike1=new Bikes();
        VehicleStatus bus1=new Buses();
        System.out.println("-----The Status of the Car-----");
        car1.rent();
        car1.returnVehicle();
        System.out.println("-----The Status of the Bike-----");
        bike1.rent();
        bike1.returnVehicle();
        System.out.println("-----The Status of the Bus-----");
        bus1.rent();
        bus1.returnVehicle();
    }
}
