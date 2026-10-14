import java.util.*;

public class CountGoodNums{
	
	static final long MOD = 1_000_000_007;
	
	static long helper(int n,long ans,int i){
		
		
		if(n==0){
			return ans;
		}
		
		if(i%2==0){
			ans = (ans * 5) % MOD;
		}
		
		else{
			ans = (ans * 4) % MOD;
		}
		
		return helper(n-1,ans,i+1);
	}
	
	
	public long goodNums(int n){
		long ans=1;
		int i=0;
		
		return helper(n,ans,i);
	}
	
}
class Main{

	public static void main(String args[]){
	int n=3;
	
	CountGoodNums ob = new CountGoodNums();
	long res=ob.goodNums(n);
	
	System.out.println(res);
	}
}