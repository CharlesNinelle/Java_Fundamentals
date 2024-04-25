package Oefening3;

abstract class Car implements Switch1, Motor {
    private boolean engineOn;
    private int doors = 5;

    @Override
    public void toggleSwith(){
        if (engineOn){
            System.out.println("Car engine is OFF now.");
            engineOn=false;
        }else {
            System.out.println("Car engine is ON now.");
            engineOn=true;
        }
    }
    @Override
    public void gas(){
        if (engineOn) {
            System.out.println("Car is accelerating.");
        }else {
            System.out.println("Cannot accelerate.");
        }
    }
    public void openDoor(int door){
        if (door>=1&& door<doors){
            System.out.println("Door "+door+"is open");
        }else {
            System.out.println("Invalid door number");
        }
    }
    public void closeDoor(int door){
        if (door>=1&& door<doors){
            System.out.println("Door "+door+"is close");
        }else {
            System.out.println("Invalid door number");
        }
    }
    private boolean doorsClosed(){
        return doors==0;
    }
}
