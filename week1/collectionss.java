
import java.util.*;

public class collectionss {


    public static void main (String args[]){
    
    /*  List<Integer> a = new  LinkedList<>();

        a.add(1);
        a.add(5);
        a.add(10);

        System.out.println(a);

       // inhence for loop
        for(Integer x : a)
        {
            System.out.println(x);
        }
       
      
        Stack<Integer> S = new Stack<>();

        S.push(1);
        S.push(20);
        S.push(30);

        System.out.println(S);
        
        System.out.println("peek = " +S.peek());

        S.pop();

        System.out.println(S);

     
       // < ye yah bata raha hai ki hamne is Queue me integere type ka value addn kar rahe hai >
        
        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        // ye toString ki help se print kar raha hai head to rear like array whitout loop
        System.out.println(q);
        System.out.println("peek is :"+ q.peek());

        q.poll();
        System.out.println(q);

        
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(5);
        pq.offer(60);
        pq.offer(70);
        pq.offer(40);
        pq.offer(50);
        System.out.println(pq);

        pq.poll();

        System.out.println(pq);

        */

        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(10);
        ad.offerFirst(20);
        ad.offerLast(30);
        ad.offer(40);
        ad.offer(50);
        ad.offerLast(60);

        System.out.println(ad);
        System.out.println(ad.peek());
        System.out.println(ad.poll());
        System.out.println(ad.pollFirst());
        System.out.println(ad.pollFirst());
        System.out.println(ad.peekLast());
        System.out.println(ad);

    }
}