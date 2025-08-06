public class ArraySortedOrNot {

    public static String isSorted(int[] arr) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1])
                descending = false;
            else if (arr[i] > arr[i + 1])
                ascending = false;
        }

        if (ascending)//ascending==true
            return "Array is sorted in ascending order.";
        else if (descending)
            return "Array is sorted in descending order.";
        else
            return "Array is not sorted.";
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println(isSorted(arr));
    }
}
