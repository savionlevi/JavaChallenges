package Generics;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by savion.levi on 5/3/2018.
 */
public class GenericsPractice2 <D> {

    LinkedList<D> queue;
    ArrayList<D> myArrayList;

    public GenericsPractice2() {
    queue = new LinkedList<D>();
        myArrayList = new ArrayList<D>();

    }

    public D dequeue(){
        return queue.remove(0);
    }

    public void enqueue(D n){
        queue.addLast(n);
    }

    public static void main(String[] args) {
    GenericsPractice2 myQueue = new GenericsPractice2();
        int i = 10;
        myQueue.queue.add(i);
        System.out.println("Peeking into the queue: "+myQueue.queue.peek());


        myQueue.myArrayList.add(4);
        myQueue.myArrayList.add(2);

        System.out.println("Size of the ArrayList: " + myQueue.myArrayList.size());

        myQueue.enqueue(i);
        System.out.println(myQueue.queue.peek());


    }
}
