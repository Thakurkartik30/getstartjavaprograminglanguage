import java.util.Scanner;

public class ArraysCC {

    public static void update(int marks[], int nonChangable) {
        nonChangable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static int linearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int getlargest(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("smallest value is : " + smallest);
        return largest;
    }


    public static int binarysearch (int number[],int key) {
        int start = 0;
        int end = number.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key)  {
                start = mid + 1;
        } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverse(int number[]) {
        int first = 0;
        int last = number.length - 1;
        while(first < last) {
            // swap
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;
            last--;
        }
    }

    public static void printpairs(int number[]) {
        int Tp = 0;
        for (int i = 0; i<number.length ;i++) {
            int curr = number[i] ;
            for (int j=i+1;j<number.length;j++) {
                System.out.print(" ("+curr+","+number[j]+") ");
                Tp++;
            }
            System.out.println();
        }
        System.out.println("total pair = " + Tp);
    }

    public static void printSubarrays (int number[]) {
        int ts =0;
        for (int i =0;i<number.length;i++){
            int start = i;
            for (int j = i;j<number.length;j++) {
                int end = j;
                for (int k =start;k<= end;k++) {
                    System.out.print(number[k] +" ");
                }
                ts ++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArrays : " + ts);
    }

    // Brute Force
    public static void MAXSubarraysum (int number[] ) {
        int currsum = 0;
        int maxsum = Integer .MIN_VALUE;

        for (int i = 0;i<number.length;i++) {
            int start =i;
            for (int j = i;j<number.length;j++) {
                int end = j;
                 currsum =0;
                for (int k = start;k<=end;k++) {
                    //subarrays sum
                    currsum += number[k] ;
                }
                System.out.println(currsum);
                if (maxsum<currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("MAX Sum = " + maxsum);
    }

    // Prefix Sum
    public static void maxsubarraysum(int number[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE ;
        int prefix[] = new int[number.length] ;

        prefix[0] = number[0] ;
        // calculate prefix array
        for (int i = 1;i< prefix.length;i++) {
            prefix[i] =  prefix[i-1] + number[i] ;
        }

        for (int i=1;i<number.length;i++) {
            int start = i;
            for (int j=i; j< number.length;j++) {
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];

                if (maxsum <currsum) {
                    maxsum = currsum ;

                }
            }
        }
        System.out.println("Max Sum = " + maxsum);

    }

    // kadane's algorithm
    public static void kadanes (int number[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        for (int i =0; i< number.length;i++) {
            currsum = currsum + number[i] ;
            if (currsum < 0) {
                currsum = 0;
            }
            maxsum = Math.max(currsum,maxsum) ;

        }
        System.out.println("our max subarray sum is : " + maxsum);
    }

    // Trapped rain water

    public static int Trappedrainwater(int height[]) {
        int n = height.length;
        // leftmax boundary - array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        // rightmax boundary - array
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        int trappedwater = 0;
        // loop
        for (int i = 0;i<n;i++) {
            // waterlevel = min(leftmax bound,rightmax bound)
            int waterlevel = Math.min(leftmax[i],rightmax[i] ) ;

            //  trappedwater = waterlevel - height[i]

            trappedwater += waterlevel - height[i] ;
            }
            return trappedwater ;

    }

    // Buying and sell stocks
    public static int BuyingAndSellStocks(int price[])
    {
        int maxprofit = 0;
        int buyprice = Integer.MAX_VALUE;

        for (int i = 0; i<price.length ; i++) {
            if (buyprice < price[i]) {
                int profit = price[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = price[i];
            }
        }
        return maxprofit;
    }

    // ASSIGNMENT PROBLEM
    // QUESTION - 1
    public static boolean containduplicate (int nums []) {
        for(int i = 0; i< nums.length ; i++ ) {
            for( int j = i+1; j<nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true ;
                }
            }
        }
        return false ;
    }
    public static void main(String[] args) {
        // Creating an array
        //int marks[]=new int[100];

       // int number[] ={1,2,3};
        //int moreNumber[]= {4,5,6} ;
       // String fruits[] ={"apple","mango","guava"} ;

        // input/ output/update
        Scanner sc = new Scanner (System.in);

        //System.out.println("length of array = "+ marks.length);

     /*   marks[0] = sc.nextInt();  //phy
        marks[1] = sc.nextInt();  //chem
        marks[2] = sc.nextInt();//math

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("math : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage = " + percentage + "%" );  */

        // passing arrays as argument
       /* int marks[] ={97,94,95} ;
        int nonChangable = 5;
        update(marks,nonChangable);
        System.out.println(nonChangable);
        // print our marks
        for (int i = 0;i<marks.length;i++) {
            System.out.print(marks[i]+" ");`

        \}
        System.out.println();   */

        // Linear search
       /* int number[] = {2,4,6,8,10,12,14,16} ;
        int key = 10;

        int index = linearSearch(number,key) ;
        if(index == -1) {
            System.out.println("NOT found ");
        } else {
            System.out.println(" key is at index :  " + index);
        }  */

        // Find Largest number
        // int number[] = {1,2,6,3,5};
        // System.out.println("Largest number is : " + getlargest(number));

        // BINARY SEARCH
       // int number[] = {2,4,6,8,10,12,14} ;
        //int key = 12;

     // System.out.println("Index no of key : " + binarysearch(number,key) );

      // REVERSE OF ARRAY
      // int number[] = {2,4,6,8,10} ;

      //  reverse(number);
      //  for (int i = 0;i< number.length;i++) {
      //      System.out.print(number[i] + " ");
      //  }
      //  System.out.println();    /*


        // PAIRS IN AN ARRAY
        //int number[] = {2,4,6,8,10} ;
        //printpairs(number);

        // PRINT SUBARRAYS
     //   int number[] = {2,4,6,8,10} ;
     //   printSubarrays(number);

        // maxsubarray sum  (Brute force)PL;
   //  int number[] ={2,4,6,8,10};
     //  MAXSubarraysum(number);


        // PREFIX SUM
    //  int number [] = {1,-2,6,-1,3};
      //  maxsubarraysum(number);

        // KADANE'S ALGORITHM
    //    int number[] = {-1,-2,-3,-4} ;
      //   kadanes(number);

        // Trapped rain water
        //int height[] = {4,2,0,6,3,2,5} ;
        //System.out.println(Trappedrainwater(height));


        // buying and sell stocks
      //  int price[] = {7,1,5,3,6,4} ;
       // System.out.println(BuyingAndSellStocks(price));

        // ASSIGNMENT
        int nums[] = {1,2,3,1} ;
        System.out.println(containduplicate(nums));





    }

}