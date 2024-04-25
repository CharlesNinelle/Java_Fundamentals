package Oefening2;

abstract class Car implements Switch1,Motor {
    private boolean engineOn;

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
}
