import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> my_family = new ArrayList<>();
        my_family.add("Jamie");
        my_family.add("Stefi");
        my_family.add("Sarah");
        my_family.add("Jaclynn");
        my_family.add("JT");

        System.out.println("Is Sarah part of the family? ");
        if ( my_family.contains("Sarah")) {
            System.out.println("Sarah is in the family");
        } else {
            System.out.println("Sarah is not in the family");
        }
    }
}

