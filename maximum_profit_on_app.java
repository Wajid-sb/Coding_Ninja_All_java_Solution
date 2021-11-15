import java.util.Arrays;
public class solution {
//     

	public static int maximumProfit(int budget[]) {
		// Write your code here
        Arrays.sort(budget);
        int max1=budget[budget.length-1];
        for(int i=budget.length-2;i>0;i--){
            int current=budget[i];
            int diff=(budget.length-i)*current;
            max1=Math.max(max1,diff);
        }
        return max1;

	}

}
