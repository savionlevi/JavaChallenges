import java.util.LinkedList;

/**
 * Created by savion.levi on 4/9/2018.
 */
public class Queuey {

    LinkedList queue;

    // Making a queue instance
    public Queuey() {
        queue = new LinkedList();
    }


    //checking if the queue empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }


    // What is the size of our queue
    public int size(){
        return queue.size();
    }


    //Enqueuing an item
    public void enqueue(int n){
       queue.addLast(n);
    }


    // Dequeuing an item
   public int dequeue(){
       return (Integer) queue.remove(0);
   }

    // peek at first item
    public int peek() {
        return (Integer) queue.get(0);
    }


    public static void main(String[] args) {
        Queuey myQueue = new Queuey();
        myQueue.enqueue(5);
        myQueue.enqueue(7);
        myQueue.enqueue(6);
        System.out.println("First out: "+ myQueue.dequeue());
        System.out.println("Peek at second itme: "+ myQueue.peekr());
        System.out.println("Second out: "+ myQueue.dequeue());
        System.out.println("Third out: "+ myQueue.dequeue());


    }
}
