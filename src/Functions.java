import java.util.Scanner;

public class Functions {

    //syntax
 //   returntype name (){
        //body
   //     return statement;
 //   }
    public static int printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        return 2;
    }
    // syntax with parameter
    public  static void calculateSum(int num1,int num2) { //parameters or formal parameter
        int sum = num1+ num2;
        System.out.println(sum);
    }

    public static void swap(int a,int b) {
        //swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static int multiply(int a , int b ){
       int product = a * b;
       return product;
    }


    public static int factorial(int n){
        int f = 1;
        for (int i =1;i <= n;i++) {
            f *= i;
        }
        return f;
    }

    public static int bincoeff(int n,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int bincoeff = fact_n/(fact_r*fact_nmr);
        return bincoeff ;
    }
    // function to calculate sum of two number
    public static int sum(int a,int b){
        int add = a + b ;
        return add;
    }
    // function to calculate sum of three number
    public static int sum(int a,int b,int c){
        return a+b+c ;
    }
    // function to calculate float sum
    public static float sum(float a,float b){
        return a+b;
    }

    public static  boolean  isprime (int n){
        if (n==2) {
            boolean isprime = true;
        }
        boolean isprime = true;
        for (int i = 2;i<=n-1;i++){
            if (n%i==0){
                isprime = false;
                break;
            }
        }
        return isprime;
    }

    public static void primesInrange(int n){
        for (int i=2; i<=n; i++){
            if (isprime(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();

    }

    public static void binTodec(int binNum){
        int pow = 0;
        int decNum = 0;
        int myNum = binNum;
        while(binNum > 0){
            int lastdigit = binNum % 10;
            decNum =decNum + (lastdigit * (int)Math.pow(2,pow)) ;
            pow ++;
            binNum = binNum/10;

        }
        System.out.println("decimal of "+ myNum +" = "+ decNum);
    }

    public static  void decTobin(int n) {
        int Mynum = n;
        int pow = 0;
        int binNum = 0;
        while(n>0){
            int rem = n % 2;
            binNum =binNum + rem * (int)Math.pow(10,pow);
            pow ++;
           n =  n/2;
        }
        System.out.println("Binary form of "+ Mynum + " = "+ binNum);
    }

    public static void main(String[] args) {

      //  Scanner sc = new Scanner(System.in);
     //   int a = sc.nextInt();
      //  int b = sc.nextInt();
     // calculateSum(a,b) ; //arguments or actual parameters

        //swap - values exchange
       // int a = 5;
       // int b = 8;
     //  swap(a,b)
       ;

       //product of a & b
      //int a = 3;
        //int b = 5;
      //  int prod =multiply(a,b);
      //  System.out.println("a * b = " + prod);
     //   prod =multiply(7,9);
     //   System.out.println("a * b =" + prod);

       // factorial of a number ,n
      //  int n = 7;
       // int fact = factorial(n);
       // System.out.println(fact);

      // Binomial coefficent
       // System.out.println(bincoeff(7,6));

    //overloading using parameter
       // System.out.println(sum(5,8));
       // System.out.println(sum(5,7,1));

       // function overloading using datatype
      //  System.out.println(sum(9,6));
      //  System.out.println(sum(4.6f,8.9f));

       //check if a number is prime or not
        //System.out.println(isprime(9));

        // primes in range
         //      primesInrange(100);

        // bin to dec
        binTodec( 111);

        // dec to bin
        //decTobin(8);
        System.out.println(sum(5,7));


    }

}



