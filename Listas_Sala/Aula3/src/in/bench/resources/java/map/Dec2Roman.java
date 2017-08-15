package in.bench.resources.java.map;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Collections;
import java.util.List;



public class Dec2Roman {

	// esta indirecao extra so para poder trocar as versoes facil!
	// troque conv0 por conv1, conv2, conv10, etc. 
	// assim voce pode manter as versoes como metodos da mesma classe.
	
	public static String conv(int num) {
		return conv2008(num);
	}
	
	// 1 {} -> null
	public static String conv0(int num) {
		return null; 	// version 0: no test passes.
	}
	
	// next iteration: one test passes
	// 2 nil -> constant
	public static String conv1(int num) {
		return "I";
	}
	
	/*********************************************************/
	// 3rd iteration: 2 tests pass
	// 4 Constant -> variable
	// 5 statement -> statements
	// 6 unconditional -> conditional
	public static String conv2(int num) {
		
		 String res = "I";

	     if (num > 1)
	        {
	            res += "I";
	        }
	     
	     return res;
	}

	// **************** WHAT YOU HAVE TO DO ****************
	// now write a convX method for each test. 
	// each new convX version must make a new test pass
	// BUT PERFORM ONLY THE MINIMUM CHANGES AT EACH STEP
	// *****************************************************
	
	public static String conv3(int num) {
		String res;
		res = "I";
		if(num==0)
		{
			return "";
		}
		return res+conv3(num-1);
	     
	}
	
	public static String conv4(int num)
	{
		String res;
		if(num <= 3)
		{
			res = "I";
			if(num==0)
			{
				return "";
			}
			return res+conv4(num-1);
			
		}
		else{
			res = "IV";
		
		}
	     
	     return res;
	}
	
	public static String conv5(int num)
	{
		String res;
		if(num <= 3)
		{
			res = "I";
			if(num==0)
			{
				return "";
			}
			return res+conv5(num-1);
		
		}
		else if(num == 4){
			res = "IV";
		}
		else
		{
			res = "V";
		}
	     
	     return res;
	}
	
	public static String conv8(int num)
	{
		String res;
		if(num <= 3)
		{
			
			res = "I";
			if(num==0)
			{
				return "";
			}
			return res+conv8(num-1);
			
			
		}
		else if(num == 4){
			res = "IV";
		}
		else
		{
			num -= 5;
			res = "V";
						
		     for (int i = 0; i < num; ++i)
		     {
		    	 res += "I";
		     } 
			
		}
	     
	     return res;
	}
	
	public static String conv10(int num)
	{
		LinkedHashMap<Integer, String> Results = new LinkedHashMap<Integer, String>();
    	Results.put(1,"I");
    	Results.put(4,"IV");
    	Results.put(5,"V");
    	Results.put(9,"IX");
    	Results.put(10,"X");
    	
    	if (Results.containsKey(num) )
        {
            return Results.get(num);
        }
    	
    	List<Integer> reverseKeys = new ArrayList<Integer>(Results.keySet());
    	 
        // reverse order of keys
        Collections.reverse(reverseKeys);
 
        String res = null;
        
        // iterate using reverse order of keys
        for(Integer key : reverseKeys){
            if(!(num > 4*key))
            {
            	while(num > key)
            	{
            		res += Results.get(key);
            		num -= key;
            	}
            }
            
        }
    	
        return res;
	}
	
	
	public static String conv14(int num)
	{
		LinkedHashMap<Integer, String> Results = new LinkedHashMap<Integer, String>();
    	Results.put(1,"I");
    	Results.put(4,"IV");
    	Results.put(5,"V");
    	Results.put(9,"IX");
    	Results.put(10,"X");
    	
    	if (Results.containsKey(num) )
        {
            return Results.get(num);
        }
    	
    	List<Integer> reverseKeys = new ArrayList<Integer>(Results.keySet());
    	 
        // reverse order of keys
        Collections.reverse(reverseKeys);
 
        String res = "";
        
        // iterate using reverse order of keys
        for(Integer key : reverseKeys){
            if(!(num > 4*key))
            {
            	while(num >= key)
            	{
            		res += Results.get(key);
            		num -= key;
            	}
            }
            
        }
    	
        return res;
	}
	
