import java.util.*;

public class KokoMonkey{

	public int solution(int h,int n,int arr[]){
		
		int low = Arrays.stream(arr).min().getAsInt();
		System.out.println(low);
		int high = Arrays.stream(arr).max().getAsInt();
		System.out.println(high);
		int sum=1;
		int x=0;
		int ans=-1;
		while(low<=high)
		{
			int k=(low+high)/2;
			for(int i=0;sum!=0;i++){
				
				System.out.println("Hi");
				if(arr[i]>k){
					arr[i]=arr[i]-k;
				}
				if(arr[i]<k){
					arr[i]=0;
				}
				for(int j=0;j<n;j++){
					sum=sum+arr[j];
				}
				if(sum==0)
				{
					x=i;
				}
			}
			if(x==h)
			{
				ans=k;
			}
			if(x>h)
			{
				low=k+1;
			}
			if(x<h)
			{
				high=k-1;
			}
		}
		return ans;
		
	}


	public static void main(String args[]){
		
		int arr[]={7,15,6,3};
		
		int h=8;
		int n=4;
		
		KokoMonkey ob=new KokoMonkey();
		int res=ob.solution(h,n,arr);
		
		System.out.println("Result: "+res);
		
	}
}