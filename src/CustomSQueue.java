import java.util.Stack;

/**
 * The following class simulates a queue using two stacks
 * @author Jacob Lurie
 * @version 1.1
 * @since 2021-11-19
 */

public class CustomSQueue {


    private Stack<Integer> s1;
    private Stack<Integer> s2;

    /**
     * Constructor initializes stacks
     */
    public CustomSQueue() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

    /**
     * simulates add function by using stack push
     * @param x integer to be added
     */
    public void add(int x) {

        s1.push(x);

    }

    /**
     * simulates poll function by using stack push and pop
     * @return returns integer that is removed
     */
    public int poll() {

        int num;

        while(!s1.empty()) {
            s2.push(s1.pop());
        }

        num = s2.pop();

        while(!s2.empty()) {
            s1.push(s2.pop());
        }

        return num;

    }

    /**
     * Prints queue to console
     */
    public void printSQueue() {
        System.out.println(s1);
    }


}
