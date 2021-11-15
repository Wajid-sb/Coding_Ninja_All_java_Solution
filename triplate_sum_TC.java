import java.util.Arrays;
public class Solution {	

	public static int tripletSum(int[] arr, int num) {
        int count=0;
		int n=arr.length;
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			for(int j=i+1,k=n-1;j<k;) {
				int curr = arr[i]+arr[j]+arr[k];
				if(curr<num) {
					j++;
				}else if(curr>num) {
					k--;
				}else {
					if(arr[j] == arr[k]) {
						count+=((k-j)*(k-j+1))/2;
						break;
					}
					int p=j+1,q=k-1;
					while(arr[p] == arr[j]) {
						p++;
					}
					while(arr[q] == arr[k]) {
						q--;
					}
					count+=(p-j)*(k-q);
					j=p;k=q;
				}
			}
		}
		return count;
		
        
	}
}

 
