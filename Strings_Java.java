import java.util.Scanner;

public class Strings_Java{
    public static void main(String[] args) {

        char [] str ={ 'R','A','V','I' };
        String s = new String(str);
        System.out.println(s);

        //same as
        String s1="Ravi Prakash";
        System.out.println(s1);

        //same as
        String s2 = new String("Ravi Prakash");
        System.out.println(s2);

        String s3 = "RAM";
        String s4 = "Ram";
        System.out.println(s3 == s4);
        System.out.println("---------------------------------------------------------------------------------");


        // Different ways to print in Java : We can use the following ways to print in Java:

        /*System.out.print() // No newline at the end
        System.out.println() // Prints a new line at the end
        System.out.printf()
        System.out.format()*/

        //String name = "Ravi Prakash Khalilabad";

        //System.out.println(name);  // System.out.println()

        //System.out.print(name);    // System.out.print()

        //System.out.printf(name);   // System.out.printf()

        //System.out.printf("Aman Kumar");  // System.out.printf()

        //System.out.format("ABCD");  // System.out.format()

        int a = 6 ;
        float f = 45.24f ;
        System.out.printf("The value of a is %d and the value of b is %8.2f ",a,f);
        System.out.printf("\n---------------------------------------------------");
        System.out.format("\nThe value of a is %d and the value of b is %f ",a,f);

        Scanner sc = new Scanner(System.in);
        /*System.out.print("Enter Your Name Here : ");
        String name = sc.nextLine(); // nextLine() function takes any length of sentences or words
        //String name = sc.next(); // This next() function takes only one word
        System.out.println("your name is :"+name); */
    }
}