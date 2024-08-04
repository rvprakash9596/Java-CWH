public class PracticeSet7 {
    static void multiplication(int n){
        for(int i=1; i<=10; i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }

    static void pattern1(int n1){
        for(int i=0; i<n1; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sumrec(int a){
        if(a==1){
            return 1;
        }
        else {
            return a+sumrec(a-1);
        }
    }

    static void InvHalfPyramid(int n2){
        for(int i=n2; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fib(int f){
        /*if(f==1){
            return 0;
        }
        else if (f==2) {
            return 1;
        }*/
        if(f==1 || f==2){
            return f-1;
        }
        else {
            return fib(f-1) + fib(f-2);
        }
    }

    static void pattern1_rec(int n){
        if(n>0){
            pattern1_rec(n-1);
            for(int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       // Problem 1 : WAP to print multiplication table of a number n.
        multiplication(5);
        System.out.println("------------------");

       // Problem 2 : Pattern
        pattern1(8);
        System.out.println("------------------");

       // Problem 3 : Write a recursive function to calculate sum of first n natural numbers.
        int c=sumrec(8);
        System.out.println(c);
        System.out.println("------------------");

      // Problem 4 : Inverted Half Pyramid Pattern
        InvHalfPyramid(10);
        System.out.println("------------------");

      // Problem 5 :Fibonacci Series using Recursion
        int result = fib(10);
        System.out.println(result);
        System.out.println("------------------");


      // Problem 8:
        pattern1_rec(8);
        System.out.println("------------------");

    }
}