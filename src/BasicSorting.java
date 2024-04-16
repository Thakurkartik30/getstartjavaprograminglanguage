import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicSorting {

    public static void bubblesort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] < arr[j + 1]) {
                    // swaping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static void printArr (Integer arr[]) {


        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }


    public static void SelectionSort (Integer arr[]) {
        for (int i = 0; i< arr.length-1;i++) {
            int minpos = i ;
            for (int j = i+1;j< arr.length; j++) {
                if (arr[minpos] < arr[j]) {
                    minpos = j;
                }
            }
            // swaping
            int temp = arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }

    }

    public static void insertionsort(Integer arr[]) {
        for (int i = 1; i< arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            // finding out the correct pos to insert
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev+1] = arr[prev] ;
                prev--;
            }
            // insertion
            arr[prev + 1] = curr ;
        }

    }

    public static void Countingsort(Integer arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i =0; i< arr.length;i++) {
            largest=Math.max(largest,arr[i]) ;
        }
        int count[] = new int[largest+1] ;
        for (int i =0;i< arr.length;i++) {
            count[arr[i]]++;
        }

        // Sorting

        int j =0;
        for (int i = count.length-1;i>=0;i--) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }


    public static void main(String[] args) {
        Integer arr[] ={1,1,2,3,3,4,4,7,8,9} ;


       // bubblesort(arr);
        //SelectionSort(arr);
      // insertionsort(arr);




       // Arrays.sort(arr,Collections.reverseOrder());

        Countingsort(arr);
        printArr(arr);






    }
}
