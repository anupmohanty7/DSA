/*import java.util.*;

public class FloorAndCeilling{
	
	public void solution(int arr[],int x){
		
		int n=arr.length;
		int high=n-1;
		int low=0;
		
		int f=-1;//floor
		int c=-1;//ceiling
		
		int flag=0;
		while(flag==0)
		{
			int mid=(low+high)/2;
			
			if(arr[mid]==x){
				f=arr[mid];
				c=arr[mid];
				flag=1;
			}
			
			if(arr[mid]>x)
			{
				if(arr[mid-1]<x){
					f=arr[mid-1];
					c=arr[mid];
					flag=1;
				}
				high=mid-1;
			}
			
			if(arr[mid]<x)
			{
				if(arr[mid+1]>x){
					f=arr[mid];
					c=arr[mid+1];
					flag=1;
				}
				low=mid+1;
			}
		}
		System.out.println("Floor: "+f+" Ceiling: "+c);
	}
	
	
	public static void main(String args[]){
		
		int arr[]={3, 4, 4, 7, 8, 10};
		int x=8;
		
		FloorAndCeilling ob = new FloorAndCeilling();
		
		ob.solution(arr,x);
		
	}
}*/
import java.util.*;

public class FloorAndCeilling{
	
	public void solution(int arr[],int x){
		
		int n=arr.length;
		int high=n-1;
		int low=0;
		
		int f=-1;//floor
		int c=-1;//ceiling
		
		//finding ceiling
		while(low<=high){
			
			int mid=(low+high)/2;
			if(arr[mid]>=x){
				c=arr[mid];
				high=mid-1;
			}
			else{
				low=mid+1;
			}
		}
		System.out.println("Ceiling: "+c);
		
		high=n-1;
		low=0;
		//finding floor
		while(low<=high){
			
			int mid=(low+high)/2;
			if(arr[mid]<=x){
				f=arr[mid];
				low=mid+1;
			}
			else{
				high=mid-1;
			}
			
		}
		System.out.println("Floor: "+f);
	}
	
	
	public static void main(String args[]){
		
		int arr[]={3, 4, 4, 7, 8, 10};
		int x=8;
		
		FloorAndCeilling ob = new FloorAndCeilling();
		
		ob.solution(arr,x);
		
	}
}