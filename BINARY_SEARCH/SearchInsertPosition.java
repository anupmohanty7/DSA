import java.util.*;

public class SearchInsertPosition{
	
	
	public int solution(int arr[], int x){
		
		int low=0;
		int high=arr.length-1;
		int n=arr.length;
		int ans=n;
		
		for(int i=0;i<arr.length;i++){
			
			int mid=(low+high)/2;
			
			if(arr[i]>=x){
				
				ans=mid;
				high=mid-1;
				
			}
			else{
				
				low=mid+1;
				
			}
			
		}
		return ans;
		
	}
	
	public static void main(String args[]){
		
		int arr[]={1,2,4,7};
		int x=8;
		
		SearchInsertPosition ob=new SearchInsertPosition();
		int res = ob.solution(arr,x);
		
		System.out.println(res);
		
	}
}