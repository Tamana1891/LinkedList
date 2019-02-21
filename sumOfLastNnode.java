//sum of last n nodes of a linkedlist
class Solution {
    
    public int sum(Node head, int k){
     
      if( k <= 0)
        return 0;
        
    Stack<Integer> s = new Stack<Integer>();
    while(head != null){
        s.push(head.data);
        head = head.next;
    }
    
    int sum = 0;
    while(k > 0){
        sum = sum + s.pop();
        k--;
    }
    return sum ;
    }
}