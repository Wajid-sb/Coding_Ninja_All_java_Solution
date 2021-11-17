public class Solution {
	public static int findNode(LinkedListNode<Integer> head, int n) {
		// Write your code here.
        LinkedListNode<Integer> temp=head;
        int index=0;
        while(temp!=null){
            if(temp.data==n){
                return index;
            }
            index++;
            temp=temp.next;
        }
        return -1;
        
	}
}
