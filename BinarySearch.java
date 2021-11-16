import java.util.ArrayList;

public class BinarySearch {

    int binarySearch(ArrayList<Integer> arr, int x) {

        int left = 0;
        int right = arr.size() -1;

        while ( left <= right ) {
            int mid = left + (right - left) / 2;

            if (arr.get(mid) == x)
                return mid;

            if (arr.get(mid) < x)
                left = mid + 1;
            else
                right = mid -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();

        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(5);
        arr.add(10);
        arr.add(15);
        arr.add(20);
        arr.add(25);
        arr.add(30);
        arr.add(35);
        arr.add(40);
        arr.add(45);
        arr.add(50);

        int x = 60;

        System.out.println("The elements of the arrayList are: " +arr);

        int result = ob.binarySearch(arr, x);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("The element " + x + " is found at index " + result);
    }
}
