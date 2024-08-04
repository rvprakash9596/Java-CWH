public class PracticeSet6 {
    public static void main(String[] args) {

//Ques 1: Create an arrray of 5 float and calculate their  sum.
        /*float array;
        float [] marks = {10.5f, 87.6f ,56.8f , 45.98f , 77.97f };
        float sum=0;
        for( float element : marks)
        {
            sum +=element;

        }
        System.out.println("The value of sum is :"+sum);
        */

// Ques 2 : WAP to find out whether a given integer is present in array or not ?
        /*
        float [] marks = {10.5f, 87.6f ,56.8f , 45.98f , 77.97f };
        float num = 56.8f;
        boolean isInArray = false;
        for(float element : marks )
        {
            if(num==element)
            {
                isInArray = true;
                break;
            }
        }
        if(isInArray)
        {
            System.out.println("The value is present in the array ");
        }
        else
        {
            System.out.println("The values is not present in the array ");
        }
        */

// Ques 3 : Calculate the average marks from an array containing marks of all students in Physics using for each loop
        /*
        float array;
        float [] marks = {10.5f, 87.6f ,56.8f , 45.98f , 77.97f };
        float sum=0;
        for( float element : marks)
        {
            sum = sum+element;
        }
        System.out.println("The value of average marks is "+ sum/ marks.length);
        */

//Ques 4 ::  WAP to add two matrices of size 2 X 3

        int [] [] mat1 = {{1,2,3},
                          {4,5,6}};
        int [] [] mat2 = {{5,2,3},
                          {1,7,6}};
        int [] [] result = {{0,0,0},
                           {0,0,0}};
        for(int i=0; i<mat1.length; i++)
        {
            for (int j=0; j<mat1[i].length; j++)
            {
                System.out.format("Setting value for i=%d and j=%d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for(int i=0; i<mat1.length; i++)
        {
            for (int j=0; j<mat1[i].length; j++)
            {
                System.out.format("%d %d %d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }




        

//        int x;
//        for(x=0; x<=5; x++)
//        {
//            System.out.println(" Ravi Prakash ");
//        }

    }
}