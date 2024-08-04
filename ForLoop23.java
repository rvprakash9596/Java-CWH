import java.util.Scanner;

public class ForLoop23 {
    public static void main(String[] args) {

//     for(int i=1; i<=10; i++)
//     {
//         System.out.println(i);
//     }

//     QUIZ : WAP to print first n odd numbers using for loop;
//        2i = Even number = 0,2,4,6....
//        2i+1 = Odd number = 2,3,5,7....

        //first n odd numbers
//        int n = 5;
//        for(int i=0; i<n; i++)
//        {
//            System.out.println(2*i+1);
//        }

        //first n even numbers
        /*int n2=5;
        for(int i=0; i<n2; i++)
        {
            System.out.println(2*i);
        }*/

        //Decrementing For Loop
        /*for(int i=5; i>0; i--)
        {
            System.out.println(i);
        }*/


//        QUIZ: WAP to print first n natural number in reverse order

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number from which you want to print in reverse order :");
        int n = sc.nextInt(); //5
        int i;
        for(i=n; i!=0; i--)
        {
            System.out.println(i);
        }

    }
}