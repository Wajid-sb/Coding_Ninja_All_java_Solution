public class Solution {
         input[b]=temp;
        
//     }
    public static int partition(int input[],int i , int j){
        int pivot=input[i];
        int count=0;
        for(int m=i+1;m<=j;m++){
            if(input[m]<pivot){
                count++;
            }
        }
        int temp=input[i+count];
        input[i+count]=pivot;
        input[i]=temp;
        // swap(input,pivot,input[count]);
        // int i=0;
        // int j=input.length-1;
        int ii=i;
        int jj=j;
        while(ii<jj){
           if(input[ii]<pivot){
               // swap(input,input[i],pivot);
               ii++;
               // jj--;
           } else if(input[jj]>=pivot){
                jj--;
            } else{
                int temp1=input[ii];
                input[ii]=input[jj];
                input[jj]=temp1;
                jj--;
                ii++;
            }
        }
        return i+count;
    }
  
    public static void quickSort1(int input[],int i,int j){
        if(i>=j){
            return;
        }
        int pivotIndex=partition(input,i,j);
        quickSort1(input,i,pivotIndex-1);
        quickSort1(input,pivotIndex+1,j);
    }
	
	public static void quickSort(int[] input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		int start=0;
        int end=input.length-1;
        quickSort1(input,start,end);
	}
	
}
