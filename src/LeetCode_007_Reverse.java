
public class LeetCode_007_Reverse {
	public int reverse(int x) {
		int a[] = new int[10];
		int count = 0 , right = 0;
		while(x!=0)
		{
			right = x%10;
			x = x/10;
			a[count++] = right; 
		}
		x = 0;
		
		for(int i = 0; i < count; i++)
		{			
			if((x>214748364 | x<-214748364) && (count==10))
			{
				x=0;
				break;
			}
			x = 10*x + a[i];
		}
		return x;
    }
}
