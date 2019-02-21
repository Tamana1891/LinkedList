import java.util.*;
import java.lang.*;
import java.io.*;
public class Main{
    
    public static void  getUnion(LinkedList<Integer> list1 , LinkedList<Integer> list2){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        LinkedList<Integer> curr1 = list1;
        while(curr1.size() > 0){
            set.add(curr1.pollFirst());
        }
        
        LinkedList<Integer> curr2 = list2;
        while(curr2.size() > 0){
            set.add(curr2.pollFirst());
        }
        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    public static void main(String[] args){
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        int size1 = s.nextInt();
        for(int i=0 ;i<size1 ; i++)
            list1.add(s.nextInt());
            
        int size2 = s.nextInt();
        for(int i=0;i<size2;i++)
            list2.add(s.nextInt());
          
        getUnion(list1 , list2);
    }
}