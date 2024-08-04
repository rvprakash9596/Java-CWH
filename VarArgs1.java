public class VarArgs1 {
//    static int sum(int a, int b){
//        return a+b;
//    }
//
//    static int sum(int a, int b , int c){
//        return a+b+c;
//    }
//
//    static int sum(int a, int b , int c ,int d){
//        return a+b+c+d;
//    }

//     we don't have to use abobe methods because this method is some where complex . We just use following methods
    /*static int sum(int ...arr){
        int result = 0;
        for(int a:arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("\n ********* Welcome to variable arguments *********");
        System.out.println(" =================================================");

        System.out.println(sum(5,7));
        System.out.println(sum(6));
        System.out.println(sum());
        System.out.println("The sum of 4 and 5 is :"+sum(4,5));
        System.out.println("The sum of 4 ,5, 6 is :"+sum(4,5,6));
        System.out.println("The sum of 4 ,5, 6,7 is :"+sum(4,5,6,7));*/

    // In this code at least 1 argument necessary
    static int sum(int x , int ...arr){
        int result = x; // minimum 1 argument required
        for(int a:arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,7));
        System.out.println(sum(6));
        System.out.println(sum(0));
        System.out.println("The sum of 4 and 5 is :"+sum(4,5));
        System.out.println("The sum of 4 ,5, 6 is :"+sum(4,5,6));
        System.out.println("The sum of 4 ,5, 6,7 is :"+sum(4,5,6,7));
    }
}