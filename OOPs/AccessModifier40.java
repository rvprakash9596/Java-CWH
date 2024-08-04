package OOPs;
// Access Modifiers : 1.Private , 2.Default , 3.Protected , 4.Public

class MyEmployee{
    private int id;
    private String name;

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
public class AccessModifier40 {
    public static void main(String[] args) {
        MyEmployee ravi = new MyEmployee();
//        ravi.id=45;
//        ravi.name="Ravi Prakash"; // Throws an error due to private access modifier
        ravi.setName("Ravi Prakash");
        System.out.println(ravi.getName());
        ravi.setId(102);
        System.out.println(ravi.getId());

    }
}