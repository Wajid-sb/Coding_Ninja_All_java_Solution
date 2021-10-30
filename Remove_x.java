public class solution {

	// Return the changed string
    public static String removeChar(String s,char x,String y){
        if(s.length()==0){
            return s;
        }
        
        String Smaller=removeChar(s.substring(1),x,y);
        // return Smaller;\
        if(s.charAt(0)==x){
            
            return y+Smaller;
        }else{
            return s.charAt(0)+Smaller;
        }

    }
	public static String removeX(String input){
		// Write your code here
        return removeChar(input,'x',"");

	}
}
