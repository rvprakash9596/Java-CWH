import java.util.Scanner;
public class PracticeSet2 {
    public static void main(String[] args) {
        // Chapter 2 - Practice Set

        //Ques 1 : output of a?
        /*float a=7/4 * 9/2;
        System.out.println(a);

        float a1=7/4f * 9/2f;
        System.out.println(a1);*/

        // Ques 2: WAP to encrypt a grade by adding 8 to it. decrypt it to show the correct grade.
        /*char grade='B';
        System.out.println(grade);
        //encrypt
        grade = (char) (grade+8);
        System.out.println(grade);

        //decrypt
        grade =  (char) (grade-8);
        System.out.println(grade);  */

        // Ques 3: use comparison operator to find out whether a given number is graeter than the user entered number or not ?
        Scanner sc =  new Scanner(System.in);
        /*int b = sc.nextInt();
        System.out.println(b>8);*/

        // Ques 4 :: ( v*v - u*u ) / 2as ===??
        float a=2, s=2, v=8,u=2;
        float res=(v*v- u*u)/(2*a*s);
        System.out.println(res);

        // Ques 5: value of x = ??
        int x=7;
        int y = 7*49/7+35/7;
        System.out.println(y);

    }
}
