//Longest subarray in an array with a given sum k(Only positive elements)
//We used the sliding window algorithim
import java.util.*;
class lswgk{
	public static void main(String args[])
	{
		int arr[]={0,5,2,-7,14,1};
		int k=15;
		int maxlen=0;
		int r=0,l=0;
		int sum=arr[0];
		int n=arr.length;
		while(r<n)
		{
			while(l<=r && sum>k)
			{
				sum=sum-arr[l];
				l++;
			}
			if(sum==k)
			{
				maxlen=Math.max(maxlen,r-l+1);
			}
			r++;
			if(r<n)
			{
				sum=sum+arr[r];
			}
		}
		System.out.println("length of largest subarray is:"+maxlen);
	}
}