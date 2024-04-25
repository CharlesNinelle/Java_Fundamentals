package Oefening2;

public class OuterClass {
    private int num1;
    private int num2;

    //Constructor
    public OuterClass(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }
    //Methoden voor het wijzigen van waarden
    //Methods for changing values
    public void setNum1(int num1){
        this.num1;
    }
    public void setNum2(int num2){
        this.num2;
    }
public class MathFunctions{
        public int sum(){
            return num1+num2
        }
        public int min(){
            return Math.min(num1,num2);
        }
        public int max(){
            return Math.max(num1,num2);
        }
}
}
