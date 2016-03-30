
public class LeetCode_038_CountAndSay {
    public String countAndSay(int n) {
        String countString = "1";
        for(int i = 1;i < n ;i++)
        {
        	countString = countAndSayString(countString);
        }
        return countString;
    }
    
    public String countAndSayString(String simple) {
    	char countChar,nextChar;
    	String countString = "";
    	int intChar = 1;
        for(int i=1;i<simple.length();i++)
        {
        	countChar = simple.charAt(i-1);
        	nextChar = simple.charAt(i);
        	if( countChar == nextChar)
        	{
        		intChar++;
        		if(simple.length() == i+1)
        		{
        			countString+= String.valueOf(intChar)+String.valueOf(countChar);
        		}
        	}
        	else
        	{
        		countString+= String.valueOf(intChar)+String.valueOf(countChar);
        		intChar = 1;
        		
        		if(simple.length() == i+1)
        		{
        			countString+= String.valueOf(intChar)+String.valueOf(nextChar);
        		}
        	}
        }
        
        if(simple.length()==1) return "11";
        else return countString;
    }
}
