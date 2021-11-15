
public class solution {
    static boolean helper(int arr[], int n,int start, int lsum, int rsum)
    {
        if (start == n)
            return lsum == rsum;

        if (arr[start] % 5 == 0)
            lsum += arr[start];


        else if (arr[start] % 3 == 0)
            rsum += arr[start];

        else

            return helper(arr, n, start + 1, lsum + arr[start], rsum) || helper(arr, n, start + 1, lsum, rsum + arr[start]);

        return helper(arr, n, start + 1, lsum, rsum);
    }
   
    
    static boolean splitArray1(int arr[], int n)
    {

        return helper(arr, n, 0, 0, 0);
    }

	public static boolean splitArray(int input[]) {
		
		*/
        int n=input.length;
        // splitArray1(input,n,0,0,0);
        if (splitArray1(input, n))
            return true;
        else
            return false;
        
        
	}
	

}
