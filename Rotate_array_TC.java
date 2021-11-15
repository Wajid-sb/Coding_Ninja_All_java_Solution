
public class Solution {  
    public static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void rotate(int[] arr, int d) {
 
        reverse(arr,0,arr.length-1);
        reverse(arr,0,arr.length-d-1);
        reverse(arr,arr.length-d,arr.length-1);
        
        
    }

}

