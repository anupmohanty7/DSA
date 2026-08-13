//Find the maximum sum that can be get from the subarray of a given array
//This is the brute force approch with time complexity O(n2)
/*import java.util.*;
class kadans
{
	int sum(int arr[])
	{
		int n=arr.length;
		int maxi=0;
		int i=0;
		int j=0;
		int s;
		for(i=0;i<n;i++)
		{
			s=arr[i];
			for(j=i+1;j<n;j++)
			{
				s=s+arr[j];
				maxi=Math.max(maxi,s);
			}
		}
		return maxi;
	}
	public static void main(String args[])
	{
		int arr[]={2,3,5,-2,7,-4};
		kadans ob=new kadans();
		int res=ob.sum(arr);
		System.out.println("Maximum sum is :"+res);
	}
}*/
//optimum approach
//KADANS ALOGRITHIM "DROP THE SUM ONLY WHEN IT'S BECOMES NEGATIVE"
class kadans{
	int maxsum(int[] arr)
	{
		int n=arr.length;
		int sum=0;
		int maxi=0;
		int i=0;
		for(i=0;i<n;i++)
		{
			sum=sum+arr[i];
			if(sum>maxi)
			{
				maxi=sum;
			}
			if(sum<0)
			{
				sum=0;
			}
			
		}
		return maxi;
	}
	public static void main(String args[])
	{
		int arr[]={2,3,5,-2,7,-4};
		kadans ob=new kadans();
		int res=ob.maxsum(arr);
		System.out.println("The maximum sum is :"+res);
	}
}