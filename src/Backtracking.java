public class Backtracking {
    
    public static void changeArr(int arr[],int i ,int val) {
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }

        // recursion (Base)
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }

    public static void findSubset(String str, String ans , int i) {
        // base case
        if (i == str.length()){
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // recursion
        //yes choice
        findSubset(str,ans +str.charAt(i) ,i+1 );
        findSubset(str,ans,i+1);
    }

    public static void printpermutation(String str ,String perm , int idx ) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for(int i=0; i<str.length(); i++) {
            char currchar = str.charAt(i) ;
            String newstr = str.substring(0,i) + str.substring(i+1) ;
            printpermutation(newstr , perm + currchar , idx +1);
        }
    }



    public static void printArr(int arr[]) {
        for (int i =0; i<arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
     //   changeArr(arr,0,1);
      //  printArr(arr);
        String str = "ABC";
        findSubset(str,"",0);
        printpermutation(str,"",0);


    }
}
