public class Solution {
    public static String duplicate(String s,String b){
        if(s.length()<=1){
            return s;
        }
        String smaller = duplicate(s.substring(1),b);
        if(s.charAt(0)==s.charAt(1)){
            // b=b+charAt(0);
             return b+smaller;
        }else{
            return s.charAt(0)+smaller;
           
        }
        
    }

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
        return duplicate(s,"");

	}

}
