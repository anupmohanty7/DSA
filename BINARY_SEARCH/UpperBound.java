import java.util.*;


public class UpperBound{
	public int solution(int arr[],int x){
		int n=arr.length;
		int start=0;
		int end=n-1;
		int ans=-1;
		
		if(n==0){
			return -1;
		}
		
		while(start<=end )
		{
			int mid=(start+end)/2;
			if(arr[mid]>x)
			{
				end=mid-1;
				ans=mid;
			}
			if(arr[mid]<=x)
			{
				start=mid+1;
			}
		}
		
		return ans;
	}


	public static void main(String args[]){
		
		
		int arr[]={1,2,2,3};
		int x=1;
		
		UpperBound ob=new UpperBound();
		int res=ob.solution(arr,x);
		
		System.out.println("UpperBound is: "+res);
	}
}