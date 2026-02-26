public class ElevatorExecutor {

    public static void main(String[] args) {

        Elevator.createElevator("Otis",1000,0,10,true,"Passenger",1.5);
        Elevator.getElevatorDetails();

        Elevator.createElevator("Schindler",1200,5,15,true,"Passenger",1.8);
        Elevator.getElevatorDetails();

        Elevator.createElevator("Kone",1500,2,20,true,"Freight",1.2);
        Elevator.getElevatorDetails();

        Elevator.createElevator("Mitsubishi",1000,0,12,true,"Passenger",1.6);
        Elevator.getElevatorDetails();

        Elevator.createElevator("Hitachi",1300,3,18,true,"Freight",1.4);
        Elevator.getElevatorDetails();

        Elevator.createElevator("Thyssenkrupp",1600,1,25,true,"Passenger",1.9);
        Elevator.getElevatorDetails();

        Elevator.createElevator("Toshiba",1100,0,15,true,"Passenger",1.5);
        Elevator.getElevatorDetails();

        Elevator.createElevator("Hyundai",900,0,10,true,"Passenger",1.2);
        Elevator.getElevatorDetails();

        Elevator.createElevator("Fujitec",1200,4,20,true,"Freight",1.3);
        Elevator.getElevatorDetails();

        Elevator.createElevator("Johnson Lifts",1000,0,8,true,"Passenger",1.0);
        Elevator.getElevatorDetails();
    }
}