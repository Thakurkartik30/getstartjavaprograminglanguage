import java.util.ArrayList ;
import java.util.Collections ;

public class ArrayLists {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Float> list2 = new ArrayList<Float>();
        ArrayList<Double> list3 = new ArrayList<Double>();

        // Add element
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // get element
        int element = list.get(0);
        System.out.println(element);

        // add el in between
        list.add(1,4) ;
        System.out.println(list);

        // set element
        list.set(2,6);
        System.out.println(list);

        // delete element
        list.remove(3);
        System.out.println(list);

        // sige list

       int size = list.size();
        System.out.println(size);

        // loop
        for (int i =0 ; i< list.size();i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        // sorting
      Collections.sort(list);
        System.out.println(list) ;












    }

































































































































































    }





















































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































