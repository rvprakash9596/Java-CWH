package OOPs;

// Ques 1:>>>
/*class Employee
{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

}*/

// Ques 2:>>> Create a class cellPhone with method to print "Ringing","Vibrating" etc..
/*class CellPhone{
    public void ring(){
        System.out.println("Ringing .......");
    }
    public void vibrate(){
        System.out.println("Vibrating .......");
    }
    public void callFriend(){
        System.out.println("Calling Ritik .......");
    }

}*/

// Ques 3:>>> Create a class Square with a method to initialize its side,calculating area , perimeter etc.
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

// Ques 4:>>> Create a class Rectangle and Repeat 3

// Ques 5:>>> Create a class TommyVercitti for RockStar Games capable of hitting(print hitting....),Naming,Firing etc...
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy ");
    }
    public void run(){
        System.out.println("Running from the enemy ");
    }
    public void fire(){
        System.out.println("Firing on the enemy ");
    }
}

public class PracticeSet8_39 {
    public static void main(String[] args) {

        /*// Problem 1
        Employee Harry = new Employee();
        Harry.setName("Ravi Prakash");
        Harry.salary=23500;
        System.out.println("Name is :"+Harry.getName());
        System.out.println("Salary is : "+Harry.getSalary());*/

        /*// Problem 2
        CellPhone vivoT1 = new CellPhone();
        vivoT1.callFriend();
        vivoT1.vibrate();
        vivoT1.ring();*/

        // Problem 3
        Square sq = new Square();
        sq.side = 3;
        System.out.println("Area is : "+sq.area());
        System.out.println("Perimeter is :"+sq.perimeter());

        // Problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();

    }
}