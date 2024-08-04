package OOPs;

import javax.naming.Name;

class MyMainEmployee{
    private int id;
    private String name;


    public MyMainEmployee(){
        id=45;
        name="Your name here : ";
    }
    public MyMainEmployee(String f_name){
        id=45;
        name=f_name;
    }
    public MyMainEmployee(String myName,int myId){
        id=45;
        name=myName;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class Constructors42 {
    public static void main(String[] args) {
        MyMainEmployee ravi = new MyMainEmployee("Ramu KAKA Kaise ho aap ?",15);
        MyMainEmployee ravi1 = new MyMainEmployee("Ravi");
        ravi.setName("Ravi Prakash");
        ravi.setId(4344);
        System.out.println(ravi.getId());
        System.out.println(ravi.getName());
    }
}