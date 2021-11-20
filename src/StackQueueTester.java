import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * The following code serves as a tester for the input possibilities of the CustomQStack, CustomSQueue,
 * and Node classes. The node class is used to simulate the function of a singly linked list. Please run this
 * file to see uses of all classes.
 * @author Jacob Lurie
 * @version 1.2
 * @since 2021-11-19
 */

public class StackQueueTester {

    public static void main(String[] args) {

        System.out.println("First we will test the QStack Class");

        Queue<Integer> q = new LinkedList<Integer>();
        CustomQStack qs = new CustomQStack();

        System.out.println("First we will push three values");
        qs.push(1);
        qs.push(2);
        qs.push(3);
        qs.printQStack();

        System.out.println("Now we will pop one value and print it");
        int x = qs.pop();
        System.out.println("X = " + x);
        qs.printQStack();

        System.out.println("Now we will check if it is empty.");

        if(qs.isEmpty()) {
            System.out.println("The QStack is empty");
        } else {
            System.out.println("The QStack is not empty");
        }

        System.out.println("\nNow we will test the SQueue class.");

        Stack<Integer> s = new Stack<Integer>();
        CustomSQueue sq = new CustomSQueue();

        System.out.println("We will now add three values.");
        sq.add(1);
        sq.add(2);
        sq.add(3);
        sq.printSQueue();

        System.out.println("Now we will poll one number.");
        int y = sq.poll();
        System.out.println("Y = " + y);
        sq.printSQueue();

        System.out.println("Now we add one more number");
        sq.add(5);
        sq.printSQueue();





    }


}
