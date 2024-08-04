package OOPs;
class Base1{
    Base1(){
        System.out.println(" I am a constructor ");
    }
    Base1(int x){
        System.out.println(" I am an overloaded constructor with  value of x as : "+x);
    }

    /* This is getter and setter for variable x. This is not used here.
    public int x ;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }*/


}

class Derived1 extends Base1{ // Creating a derived class
    Derived1(){
//        super (5);
        System.out.println("I am a Derived class cosntructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of the Derived Class with value of y as : "+y);
    }

    /*This is getter and setter for variable x.This is not used heer.
    public int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }*/



}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of Derived Constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an Overloaded Constructor of Derived With value of z as :"+z);
    }
}

public class Constructor_in_Inheritance46 {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Derived1 d = new Derived1();
//        Derived1 d1 = new Derived1(4,5);
//        ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd1 = new ChildOfDerived(43,44,77);

    }
}