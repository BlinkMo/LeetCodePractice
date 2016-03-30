
public class LeetCode_012_IntegerToRoman {
	
    public String intToRoman(int num) {
    	String[] Roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    	int[] Number = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    	int i = 0;
    	String RomanString = "";
    	
    	while(num!=0)
    	{
    		if(num >= Number[i])
    		{
    			RomanString +=Roman[i];
    			num-=Number[i];
    		}
    		else
    		{
    			i++;
    		}
    	}
    	
    	return RomanString;
        
    }
	

}
