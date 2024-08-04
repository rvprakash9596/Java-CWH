import java.util.Scanner;
public class PracticeSet4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Ques 1:
       /* int a = 11;
        if(a==11)
        {
            System.out.println("I am 11");
        }
        else
        {
            System.out.println("I am other than 11");
        }*/


/*       Ques 2:WAP to find whether a student is pass or fail; if it requires total 40%
and at least 33% in each student to pass. Assume 3 subjects and take marks as an input from the user .*/

        /* byte m1,m2,m3;

        System.out.println("Enter your marks in DBMS");
        m1=sc.nextByte();
        System.out.println("Enter your marks in Data Structure");
        m2=sc.nextByte();
        System.out.println("Enter your marks in DAA");
        m3=sc.nextByte();

        float avg = (m1+m2+m3)/3f;
        System.out.println("Your Overall percentage is "+avg);
        if(avg > 40 && m1>33 && m2>33 && m3>33)
        {
            System.out.println("Shubhkamanaye bhai , tum to pass ho gye");
        }
        else
        {
            System.out.println("Sorry bhai  ,tum fail ho gye bsdk , is baar acche se padhna .");
        }  */

//        Ques 3: calculate income tax paid by an employee to the government as per the slabs mentioned below :

       /* System.out.print("Enter your annual income :");
        float income = sc.nextFloat();
        float tax = 0;

        if(income<=2.5f)
        {
            tax=tax+0;
        }
        else if(income>2.5f && income<=5f)
        {
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income<=10.0f)
        {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.02f * (income - 5f);
        }
        else if(income>10.0f)
        {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.02f * (10f - 5f);
            tax = tax + 0.03f * (income - 10.0f);
        }
        System.out.println("The total tax paied by the employee :"+tax);
        */

//        Ques 4 :WAP to find out the day of the week given the number [1 for monday , 2 for tuesday ...... and so on]

        /*int day =sc.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }*/

//        Ques 5: WAP to find whether a year enered by the user is a leap year or not ?

        System.out.print("Enter  the year : ");
        int year = sc.nextInt();
       /* if(year%4==0)
        {
            System.out.println("This is a leap Year");
        }
        else if(year % 100 == 0)
        {
            System.out.println("This is leap Year");
        }
        else if (year%400==0)
        {
            System.out.println("This is a leap year");
        }
        else
        {
            System.out.println("This is not a leap year");
        } */


        if(year % 4==0 || year % 100==0 || year % 400 ==0)
        {
            System.out.println(year +" is a leap year");
        }
        else
        {
            System.out.println(year+" is not a leap year");
        }




//        Ques 6: WAP to find out the type of website from the () -> url
       /* System.out.print("Enter your website name with domain : ");
        String website = sc.next();
        if(website.endsWith(".com"))
        {
            System.out.println("O teri ! Ye to  commercial website hai ..");
        }
        else if(website.endsWith(".in"))
        {
            System.out.println("OO teri ! This is a indian website ");
        }
        else if(website.endsWith(".edu"))
        {
            System.out.println("This is a educational website");
        }
        else
        {
            System.out.println("Waah bhai sahab waah !, aapne to galat website ka naam likh diya hai");
        }   */
                

    }
}