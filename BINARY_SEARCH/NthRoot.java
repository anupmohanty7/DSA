import java.util.*;

public class NthRoot{
	
	public int solution(int M,int N){
		
		int low=1;
		int high=M;
		int ans=-1;
		
		while(low<=high){
			int mid=(low+high)/2;
			
			Long p=1;
			int i=0;
			
			while(i<N){
				p=p*mid;
				i++;
				
				if(p>M){break;}
			}
			
			if(p==M){
				ans=mid;
				return ans;
			}
			if(p>M){
				//move left
				high=mid-1;
			
			}
			if(p<M){
				//move right	
				low=mid+1;
			}
		
		}
		
		return ans;
	}
	
	
	public static void main(String args[]){
		
		int M=27;
		int N=3;
		
		NthRoot ob=new NthRoot();
		
		int ans=ob.solution(M,N);
		
		System.out.println(ans);
		
	}
}