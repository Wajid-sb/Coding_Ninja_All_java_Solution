import java.lang.Math;
import java.util.*;
public class solution {

	public static int convertStringToInt(String input){

        if(input.length()<1){
            return 0;
        }
        int result=convertStringToInt(input.substring(1));
        return (int)((input.charAt(0)-'0')*Math.pow(10,input.length()-1))+result;
        
	}
}


