import java.util.LinkedList;
import java.util.Queue;

/**
 * The following class simulates a stack using a queue
 *
 * @author Jacob Lurie
 * @version 1.2
 * @since 2021-11-19
 */

public class CustomQStack {


    private Queue<Integer> customQ;

    /**
     * constructor initializes the queue to be used as a "stack"
     */
    public CustomQStack() {

        customQ = new LinkedList<Integer>();

    }

    /**
     * simulates the pop function using a loop and the add and poll function from queue
     * @return integer of value being popped
     */
    public int pop() {
        if(customQ.isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Queue is empty!");
        }

        for (int i=0; i<customQ.size() -1; i++) {
            int num = customQ.poll();
            customQ.add(num);
        }

        return customQ.poll();
    }

    /**
     * simulates the push function using the add function from queue
     * @param num number being pushed into stack
     */
    public void push(int num) {

        customQ.add(num);

    }

    /**
     * returns true if the "stack" contains no values
     * @return boolean if the queue contains no values
     */
    public boolean isEmpty() {
        if(customQ.size() == 0) {
            return true;
        }

        return false;
    }

    /**
     * prints entire "stack"
     */
    public void printQStack() {

        System.out.println(customQ);
    }


}
