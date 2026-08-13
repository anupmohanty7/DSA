//Longest subarray in an array with a given sum k(With both positive elements and negative elements)
import java.util.*;
class lswgk2{
	public static void main(String args[])
	{
		int arr[]={-1,3,-1,4,-4};
		int n=arr.length;
		int i,j,x;
		int sum=0;
		int maxi=0;
		int k=1;
		for(i=0;i<n;i++)
		{
			sum=0;
			for(j=i;j<n;j++)
			{
				sum=sum+arr[j];
				if(sum==k)
				{
					maxi=Math.max(maxi,j-i+1);
				}
			}
		}
		System.out.println(maxi);
		}
}


