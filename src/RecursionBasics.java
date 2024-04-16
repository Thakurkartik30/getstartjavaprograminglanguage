public class RecursionBasics {

    // print number in decreasing order
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    // print number in increasing order
    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    //print factorial of a number
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    public static int calcsum(int n) {
        if (n == 1) {

            return 1;
        }

        int Snm1 = calcsum(n - 1);
        int Sn = n + calcsum(n - 1);
        return Sn;
    }

    // print N^th fibbonacci number
    public static int fibb(int n) {

        if (n == 0 || n == 1) {
            return n;
        }


        int fibnm1 = fibb(n - 1);
        int fibnm2 = fibb(n - 2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }

    // check if a given array is sorted or not
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;

        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // WAF to find the first occurence of an element in an array
    public static int firstoccur(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstoccur(arr, key, i + 1);
    }

    public static int lastoccur(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }

        int isfound = lastoccur(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;
    }
    //print X to the power n

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        //  int xnm1 = power(x , n-1) ;
        //   int xn = x * xnm1 ;
        //  return xn ;

        return x * power(x, n - 1);
    }

    // optimise method to calculate X to the power n

    public static int optimisepower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = optimisepower(a, n / 2);
        int halfpowerSq = halfpower * halfpower;
        // int halfpowerSq = optimisepower(a,n/2) * optimisepower(a,n/2);
        // in case of odd
        if (n % 2 != 0) {
            halfpowerSq = a * halfpowerSq;

        }
        return halfpowerSq;
    }

    // Tiling problem
    public static int Tilingproblem(int n) { // 2* n
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical choice
        //  int fnm1 = Tilingproblem(n-1) ;
        // Horiontal choice
        //  int fnm2 = Tilingproblem(n-2) ;

        //  int Totways = fnm1 +fnm2 ;
        //  return Totways ;

        return Tilingproblem(n - 1) + Tilingproblem(n - 2);
    }

    // Remove duplicate  in a String

    public static void removeduplicaters(String str, int idx, StringBuilder newstr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }

        char currchar = str.charAt(idx);
        if (map[currchar - 'a'] == true) {
            // duplicate
            removeduplicaters(str, idx + 1, newstr, map);
        } else {
            map[currchar - 'a'] = true;
            removeduplicaters(str, idx + 1, newstr.append(currchar), map);
        }
    }

    // Friends pairing problem

    public static int friendspairing(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        // choice
        // single
        int fnm1 = friendspairing(n - 1);
        // pair
        int fnm2 = friendspairing(n - 2);
        int pairways = (n - 1) * fnm2;

        // total ways
        int totways = (n - 1) + pairways;

        return totways;

        // return friendspairing(n-1) + (n-1) * friendspairing(n-2) ;
    }

    // Binary String problem code
    public static void printBinString(int n, int lastplace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kaam

        if (lastplace == 0) {
            printBinString(n - 1, 0, str + "0");
            printBinString(n - 1, 1, str + "1");
        } else {
            printBinString(n - 1, 0, str + "0");

        }

    }

    // practice question
    public static void Alloccurrence(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");

        }
        Alloccurrence(arr, key, i + 1);
        
        System.out.println(" ");

    }

    // practice question 3




    public static int Length(String str) {
        if (str.length() == 0) {
            return 0;
        }

        return Length(str .substring(1)) + 1 ;
    }

    // practice question 2








    public static void main(String[] args) {
        int a= 2;
        int n = 10  ;
       // printDec(10);
       // printInc(10);
       // System.out.println( fact(5 ) + " ");


       // System.out.println(calcsum(5));
       // System.out.println(fibb(22));

        int arr[] = {8,3,2,6,2,9,5,10,2,5,3};
        System.out.println(isSorted(arr,0));
        System.out.println(firstoccur(arr , 5 , 0));
        System.out.println(lastoccur(arr , 5 ,0));
        System.out.println(power(2,10));
        System.out.println(optimisepower( a , n));
        System.out.println(Tilingproblem(4));

        String str = "appnnacollege" ;
        removeduplicaters(str,0,new StringBuilder(""),new boolean[26]);

        System.out.println(friendspairing(3));
        printBinString(3,1,"") ;

        // practice question
        int key = 2;
        Alloccurrence(arr,key,0) ;
        System.out.println(Length(str));






    }
}
