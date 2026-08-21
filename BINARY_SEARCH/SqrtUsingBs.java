import java.util.*;

public class SqrtUsingBs{
	
	public int solution(int x){
		
		int low=0;
		int high=x-1;
		int ans=-1;
		
		while(low<=high){
			int mid=(low+high)/2;
			
			if(mid*mid==x){
				ans=mid;
				return ans;
			}
			if(mid*mid>x){
				//move left
				high=mid-1;
			
			}
			if(mid*mid<x){
				//move right
				ans=mid;//possible floor
				low=mid+1;
			}
		
		}
		
		return ans;
	}
	
	
	public static void main(String args[]){
		
		int x=28;
		
		SqrtUsingBs ob=new SqrtUsingBs();
		
		int ans=ob.solution(x);
		
		System.out.println(ans);
		
	}
}