package codewithmosh.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
        public static void showQueue(){
            Queue<String> queue = new ArrayDeque<>(); // java compiler can figure out which generic based on the info on the left
            queue.add("c");
            queue.add("a");
            queue.add("b");
            // the cue order: b -> a -> c
            // c is at the front of the queue
                    // === side note below not used in current example ===
                        // offer(); and add();  add another item to the end of the queue.
                            // the cue order if new item adding: d -> b -> a -> c
                            // offer(); returns false if empty
                            // add();   will throw an IllegalStateException and terminate the program
                            // so offer inserts an element if possible otherwise returns false

            var front = queue.peek();
            System.out.println(front);
                 // === method side notes ===
                        // peek(); and element(); to get item in front of the queue.
                            // element(); returns an exception when empty
                            // peek(); returns null if empty
                        // remove(); and poll(); removes the element in the front of the cue
                            // remove(); throws an exception
                            // poll(); returns null


        }

}
