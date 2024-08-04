import java.util.Scanner;
public class Exercise1 {
    public static void main(String args[]){

//        Exercise1.1- Write a program to calculate percentage of a given student in CBSE board exam.His marks from 5 subjects must be
//                taken as input from keyboard (marks of out of 100).

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics Marks :");
        int p=sc.nextInt();
        System.out.print("Enter Chemistry Marks :");
        int c=sc.nextInt();
        System.out.print("Enter Mathematics Marks :");
        int m=sc.nextInt();
        System.out.print("Enter Biology Marks :");
        int b=sc.nextInt();
        System.out.print("Enter Drawing Marks :");
        int d=sc.nextInt();
        int sum=p+c+m+b+d;
        float percentage = sum / 5F;
        System.out.println("You have secured "+percentage+" %");


 /*       int x=20;
        int y=30;
        int z=45;
        int m=80;
        int n=90;
        int sum=x+y+z+m+n;
        System.out.println(sum/5f);   */

//        Ques 1: WAP to add three number in java.
//        int a=45;
//        int b=24;
//        int c=97;
//        int sum=a+b+c;
//        System.out.println(sum);

//        Ques 2 :WAP to calculate CGPA using marks of three subjects (out of 100)
//        float sub1=80;
//        float sub2=74;
//        float sub3=71;
//        float cgpa=(sub1+sub2+sub3)/30;
//        System.out.println(cgpa+" CGPA");

//        Ques 3 : WAP which asks the user to enter his/her name and greets them with "Hello <name> , have a good day" text.
//        System.out.print("Whst is your name :");
//        String name= sc.nextLine();
//        System.out.println("Hello " +name+ ", have a good day.");

//        Ques 4 : WAP to convert KM to Miles.
//        System.out.println("Enter how many Kilometer you have drive today :");
//        float  km=sc.nextFloat();
//        //km to miles conversion
//        float miles=(0.6213711922f * km);
//        System.out.print("You have drive "+ miles +" Miles today.");
//        System.out.println("Thank You !");

//        Ques 5 : WAP to detect whether a number entered by the user is integer or not.
//        System.out.println("Enter your number : ");
//        System.out.println(sc.hasNextInt());

    }
}
