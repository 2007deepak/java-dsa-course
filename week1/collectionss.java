
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
   

   //sets in collections
         
        Set<Integer> dp =  new HashSet<>();

        // set me kya hota hai element unique hota hai 
        // lekin jab Hashset banate hai to element kisi bhi order me 
        // print ho skte hai
        dp.add(10);
        dp.add(20);
        dp.add(30);
        dp.add(10);
        dp.add(10);
        dp.add(5);
        dp.add(5);
        System.out.println(dp);

            
        Set<Integer> ap =  new LinkedHashSet<>();

        // Lekin jab ham LinkedhashSet banate hai tho ham jis order me 
        // element preserve karate hai  usi order me print  hota hai hai
            ap.add(10);
            ap.add(20);
            ap.add(30);
           // ap.add(10);
            //ap.add(10);
           // ap.add(5);
            ap.add(5);
        System.out.println(ap);


         Set<Integer> dk =  new TreeSet<>();
        
         // Aur TreeSet me order sorted ho jate hai
            dk.add(10);
            dk.add(20);
            dk.add(30);
           // dk.add(10);
            //dk.add(10);
           // dk.add(5);
            dk.add(5);
        System.out.println(dk);
        */

        //+++++++++++++++++ Map ++++++++++++++++++++++++++

        Map<Integer , String > student = new HashMap<>();

        student.put(1, "Deepak Kumar");
        student.put(2, "Snatosh Orone");
        student.put(3, "Alok Maurya");
        student.put(3, "Abhay Kumar");
        student.put(4, "Rahul patel");
        student.put(4, "Ajay Maurya");
        

         // if(!student.containsKey. )
        System.out.println(student);

        //  aur yadi hame Name print karana hai to integer ki jagah par String lena padega
        // keyset ki jagh par values lena pdega
        for(Integer rollNumner : student.keySet())
        {
            System.out.println(rollNumner);
        }

        // yadi hame dono print krana hai tab ke liye
        
        for(Map.Entry<Integer, String> me : student.entrySet())
        {
            System.out.println(me.getKey());
            System.out.println(me.getValue());
        }

    }
    
}