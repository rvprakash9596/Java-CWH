public class PracticeSet5 {
    public static void main(String[] args) {

        //Problem 1
        /*
        int n=5;
        for(int i=n; i>0; i--)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        */


        //Problem 2 : WAP to print first n numbers using while loop.
        /*
        int sum = 0;
        int n=5;
        for(int i=0; i<n; i++)
        {
            sum = sum + (2*i);
        }
        System.out.println("Sum of n even numbers is : "+sum);
        */

        //Problem 3 : WAP to print  multiplication table of a given number n.
        /*
        int n=3;
        for(int i=1; i<=10; i++)
        {
            System.out.printf(" %d X %d = %d\n",n,i,n*i);
        }
        */

        //Problem 4 : WAP to print  multiplication table of 10 in reverse order.
        /*
        int n=3;
        for(int i=10; i>=1; i--)
        {
            System.out.printf(" %d X %d = %d\n",n,i,n*i);
        }
        */

        //Problem 5 : WAP to find factorial of a given number using for loop.


        //Problem 6 : Repeat 5 using while loop.
        /*
        int n=5;
        int i =1;
        int factotial = 1;
        while(i<=n)
        {
            factotial *=i;
            i++;
        }
        System.out.printf("Factorial of %d is : "+factotial,n);
        */

        //Problem 9 : WAP to print table of 8 and sum .
        /*
        int n=8;
        int sum=0;
        for(int i=1; i<=10; i++)
        {
            System.out.printf("%d X %d = %d\n",n,i,n*i);

            sum +=n*i; // for sum
        }
        System.out.println(sum);
         */

    }
}