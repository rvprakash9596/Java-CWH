import java.util.Scanner;
public class FibonacciSeries1 {

    // Fibonacci Series using for loop
    public static void main(String[] args) {
        /*int n=10 , first_term= 0, second_term=1 ;
        System.out.print("Fibonacci Series till "+n+" Term is : ");
        for(int i=1; i<=n; ++i){
            System.out.print(first_term+" , ");
            int nextTerm = first_term + second_term ;
            first_term = second_term;
            second_term=nextTerm;
        }*/


        // Fibonacci series using while loop

        /*int n=6 , first=0, second=1, i=1;
        System.out.print(" The fibonnaci series up to "+n+"Term is : ");
        while(i<=n){
            System.out.println(first+",");
            int nextTerm=first+second;
            first = second;
            second = nextTerm;
            i++;
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many terms you want to print fibonacci series :");
        int n = sc.nextInt();

        int i=0,j=1,nextTerm;
        System.out.print("Fibonacci series is :");
        for(int c=0; c<n; c++){
            if(c<=1)
                nextTerm=c;
            else {
                nextTerm = i + j;
                i = j;
                j = nextTerm;
            }
            System.out.print(nextTerm +",");
            }
    }
}