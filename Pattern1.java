public class Pattern1 {
    public static void main(String args[])
    {
        System.out.println("**** Java Patterns ****");

        /* System.out.println("**** Simple Pattern **** ");
        for(int i=1; i<=5; i++)
        {
            System.out.println("*");
        } */


        /* System.out.println("**** 1. Solid Rectangle ****");
        int n = 4;
        int m = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=m; j++)
            {
                System.out.print(" * ");
            }
            System.out.println(" ");
        } */

        /*
        System.out.println("**** 2. Hollow Reactangle ****");
        int n = 5;
        int m = 10;
        for(int i=1; i<=n; i++)//outer loop
        {
            for(int j=1; j<=m; j++)//inner loop
            {
                //cell=> (i,j)
                if(i==1 || j==1 || i==n ||j==m)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        */

        /*
        System.out.println("**** 3. Half Pyramid ****");
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for( int j=1; j<=i; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
         */

        /*
        System.out.println("**** 4. Inverted Half Pyramid ****");
        int n = 5;
        for(int i=n; i>=1; i--)
        {
            for( int j=1; j<=i; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /*
        System.out.println("**** 5. Inverted Half Pyramid rotated by 180 degree ****");
        int n = 4;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
         */

        System.out.println("**** 6. Half Pyramid with Numbers ****");


    }
}