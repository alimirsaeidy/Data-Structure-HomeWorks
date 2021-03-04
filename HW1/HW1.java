public class Recursive {

    static void f(int number){
        if(number == 1)
            return;
        else if(number%2 == 0){
            System.out.println( number + " / 2 = " + number/2);
            f(number/2);

        }
        else{
            int n = 3*number + 1;
            System.out.println(number + " * 3 + 1 = " + n);
            f(n);

        }
    }

    static void decToBin(int n){
        if(n ==1 )
        {
            System.out.print(1);
            return;
        }
        decToBin(n/2);
        System.out.print(n%2);
    }

    static void toBase(int n , int base){
        if(n<base)
        {
            System.out.print(n);
            return;
        }
        toBase(n/base , base);
        System.out.print(n % base);

    }


    static void reverse(String s)
    {
        if(s.length() == 0)
            return;

        String arr[] = s.split(" ");
        System.out.print(arr[arr.length-1] + " ");
        reverse(s.substring(0,(s.indexOf(arr[arr.length-1]))));
    }

    public static void main(String[] args)
    {
        f(3);
        System.out.println();
        decToBin(8);
        System.out.println();
        toBase(99,4);
        System.out.println();
        reverse("there are four people in hotel");

    }
}
