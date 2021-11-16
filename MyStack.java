import java.util.Stack;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// import java.util.stream;

public class MyStack {
    public static void main(String args[]) {

        try {
            File data_file = new File("data.txt");
            Scanner data_content = new Scanner(data_file);
            while (data_content.hasNextLine()) {

                Stack<Integer> stk = new Stack<Integer>();

                stk.push(data_content.nextInt());

                int size = stk.size();
                for (int i = 0; i < size; i++ ) {
                    System.out.println(stk.pop());
                }
            }
            data_content.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured while reading the file.");
            e.printStackTrace();
        }

        // Stream stream = stk.stream();

        // stream.forEach((element) -> {
        //     System.out.println(element);
        // });

        // Iterator iterator = stk.iterator();
        // while(iterator.hasNext()) {
        //     System.out.println(stk.search(iterator));
        // }
        // System.out.println(stk.peek());
    }
}