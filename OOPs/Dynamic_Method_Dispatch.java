package OOPs;

class Phone{
    public void showTime(){
        System.out.println("Time is 9:57 PM");
    }
    public void on(){
        System.out.println("Turning on Phone......");
    }
}


class SmartPhone extends Phone{
    public void music(){
        System.out.println(" Playing Music.....");
    }
    public void on(){
        System.out.println("Turning on SmartPhone......");
    }
}


public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        SmartPhone smobj = new SmartPhone();
//        obj.name();

        Phone obj = new SmartPhone(); // Yes it is allowed Logic
        // SmartPhone obj2 = new Phone(); // Not Allowed

        obj.showTime();
        obj.on();
        // obj.music(); // Not Allowed : So this is called Dynamic method dispatch . Because it decide on run time.
        
    }
}