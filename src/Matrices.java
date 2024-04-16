import java.util.Arrays;
import java .util.*;

public class Matrices {


    public static boolean searchint(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println(" found at cell (" + i + ", " + j + ") ");
                    return true;
                }
            }
        }
        System.out.println(" key not found");
        return false;


    }

    public static void Largestnumber(int matrix[][]) {
        int largest = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.print("the largest number is : " + largest);
        System.out.println();
    }


    public static void Smalllestnumber(int matrix[][]) {
        int smallest = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println(" The smallest number in the matrix is :" + smallest);


    }

    public static void printSpiral(int matrix[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {
            // Top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }
            //right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }
            //Bottom
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }
            // Left
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(matrix[i][startcol] + " ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        System.out.println();

    }

    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        // Brute Force O(n^2)
         for (int i = 0; i < matrix.length; i++)  {
        for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                 sum += matrix[i][j];
          } else if (i + j == matrix.length - 1) {
            sum += matrix[i][j];

               }


           }
       }

       /* for(int i =0 ; i< matrix.length;i++) {    // TC = O(n)
            //primary diagonal
            sum += matrix[i][i];
            // secondary diagonal
            if (i != matrix.length - i - 1) {
                sum += matrix[i][matrix.length - i - 1];
            }
        } */

        return sum;

    }

    public static boolean staircaseSearch(int matrix[][],int key) {
        int row = 0 ,col = matrix.length-1 ;
        while(row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("found key at ("+ row +","  + col +")");
                return true ;
            } else if (key < matrix[row][col]) {
             col--;
            }
            else {
                row++;
            }
        }
        System.out.println("key not found !");
        return false;
    }

    // Assignment
    public static void Arraycount(int Array[][]) {
        int countof7 = 0;
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[0].length; j++) {
                if (Array[i][j] == 7) {
                    countof7++;
                }

            }
        }
        System.out.println("count of 7 is " + countof7);
    }

    public static void sumArray(int nums[][]) {
        int sum = 0;
         for (int i =0 ; i< nums.length ; i++) {
             for(int j = 0; j<nums[0].length; j++) {
                 if (i==1) {
                     sum += nums[i][j];
                 }
             }
         }
        System.out.println("sum is : " + sum);
    }

    public static void Transpose(int matrix[][]) {
        int row = matrix.length,column = matrix[0].length ;
        // print orignal matrix
        System.out.println(" The Orignal matrix is :" +
                " ");
        for (int i = 0; i< matrix .length; i++) {
            for(int j =0 ;j< matrix[0].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
     // transpose a matrix

        int transpose [][] = new int[column][row] ;
        for(int i=0;i<matrix.length;i++) {
            for (int j =0;j<matrix[0].length;j++) {
                transpose[j][i] = matrix[i][j] ;
            }
        }
        System.out.println(" Transpose of matrix : ");
        for(int i = 0 ; i< matrix[0].length;i++)
        {
            for (int j =0 ; j<matrix.length ; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();

        }


         }


    public static void main(String[] args) {
        int matrix[][] = new int[4][4] ;
        Scanner sc = new Scanner(System.in) ;
        for (int i =0 ;i< matrix.length ; i++) {
            for(int j =0 ; j<matrix[0].length ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i =0 ;i<matrix.length; i++) {
            for (int j =0 ;j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

       // int key = 5;
       // searchint(matrix,key) ;
       // Largestnumber(matrix);
      //  Smalllestnumber(matrix);

      //  printSpiral(matrix);
       // System.out.println("The diagonal sum is : " + diagonalSum(matrix) );

        int key = 33;
        staircaseSearch(matrix,key) ;


     //  Assignment
         //int Array [][] = {{4,7,8},{6,7,8}} ;
           //     Arraycount(Array);
      //  int nums[][] = {{1,4,9},{11,4,3},{2,2,3}} ;
        //sumArray(nums);
     //   int matrix [][] = {{2,5,7},{9,8,6}} ;
     //  Transpose(matrix);






    }

}



