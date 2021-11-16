// package collectionsexample;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class CollectionsExample {
    public static void main(String[] args) {
        List<Integer> my_list = Arrays.asList(1,1,2,3,5,8,13,21,34,55);
        System.out.println("position of 21: " + Collections.binarySearch(my_list, 21));
    }
}