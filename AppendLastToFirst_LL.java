public class Solution {

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		//Your code goes here
        
        if(n==0){
            return head;
        }
        if(head==null){
            return head;
        }
        int l=0;
        LinkedListNode<Integer> temp=head;
        while(temp.next!=null){
            l++;
            temp=temp.next;
        }
        int res=l-n;
        LinkedListNode<Integer> temp1=head;
        LinkedListNode<Integer> temp3=head;
        temp3=temp3.next;
        while(res!=0){
            
            res--;
            temp1=temp1.next;
            temp3=temp3.next;
        }
        temp.next=head;
        temp1.next=null;
//        
        return temp3;
        
	}

}
