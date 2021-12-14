package clases_tr;

import java.util.Comparator;
import java.util.PriorityQueue;
    /*SALIDA:
        added to queue   : 42 
        elements in queue: 42 

        added to queue   : 42 69 
        elements in queue: 69 42 

        added to queue   : 42 69 32 
        elements in queue: 69 42 32 

        added to queue   : 42 69 32 5 
        elements in queue: 69 42 32 

        added to queue   : 42 69 32 5 104 
        elements in queue: 104 69 42 

        added to queue   : 42 69 32 5 104 93 
        elements in queue: 104 93 69 
    */
public class FixedCapacityPriorityQueue {

    static class MyPriorityQueue extends PriorityQueue<Integer> {

        private final int capacity;

        public MyPriorityQueue(int capacity) {
            super(capacity, Comparator.reverseOrder());
            this.capacity = capacity;
        }

        @Override
        public boolean add(Integer i) {
            super.add(i);
            if (size() > capacity) {
                Integer lowest = Integer.MAX_VALUE;
                for (Integer next : this) {
                    if (lowest.compareTo(next) > 0) {
                        lowest = next;
                    }
                }
                this.remove(lowest);
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Integer[] stream = {42, 69, 32, 5, 104, 93};

        for (int i = 0; i < stream.length; i++) {
            PriorityQueue queue = new MyPriorityQueue(3);
            System.out.print("added to queue   : ");
            for (int e = 0; e <= i; e++) {
                 System.out.printf("%d ", stream[e]);
                queue.add(stream[e]);
            }
             System.out.println();
            System.out.print("elements in queue: ");
            while (queue.size() > 0) {
                System.out.printf("%d ", queue.poll());
            }
            System.out.printf("%n%n");
        }
    }
}