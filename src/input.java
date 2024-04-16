import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       // String input = sc.next();
       // System.out.println(input);
      //  String name = sc.nextLine();
       // System.out.println(name);
       // int number = sc.nextInt();
       // System.out.println(number);
      //  float price = sc.nextFloat();
        //System.out.println(price);
       // double price = sc.nextDouble();
       // System.out.println(price);
       // boolean decision = sc.nextBoolean() ;
       // System.out.println(decision);
        //short mark = sc.nextShort();
       // System.out.println(mark);
       // long code = sc.nextLong();
       // System.out.println(code);


        // Sum of a & b
      //  int a = sc.nextInt();
      //  int b = sc.nextInt();
       //int  sum = a + b ;
      //  System.out.println(sum);
       // float a = sc.nextFloat();
      //  float b = sc.nextFloat();
      //  float sum = a + b ;
     //   System.out.println(sum);

        // Product of a & b
      //  int a = sc.nextInt();
      //  int b = sc.nextInt();
      //  int product = a * b ;
       // System.out.println(product);



        // Area Of Circle
       // float r = sc.nextFloat();
        // float area =  3.14f * r * r;

        //Type conversion

       // int a = 45;
       // long b = a;
       // System.out.println(b);

        // lossy conversion
       // int a = sc.nextFloat();
        //System.out.println(a);

        // Type casting
     //   float a = 99.999f;
       // int marks = (int) a;
        //System.out.println(marks);
       // char ch = 'c';
       // int number =ch;
        //System.out.println(number);

        //Type Promotion in Expression
       // char a = 'a';
       // char b = 'b';
       // System.out.println((int)(b));
       // System.out.println((int)(a));
       // System.out.println(b-a);

      //  short k = 4;
        //byte j = 56;
       // char c = 'c';
       // byte bt = (byte)(k + j+ c) ;
       // System.out.println(bt);

       //int a = 25 ;
      //  float b = 3.89f;
      //  long c = 89;
      //  double d = 67.98;
       // double ans = a + b + c +d ;
       // System.out.println(ans);
        // wrong
     //   byte b = 5;
      //  b = b * 3;
        // right
       // byte c = 4;
       // c = (byte)(c * 3);
       // System.out.println(c);

        //Practice Question
        // Question 1
      /*  int a = sc .nextInt();
        int b = sc .nextInt();
        int c = sc.nextInt();
        int avg = a + b + c/3;
        System.out.println("Average is " + avg); */

        //Question 2
      /*  int side = sc.nextInt();
        int area = side * side ;
        System.out.println("Area of Square : " + area); */

        //Question 3
        System.out.println("Price of pencil :");
        float pencil = sc.nextFloat();
        System.out.println("Price of pen :");
        float pen = sc.nextFloat();
        System.out.println("Price of eraser : ");
        float eraser = sc.nextFloat();
        float Total = pencil + pen + eraser;
        System.out.println(" Bill is: " + Total );

        //Add on - with 18% tax
        float newTotal = Total + (0.18f* Total);
        System.out.println("Bill with 18% tax :" + newTotal);
    }
}
