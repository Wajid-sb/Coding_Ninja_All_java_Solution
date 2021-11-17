public class Solution {

	public static void printIthNode(LinkedListNode<Integer> head, int i){
		//Your code goes here
        LinkedListNode<Integer> temp=head;
         int res=0;
        
         while(temp!=null){
             if(res==i){
                System.out.print(temp.data);
                 break;
             }
             res++;
             temp=temp.next;
         }
        
        
	}
}
