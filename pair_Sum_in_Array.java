import java.util.Arrays;
public class Solution {	

	public static int pairSum(int[] arr, int num) {
		//Your code goes here
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int count=0;
        while(j>0){
            for(int k=0;k<j;k++){
                if(arr[k]+arr[j]==num){
                    count++;
                }
            }
            j--;
        }
        return count;
        
	}
}
