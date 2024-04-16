import java.util.* ;


public class BitManipulation {
    public static void oddoreven(int n) {
        int bitmask = 1;
        if ((bitmask & n) == 0) {
            //even number
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static int GetIthbit(int n ,int i) {
        int bitmask = 1<<i ;
        if ((n & bitmask) == 0) {
            return 0;
        }else {
            return 1;
        }
    }

    public static int setIthbit(int n,int i) {
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int clearIthbit(int n, int i) {
        int bitmask = ~(1 << i);

        return n & bitmask;

    }

    public static int updateIthbit(int n,int i,int newbit) {

       // if (newbit  == 0) {
         //   return clearIthbit(n,i);
       // }else{
         //   return setIthbit(n,i) ;
       // }
         n = clearIthbit(n,i) ;
         int bitmask = newbit<<i ;
         return n | bitmask ;

    }

    public static int  clearlastbits(int n,int i) {
        int bitmask = (~0)<<i ;
        return n & bitmask ;
    }

    public static int clearrangebit(int n,int i,int j) {
        int a = (~0<<j+1) ;
        int b = 1<<i-1;
        int bitmask = a | b ;
        return n & bitmask ;
    }

    public static boolean ispoweroftwo(int n) {
        return (n&(n-1)) == 0;
    }

    public static  int countsetbits(int n) {
        int count = 0;
        while (n >0) {
            if ((n  & 1) != 0){
                count ++ ;
            }
            n = n>>1 ;
        }
        return  count ;
    }

    public static void main(String[] args) {
        // Binary AND
       // System.out.println(5 & 6);
        // Binary OR
        //System.out.println(5 | 6);
        // Binary XOR
        //System.out.println(5^6);
       // Binary ones complement
        //System.out.println(~5);
        // Binary left shift
        //System.out.println(5<<2);
        // Binary right shift
        //System.out.println(6>>1);
        // check if a no is odd or even
        //oddoreven(3);
       // oddoreven(11);
       // oddoreven(14);

     // get Ith bit
        System.out.println(GetIthbit(15,3));
        // set Ith bit
        System.out.println(setIthbit(10,2));
        // clear ith bit
        System.out.println(clearIthbit(10,1));
        // update ith bit
        System.out.println(updateIthbit(10,2,1));
        // clear last I bits
        System.out.println(clearlastbits(15,2));
        // clear range in bits
        System.out.println(clearrangebit(10,2,4));
        // check if a number is a power of 2 or not
        System.out.println(ispoweroftwo(9));
        // count set bit in number
        System.out.println(countsetbits(12));
        // Fast Exponential

        // Assignment question














    }
}
