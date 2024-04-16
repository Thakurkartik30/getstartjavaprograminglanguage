import javax.imageio.stream.ImageInputStream;



public class DivideConquer {


    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergesort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergesort(arr, si, mid);
        mergesort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;  // iterator for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                k++;
                i++;
            } else {
                temp[k] = arr[j];
                k++;
                j++;
            }

            while (i <= mid) {
                temp[k++] = arr[i++];
            }

            while (j < ei) {
                temp[k++] = arr[j++];
            }
            for (k = 0, i = si; k < temp.length - 1; k++, i++) {
                arr[i] = temp[k];
            }
        }
    }

    public static void quicksort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // last element
        int pidx = partition(arr, si, ei);
        quicksort(arr, si, pidx - 1);
        quicksort(arr, pidx + 1, ei);

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    //   Search in rotated sorted array
    public static int Searcharray(int arr[], int tar, int si, int ei) {
        // base case
        if (si>ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar) {
            return mid;
        }
        // case 1 mid on L1
        if (arr[si] <= arr[mid]) {
            // case a : left
            if (arr[si] <= tar && tar<= arr[mid]) {


               return Searcharray(arr,tar,si,mid);
            }

            // case b : right
            else {
                return Searcharray(arr,tar,mid+1,ei);
            }
        }
        // case 2 mid on L2
        else    {
            // case c : right
            if (arr[mid]<=tar && tar<=arr[ei]) {
                return Searcharray(arr,tar,mid+1,ei) ;
            }
            // case d : left
            else {
                return Searcharray(arr,tar,si,mid-1);
            }

        }
    }




    public static void main(String[] args) {
        int arr[] ={4,5,6,7,0,1,2,3} ;
        int target = 6;
        int taridx = Searcharray(arr,target,0,arr.length-1);
        System.out.println(taridx);













    }

}
