import java.util.Arrays;

public class Solution {

	public static int findUnique(int[] arr) {
		//Your code goes here4
        Arrays.sort(arr);
        if(arr.length==1){
            return arr[0];
        }
        int i=1;
        while(i<arr.length-1){
            
            if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1]){
                return arr[i];
            }
            i++;
        }
        return arr[i];
	}
}
