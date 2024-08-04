package OOPs;
class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non parameterized of circle");
    }

    Circle(int r){
        System.out.println("I am circle parameterized constructor ");
        this.radius=r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r,int h){
    super(r);
    System.out.println("I am Cylinder1 Parameterized constructor.");
    this.height = h;
    }

    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}


public class PracticeSet10_52 {
    public static void main(String[] args) {
        // Problem 1 : Create a class circle and use inheritance to create another class cylinder from it.
//        Circle objC = new Circle(12);
        Cylinder1 obj = new Cylinder1(12,4);

    }
}