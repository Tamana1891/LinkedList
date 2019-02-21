void linksort(Node head)
    {
        /*
		//by swaping links of nodes
		if(head == null)
            return ;
            
        Node zeros = new Node(0);
        Node ones = new Node(0);
        Node twos = new Node(0);
        
        Node zero = zeros;
        Node one = ones;
        Node two = twos;
        
        Node curr = head;
        while(curr != null){
            if(curr.value == 0){
                zero.next = curr;
                zero = zero.next;
                curr = curr.next;
            }
            
            else if(curr.value == 1){
                one.next = curr;
                one = one.next;
                curr = curr.next;
            }
            
            else if(curr.value == 2){
                two.next = curr;
                two = two.next;
                curr = curr.next;
            }
        }
  
        zero.next = (ones.next != null)? ones.next : twos.next;
        one.next = twos.next;
        two.next = null;
        head = zeros;*/
		
		
		//by counting number of 0's , 1's , 2's
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        if(head == null)
            return ;
        Node curr =  head;
        while(curr != null){
            if(curr.value == 0)
                c0++;
            else if(curr.value == 1)
                c1++;
            else 
                c2++;
            curr = curr.next;
        }
    curr = head;
    while(c0-- > 0){
        curr.value = 0;
        curr = curr.next;
    }
    while(c1-- > 0){
        curr.value = 1;
        curr = curr.next;
    }
    while(c2-- > 0){
        curr.value = 2;
        curr = curr.next;
    }
    }
}  