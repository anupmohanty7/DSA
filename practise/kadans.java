import java.util.*;
class kadans{
	public int solution(int arr[]){
		int n=arr.length;
		int sum=0,msum=0,i=0;
		
		for(i=0;i<n;i++){
			sum=sum+arr[i];
			if(sum<0){
				sum=0;
			}
			if(sum!=0)
			{
				System.out.println(arr[i]);
			}
			msum=Math.max(msum,sum);
		}
		return msum;
	}
}
class driver{
	public static void main(String args[]){
		int arr[]={-2,-3,4,-1,-2,1,5,-3};
		kadans ob=new kadans();
		int l=ob.solution(arr);
		System.out.println("Maximum sum is: "+l);
	}
}