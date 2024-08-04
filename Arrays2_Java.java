public class Arrays2_Java {
    public static void main(String[] args) {

//        int [] marks = {10,5,55,47,5};
//        System.out.println(marks[2]);
//        System.out.println("The length of this array is :"+marks.length);

//        float [] marks1 = {10,5,55,47,5,88,87,56,13};
//        System.out.println(marks1[5]);


//        float [] marks2 = {10.11f,5.0f,55.45f,47.50f,5.90f,88.09f,87f,56f,13f};
//        System.out.println(marks2[5]);
//        System.out.println("The length of this array is :"+marks2.length);


//        String [] students = {"Hello","Chacha","Kaise ho ","Bhai","Shahil"};
//        System.out.println(students.length);
//        System.out.println(students[1]);


//        int [] marks = {80,74,66,61,40};
        /*System.out.println("The length of this array which name  is marks is :"+marks.length);
        //Displaying the array (Naive way)
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        */

        //Displaying the array (using for loop)
        /*for(int i=0; i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("The length of this array which name  is marks is :"+marks.length);*/

//      Quiz : WAP to print array in reverse order:
        /*int [] num = {45,50,55,60,70,90,76};
        /*System.out.println("Printing using for loop");
        for(int i=0; i<num.length; i++)
        {
            System.out.println(num[i]);
        }
        System.out.println("Printing using for loop in reverse order ...");
        for(int i=num.length-1; i>=0; i--)
        {
            System.out.println(num[i]);
        }
        */

        //for-each loop
        System.out.println("Printing using for-each loop ...");
        int [] num1 = {41,20,5,11,9,40,16};
        for(int element : num1)
        {
            System.out.println(element);
        }





    }
}
