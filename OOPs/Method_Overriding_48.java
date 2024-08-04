package OOPs;
class A{
    public int ravi(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am Method 2 of Class A");
    }
}
class B extends A{
    @Override
    public void meth2(){ // We can not create private access as : private void meth2 (This qill throw an error...)
        System.out.println("I am Method 2 of Class B");
    }
    public void meth3(){
        System.out.println("I am Method 3 of Class B");
    }
}
public class Method_Overriding_48 {
    public static void main(String[] args) {
    A a = new A();
    a.meth2();

    B b = new B();
    b.meth2();
    b.meth3();
    // So this is called Method Overriding...............
    }
}