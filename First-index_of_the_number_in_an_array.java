
public class Solution {
    public static int HelperFunction(int input[],int x,int si){
        if(input[si]==x){
            return si;
        }
        if(si==input.length-1 && input[si]!=x){
            return -1;
        }
        return HelperFunction(input,x,si+1);
        
    }

	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
       
       return HelperFunction(input,x,0);
        
	}
	
}
