import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args)  {

        Scanner sc = new Scanner (System.in);
    /*  int n = sc.nextInt();
        switch (n){
            case 1 :System.out.println("Monday");
               break;
            case 2 :System.out.println("Tuesday");
               break;
            case 3 :System.out.println("wednesday");
               break;
            case 4 :System.out.println("Thursday");
               break;
            case 5 :System.out.println("Friday");
               break;
            case 6 :System.out.println("Saturday");
               break;
            case 7 :System.out.println("Sunday");
         }     */


        // Question 4
        System.out.println("Enter the Year");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean w =((year % 100 == 0) && (year % 400 == 0) );

       if (x && (y||w) ){
           System.out.println(year + "is a leap year");
         }
       else {
           System.out.println(year + "is not a leap year ");
       }

     }
   }