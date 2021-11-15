import java.util.Arrays;

public class Solution {

	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
        Arrays.sort(arr1);   
        Arrays.sort(arr2);
        int a1=0;
        int a2=0;
        while(a1!=arr1.length && a2!=arr2.length){
            if(arr1[a1]==arr2[a2]){
                System.out.print(arr1[a1]+" ");
                a1+=1;
                a2+=1;
            }
            else if(arr2[a2]>arr1[a1]){
                a1+=1;
            }else{
                a2+=1;
            }
        }
	}

}
