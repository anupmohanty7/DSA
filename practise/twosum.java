import java.util.*;
class twosum{
	public int[] solution(int arr[],int t){
		int n=arr.length;
		int l=0;
		int r=n-1;
		while(l<r){
			if((arr[l]+arr[r])>t){
				r--;
			}
			else if((arr[l]+arr[r])<t){
				l++;
			}
			else{
				return new int[]{l,r};
			}
		}
		return new int[]{-1,-1};
	}	
}
class driver{
	public static void main(String args[]){
		int arr[]={1,7,11,3,4};
		twosum ob=new twosum();
		int res[]=ob.solution(arr,10);
		System.out.println("The result is: "+res[0]+"and"+res[1]);
	}
}