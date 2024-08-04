public class ResultingDataType {
    public static void main(String[] args) {

        /*byte x=5;
        int y=6;
        short z=8;
        int a=600+6;
        float f=20.40f;
        int a1=y+z;
        float b=20.45f + y;

        System.out.println(b);
        System.out.println(a);
        System.out.println(f+a);
        System.out.println(y+z);*/
        System.out.println("---------------------");

        //increment and decrement operator

      /*  a++ => first use the value then increment by 1
        ++a => first increment the value then use it

        a-- => first use the value then decrement by 1
        --a => first deccrement the value then use it  */


        int i=56;
//        System.out.println(i++);
        System.out.println(i);//56
        System.out.println(i++);//first use then increment by 1
        System.out.println(i);//57
        System.out.println(++i);//first increment by 1 then print 58
        System.out.println(i);//58
        System.out.println("---------------------");
        int a=20;
        System.out.println(a);
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a+1);
        System.out.println("---------------------");

    /*    int j=50;
        int k=60;
        int l=++k;
        System.out.println(l);
        System.out.println(++j);
        System.out.println("---------------------");    */

    /*    int x=20;
        System.out.println(x--);
        System.out.println(x);
        System.out.println(--x);
        x--;
        System.out.println(x);
        --x;
        System.out.println(x);    */

//        Quiz:
        int y=7;
        int x=++y*8;
        System.out.println(x);

        char ch='a';
        System.out.println(ch++);
        System.out.println(ch);
        System.out.println(++ch);
        System.out.println(--ch);
        System.out.println(ch--);
        System.out.println(ch);



    }
}
