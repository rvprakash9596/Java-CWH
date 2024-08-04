public class Break_Continue {
    public static void main(String[] args)
    {
        System.out.println("**********Java Break and Continue Statement****************");

       /*
       for(int i=1; i<=5; i++)
        {
            System.out.println(i);
            System.out.println("Hello bhai coffee piyoge ? !");
            if(i==2)
            {
                System.out.println("Ending of loops ");
                break;
            }
        }
        */

        /*
        int i=1;
        while(i<=5)
        {
            System.out.println(i);
            System.out.println("Chalna hai to chlo be chay peene canteen");
            if(i==2)
            {
                System.out.println("Ending of loops ");
                break;
            }
            i++;
        }
        System.out.println("Loops end here");
        */

        /*
        int i=1;
        do
        {
            System.out.println(i);
            System.out.println("Same work do while loop se bhi possible hai  ");
            if(i==3)
            {
                System.out.println("Yaha i ki value 3 hai to 3 tk print krega ye ");
                break;
            }
            i++;
        }
        while(i<5);
        System.out.println("Yaha loop end ho gya");
        */


        /*
        for(int i=0; i<=6; i++)
        {
            if(i==2)
            {
                System.out.println("i ki value yaha pr jb 2 hai ab");
                continue;
            }
            System.out.println(i);
            System.out.println("Continue is the great be");
        }
         */

        int i=0;
        do
        {
            i++;
            if(i==4)
            {
                System.out.println("i ki value abhi 4 hai");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }
        while(i<5);
        System.out.println("Loop ends here");


    }
}