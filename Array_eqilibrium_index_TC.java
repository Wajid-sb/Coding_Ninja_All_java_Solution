public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
        int sum=0;
        
//         first do the sum of all element
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int i=0;
        int j=arr.length-1;
        int sum1=0;
        while(i<j){
            sum1+=arr[i];
            // sum-=arr[i];
            if(sum == sum1){
                return i;
            }
            sum-=arr[i];
            i++;
            
        }
        return -1;
	}
}
