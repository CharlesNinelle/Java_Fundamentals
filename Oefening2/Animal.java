package Oefening2;

abstract class Animal {
    Animal(){//constractor abstract class
        System.out.println("Animals make sound");
    }
    abstract void animalMethod();
    void ordinaryMethod(){
        //System.out.println("Dat is ordynary method");
    }
}
