
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
    */   
      
    Stack<Integer> S = new Stack<>();

    S.push(1);
    S.push(20);
    S.push(30);

    System.out.println(S);
    
    System.out.println("peek = " +S.peek());

    S.pop();

    System.out.println(S);


    }
}