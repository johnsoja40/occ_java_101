import java.util.Collection;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        Collection family_collection = Arrays.asList("Jamie", "Stefi", "Sarah", "Jaclynn", "JT");
        Iterator family_itr = family_collection.iterator();
        while(family_itr.hasNext())
        {
            System.out.println(family_itr.next());
        }

    }
}