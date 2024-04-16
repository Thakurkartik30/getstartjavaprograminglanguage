import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // Print star pattern
     /*   for (int line =1;line <= 10;line++){
            for (int star = 1;star<=line;star++) {
                System.out.print("*");
            }
            System.out.println();
        }  */
       // print inverted star pattern
     /*   int n=9;
     for (int line =1;line<=n;line++){
         for (int star =1;star<=n-line+1; star++){
             System.out.print("*");
         }
         System.out.println();
     }  */

        // print HALF PYRAMID pattern
     /*  int n= 4;
        for (int line = 1; line <= n; line++){
            for (int number=1;number<=line;number++){
                System.out.print(number);
            }
            System.out.println();
        }  */

     // Print CHARACTER Pattern
     /* int n=4;
     char ch ='A';
     //outer loop
     for (int line=1;line<=n;line++){
         //inner loop
         for(int chars =1;chars<=line;chars++){
             System.out.print(ch);
             ch++;
         }
         System.out.println();
     }  */

      // INVERTED & ROTATED HALF-PYRAMID pattern
        int n= 4;
        for (int line =1;line<=n;line++){

        }


    }
}