	public static String conv44(int num)
	{
		LinkedHashMap<Integer, String> Results = new LinkedHashMap<Integer, String>();
    	Results.put(1,"I");
    	Results.put(4,"IV");
    	Results.put(5,"V");
    	Results.put(9,"IX");
    	Results.put(10,"X");
    	Results.put(40,"XL");
    	
    	if (Results.containsKey(num) )
        {
            return Results.get(num);
        }
    	
    	List<Integer> reverseKeys = new ArrayList<Integer>(Results.keySet());
    	 
        // reverse order of keys
        Collections.reverse(reverseKeys);
 
        String res = "";
        
        // iterate using reverse order of keys
        for(Integer key : reverseKeys){
            if(!(num > 4*key))
            {
            	while(num >= key)
            	{
            		res += Results.get(key);
            		num -= key;
            	}
            }
            
        }
    	
        return res;
	}
	
	public static String conv100(int num)
	{
		LinkedHashMap<Integer, String> Results = new LinkedHashMap<Integer, String>();
    	Results.put(1,"I");
    	Results.put(4,"IV");
    	Results.put(5,"V");
    	Results.put(9,"IX");
    	Results.put(10,"X");
    	Results.put(40,"XL");
    	Results.put(50,"L");
    	Results.put(90,"XC");
    	Results.put(100,"C");
    	
    	if (Results.containsKey(num) )
        {
            return Results.get(num);
        }
    	
    	List<Integer> reverseKeys = new ArrayList<Integer>(Results.keySet());
    	 
        // reverse order of keys
        Collections.reverse(reverseKeys);
 
        String res = "";
        
        // iterate using reverse order of keys
        for(Integer key : reverseKeys){
            if(!(num > 4*key))
            {
            	while(num >= key)
            	{
            		res += Results.get(key);
            		num -= key;
            	}
            }
            
        }
    	
        return res;
	}
	
	public static String conv100s(int num)
	{
		LinkedHashMap<Integer, String> Results = new LinkedHashMap<Integer, String>();
    	Results.put(1,"I");
    	Results.put(4,"IV");
    	Results.put(5,"V");
    	Results.put(9,"IX");
    	Results.put(10,"X");
    	Results.put(40,"XL");
    	Results.put(50,"L");
    	Results.put(90,"XC");
    	Results.put(100,"C");
    	Results.put(400,"CD");
    	
    	if (Results.containsKey(num) )
        {
            return Results.get(num);
        }
    	
    	List<Integer> reverseKeys = new ArrayList<Integer>(Results.keySet());
    	 
        // reverse order of keys
        Collections.reverse(reverseKeys);
 
        String res = "";
        
        // iterate using reverse order of keys
        for(Integer key : reverseKeys){
            if(!(num > 4*key))
            {
            	while(num >= key)
            	{
            		res += Results.get(key);
            		num -= key;
            	}
            }
            
        }
    	
        return res;
	}
	
	public static String conv2008(int num)
	{
		LinkedHashMap<Integer, String> Results = new LinkedHashMap<Integer, String>();
    	Results.put(1,"I");
    	Results.put(4,"IV");
    	Results.put(5,"V");
    	Results.put(9,"IX");
    	Results.put(10,"X");
    	Results.put(40,"XL");
    	Results.put(50,"L");
    	Results.put(90,"XC");
    	Results.put(100,"C");
    	Results.put(400,"CD");
    	Results.put(500,"D");
    	Results.put(900,"CM");
    	Results.put(1000,"M");
    	
    	if (Results.containsKey(num) )
        {
            return Results.get(num);
        }
    	
    	List<Integer> reverseKeys = new ArrayList<Integer>(Results.keySet());
    	 
        // reverse order of keys
        Collections.reverse(reverseKeys);
 
        String res = "";
        
        // iterate using reverse order of keys
        for(Integer key : reverseKeys){
            if(!(num > 4*key))
            {
            	while(num >= key)
            	{
            		res += Results.get(key);
            		num -= key;
            	}
            }
            
        }
    	
        return res;
	}
	

}

// class Dec2Roman
	
	
	/// EXAMPLE OF HOW TO USE A DICTIONARY!
	// example of how to use a dictionary to avoid repetition
	
	


	
		

