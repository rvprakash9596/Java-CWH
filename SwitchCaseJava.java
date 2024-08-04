import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
public class SwitchCaseJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        switch (day)
        {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");

        }

        /*int age;
        System.out.print("Enter your experience in year : ");
        age = sc.nextInt();*/

        /*if(age>56)
        {
            System.out.println("You are experienced");
        }
        else if (age >46)
        {
            System.out.println("You are semi_experienced");
        }
        else if (age > 36)
        {
            System.out.println("You are beginner level");
        }
        else
        {
            System.out.println("You are a fresher ");
        }*/

        /*Switch Case : Switch case is used when we have to make a choice between number of alternatives for a given variable
        Switch (var){
        case c1:
        -------
        case c2:
        -------
        case c3:
        -------
        default:
        sout */

       /* switch (age)
       {
            case 18:
                System.out.println("You are going to become an adult!");
                break;
            case 23:
                System.out.println("You are going to join a job");
                break;
            case 60:
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoy your life");
        }
        System.out.println("Thanks for using java switch case statements !");  */

        /*char ch = 'R';
        switch(ch){
            case 'R':
                System.out.println("Hello bahan ji  , kaisi hain aap ?");
                break;
            case  'r':
                System.out.println("Ji bhai sahab , mai acchi hun . Aap bata kaise ho?");
                break;
            case 's':
                System.out.println("ji mai bhi accha hun");
                break;
            default:
                System.out.println("Bye Bye !");
        }
        System.out.println("Thanks for using java switch case statement "); */

        /*System.out.println("Enter your name :");
        String name = sc.nextLine();
        switch(name)
        {
            case "Aman":
                System.out.println("Hello Aman  , kaise ho ?");
                break;
            case  "Akshay":
                System.out.println("Hello Akshay  , kaise ho ?");
                break;
            case "Ritik || ritik":
                System.out.println("Hello  Ritik  , kaise ho ?");
                break;
            default:
                System.out.println("Sb log thik to ho na ???");
        }
        System.out.println("Sada sughana rho "+name);
        */
    }
}