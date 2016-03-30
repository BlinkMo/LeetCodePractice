
public class LeetCode_013_RomanToInteger {
    public int romanToInt(String s) {
        int romanInteger = CharToNumber(s.charAt(0));
        for(int i = 1;i<s.length();i++)
        {
        	if(  CharToNumber(s.charAt(i-1)) <  CharToNumber(s.charAt(i)) )
        	{
        		romanInteger+= CharToNumber(s.charAt(i)) - 2*CharToNumber(s.charAt(i-1));
        	}
        	else
        	{
        		romanInteger+=CharToNumber(s.charAt(i));
        	}
        }
        return romanInteger;
    }
    
    public int CharToNumber(char roman)
    {
    	switch(roman){
    		case 'I': return 1;  
    		case 'V': return 5;  
    		case 'X': return 10;  
    		case 'L': return 50;  
    		case 'C': return 100;  
    		case 'D': return 500;  
    		case 'M': return 1000;
    	}
    	return 0;
    }
    
}
