public class Solution {
    
    public static LinkedListNode<Integer> ReverseLL(LinkedListNode<Integer> root){
        LinkedListNode<Integer> prev=null;
		
		while(root!=null) {
			LinkedListNode<Integer> next=root.next;
//			next=root.next;
			root.next=prev;
			prev=root;
			root=next;
		}
		return prev;
        
    }

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head==null || head.next==null){
            return true;
        }
        LinkedListNode<Integer> slow=head;
        LinkedListNode<Integer> fast=head;
       
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
          
        }
        slow.next=ReverseLL(slow.next);
        slow=slow.next;
        while(slow!=null){
            if(head.data!=slow.data){
                return false;
            }
            slow=slow.next;
            head=head.next;
        }
        return true;
        
	}

}
