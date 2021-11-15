public class Solution {

	public static int length(LinkedListNode<Integer> head){
		//Your code goes here
        int l=0;
        LinkedListNode<Integer> temp=head;
        while(temp!=null){
            if(temp.data>=0){
                l++;
                temp=temp.next;
            }
        }return l;
        
	}
}
