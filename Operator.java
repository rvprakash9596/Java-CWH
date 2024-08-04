public class Operator {
    public static void main(String args[]){

//        Operators: Operators are used to perform diff operation on variables.There are following types of operators in java-
//                1.Arithmetic Operators
//                2.Assignment Operators
//                3.Relational/Conditional/Comparison Operators
//                4.Logical Operators
//                5.Unary Operators

//1. Arithmetic Operators:+  -  *  /  %
        
        int x=10;
        int y=20;
        int sum=x+y;
        int diff=x-y;
        System.out.println("Sum = "+sum);
        System.out.println("Difference = "+diff);
        System.out.println(y*4);
        System.out.println(30/5);
        System.out.println(30%4);

//2. Assignment Operators: = += -= *= /= %=

        int a=10;
        System.out.println("Values of a is : "+a);
        a+=20;
        System.out.println("value of a is : "+a);
        System.out.println("===============");
        int b=6;
        System.out.println("value of a is :"+b);
        b*=5;
        System.out.println("value of b is :"+b);

//3.Relational/Conditional/Comparison Operators : < > <= >= == !=
//Note: Comparison Operator always return boolean value.

        int c=10;
        int d=20;
        boolean result1=c<d;
        boolean result2=d>c;
        System.out.println(result1 +"\t"+result2);
        System.out.println("===============");
        System.out.println(c<=10);
        System.out.println(3>=d);
        System.out.println("---------------");
        System.out.println(c==10);
        System.out.println(d==30);
        System.out.println("==============");
        System.out.println(c!=10);
        System.out.println(d!=30);

    }
}
