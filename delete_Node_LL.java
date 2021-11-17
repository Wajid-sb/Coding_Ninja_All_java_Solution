public class Solution {
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		// Write your code here.
        LinkedListNode<Integer> temp=head;
        int index=0;
        if(head == null){
            return head;
        }
        if(pos<0){
            temp.next=temp.next.next;
            return head;
        }
        
        if(pos==0){
           
            return temp.next;
        }
        while(temp!=null && pos>0){
           if(temp.next==null){
               return head;
           } 
            if(index==pos-1){
               temp.next=temp.next.next;
               break;
           }
            index+=1;
            temp=temp.next;
            
        }

        return head;
  
    }
}
