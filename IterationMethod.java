public class IterationMethod {
    static int factorial_iteration(int n){
        if(n==0 || n==1){
            return  1;
        }
        else {
            int product = 1;
            for(int i=1; i<=n; i++){
                product = product*i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        System.out.println("The factorial is :"+factorial_iteration(5));
    }
}