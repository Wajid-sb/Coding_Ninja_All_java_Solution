
public class solution {

	// Return the updated string
	public static String addStars(String s) {
		// Write your code here
        if(s.length()==1){
            return s;
        }
        String ss=addStars(s.substring(1));
        if(s.charAt(0)==s.charAt(1)){
            return s.charAt(0)+"*"+ss;
        }else{
            return s.charAt(0)+ss;
        }

	}
}
