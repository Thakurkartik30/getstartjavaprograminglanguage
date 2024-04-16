import java.util.Scanner ;

public class Loops {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
 /* int n = sc.nextInt();
  if (n == 2) {
   System.out.println("n is prime");
  } else {
   boolean isprime = true;
   for (int i = 2; i <= Math.sqrt(n); i++) {
    if (n % i == 0) {
     isprime = false;
    }
   }

   if (isprime = true) {
    System.out.println("n is prime");
   } else {
    System.out.println("n is not prime");
   }
  }    */

  // question 3
  /*System.out.println("Enter any positive integer :");
  int num = sc.nextInt();
  int fact = 1;
  for (int i = 1; i<=num;i++){
   fact*=i;
  }

  System.out.println("Factorial is : "+ fact);   */

  // Question 4
 // int n = sc.nextInt();

 // for (int i = 1; i<=10 ;i++){
 //  System.out.println(n +  " * " + i + " = " + n* i);
 // }

      // Question 2
  int number ;
  int choice ;
  int evenSum = 0;
  int oddSum = 0;

  do {
   System.out.println("Enter The Number");
   number = sc.nextInt();
   if (number % 2 == 0){
    evenSum += number;
   } else{
    oddSum += number;
   }
   System.out.println("Do you want to continue press 1 for yes or 0 for no");
   choice = sc.nextInt();
  }  while(choice == 1);

  System.out.println("Sum of even number" + evenSum);
  System.out.println("Sum of odd number" + oddSum);


 }
}


