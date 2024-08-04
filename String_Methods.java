import java.util.Scanner;
public class String_Methods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = " This is a java string methods examples .";

//        String b = new String("is a good boy");
//          System.out.println(name);


//        System.out.println("\t"+b);

//        int value = name.length();
//        System.out.println(value); // 38

//        String lstring = name.toLowerCase();
//        System.out.println(lstring); //this is a java string methods examples

//        String ustring = name.toUpperCase();
//        System.out.println(ustring); // THIS IS A JAVA STRING METHODS EXAMPLES

//        String nonTrimmedString = "                     Ravi Prakash       ";
//        System.out.println(nonTrimmedString); //                      Ravi Prakash

        String name4 = "              Ramu kaka kaise ho aap         ? ";
        System.out.println(name4);

//        System.out.println(name.substring(3));
//        System.out.println(name.substring(8));
//        System.out.println(name.substring(1));
//        System.out.println(name.substring(1,9));
//        System.out.println(name.substring(1,19));
//        System.out.println(name.substring(1,3));

//        System.out.println(name.replace('s','i'));
//        System.out.println(name.replace("This","That"));

//        System.out.println(name.startsWith("This"));//true
//        System.out.println(name.startsWith("Harami"));//false

        /*System.out.println(name.endsWith("examples"));
        System.out.println(name.endsWith("les"));
        System.out.println(name.endsWith("s"));
        System.out.println(name.endsWith("r"));
        System.out.println(name.endsWith("res"));*/

//        System.out.println(name.charAt(5));//i
//        System.out.println(name.charAt(3));//s
//        System.out.println(name.charAt(6));//s
//        System.out.println(name.charAt(10));//j

//        System.out.println(name.indexOf("T"));//0
//        System.out.println(name.indexOf("i"));//2
//        System.out.println(name.indexOf("met"));//22

//        System.out.println(name.equals("This is a java string methods examples"));
//        System.out.println(name.equals("methods"));
//
//        System.out.println(name.equalsIgnoreCase("this is a java string methods examples"));
//        System.out.println(name.equalsIgnoreCase("this is a java string methods "));

//        System.out.println("Hi bro, welcome to \"Escape Sequence\".");
//        System.out.println("I am escape \t sequence");
//        System.out.println("I am escape \b sequence");
//        System.out.println("I am escape \n sequence");
//        System.out.println("I am escape \r sequence");
//        System.out.println("I am escape \f sequence");
//        System.out.println("I am escape \\- sequence");

        String subject = sc.next();
        if(subject.endsWith("Structure"))
        {
            System.out.println("This is Data Structure");
        }
        else if(subject.endsWith("System"))
        {
            System.out.println("This is a Database Management System");
        }
        else if(subject.endsWith("Values"))
        {
            System.out.println("Universal Human Values");
        }
        else
        {
            System.out.println("Did not match from our Database");
        }

    }
}