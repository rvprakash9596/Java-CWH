public class Recursion1 {

    // Recursive Approach : in recursion we call function itself.
    static int  factorial(int n)
    {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Iteration method

        static int  factorial_iterative(int n)
        {
            if(n==0 || n==1)
            {
                return 1;
            }
            else {
                int product = 1;
                for(int i=1; i<=n; i++ ){
                    product = product*i;
                }
                return product;
            }
        }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("The value of factorial n is :"+factorial(4));
        System.out.println("The value of factorial x is :"+factorial(x));

        System.out.println("The value of factorial product is :"+factorial_iterative(x)); // using iteration
    }
}
