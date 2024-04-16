import java.util.Scanner;
import java.util.Arrays ;

public class Strings {

    public static void printletters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean ispalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static float getshortestpath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // south
            if (dir == 's') {
                y--;
            }
            // North
            else if (dir == 'N') {
                y++;
            }
            // east
            else if (dir == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("") ;
         char ch = Character.toUpperCase(str.charAt(0)) ;
         sb.append(ch) ;

         for(int i =1 ; i< str .length() ; i++) {
             if (str.charAt(i) == ' ' && i<str.length()-1) {
                 sb.append(str.charAt(i)) ;
                 i++ ;
                 sb.append(Character.toUpperCase(str.charAt(i))) ;
             } else {
                 sb . append(str.charAt(i)) ;
             }

         }
         return sb . toString() ;

    }

    public static String compression(String str) {
      StringBuilder sb = new StringBuilder(" ") ;

      for (int i =0 ; i< str.length() ; i++) {
          Integer count =1;
          while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
              count++ ;
              i++;
          }
          sb.append(str.charAt(i) );
          if(count>1) {
              sb.append(count.toString()) ;
          }
      }
      return sb.toString();
    }

    public static void lowercasevowel(String str) {
        int count = 0;


        for (int i =0;i< str.length() ; i++) {
            if (str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count ++ ;
            }
        }
        System.out.println("count of vowels is " + count);

    }




    public static void main(String[] args) {
       /* char arr[] = {'a','b','c','d'};

        String str = "abcd" ;
        String str2 = new String("xyv");

        // String are immmutable
        Scanner sc = new Scanner(System.in) ;
        String name;
        name = sc.nextLine();
        System.out.println(name);  */

        //  String fullname = "kartik jadon";
        //  System.out.println(fullname.length());

        // Concatenation
        String firstname = "kartik";
        String lastname = "jadon";
        String fullname = firstname + " " + lastname;
        //   System.out.println(fullname.charAt(1));

        //   printletters(fullname);

        // Question 1 (check the string is palindrome or not )
        //  String str = "racecar" ;
        //      System.out.println(ispalindrome(str));

        // Question 2
        //  String path = "WNEENESENNN " ;
        //   System.out.prntln(getshortestpath(path));

        // Compare of Strings
        //  String s1 = "Tony" ;
        //  String s2 = "Tony" ;
        //  String s3 = new String("Tony") ;
        //   if (s1 == s2) {
        //       System.out.println("Strings are equal");
        //   } else{
        //      System.out.println("Strings are not equal");
        // }

        // if (s1 == s3) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        //  }


        //   if (s1.equals(s3)) {
        //     System.out.println("Strings are equal");
        //   } else {
        //      System.out.println("Strings are not equals");
        //  }

        //  String str = "HelloWorld" ;
        //   System.out.println(str .substring(0,5));
        //  System.out.println(substring(str,0,5));

        // Question 3
    /*    String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);   */

        // StringBuilder new data type


      /*  StringBuilder sb = new StringBuilder("") ;
        for (char ch = 'a' ;ch<='y' ; ch++) {   //TC = O (25)
            sb.append(ch) ;
        }
        System.out.println(sb);
        System.out.println(sb.length());   */


        // convert letter to uppercase

         ///String str = "hi, i am kartik" ;
       // System.out.println(toUpperCase(str));

        // String Compression
    //    String str  = "aaaabbcccdd" ;
      //  System.out.println(compression(str));

        // Assignment Question

        // to print lowercase vowel of a string
       // String str = "we are one" ;
      //   lowercasevowel(str) ;


        // Determine two Srings are Anagrams or not

        String str1 = "Earth";
        String str2 = "Heart" ;

        // convert string to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // first check if the length are same
        if (str1.length() == str2.length()) {

            // convert string into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charAray = str2.toCharArray();

            // sort the array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charAray);

            // if the sorted array is identical then the strings are anagrams

            boolean result = Arrays.equals(str1charArray,str2charAray) ;
            if (result) {
                System.out.println(str1 + " and " +
                        "" + str2 + " are Anagram of each other");
            } else {
                System.out.println(str1 + " and " + str2 + "are not Anagram of each other");
            }
            


        } else{  // case when length are not equal
            System.out.println(str1 + " and " + str2 + "are not Anagrams of each other");
        }





    }


}