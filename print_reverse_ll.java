public class Solution {

	public static void printReverse(LinkedListNode<Integer> root) {
		//Your code goes here
        if(root==null){
            return;
        }
        if(root.next==null){
            System.out.print(root.data+" ");
        }
       
        if(root.next!=null){
            printReverse(root.next);
            System.out.print(root.data+" ");
        }
	}

}
