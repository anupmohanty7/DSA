//find the majority element in an array. The majority element is the one that occurs n/2 times in the array.
//this is optimal approach time comp is o(n) but space complexity is O(n) due to the hash array we took
/*import java.util.*;
class majority{
	int majo(int arr[])
	{
		int i=0;
		int n=arr.length;
		int m=n/2;
		int hash[]=new int[10];//using hash map 
		for(i=0;i<n;i++)
		{
			hash[arr[i]]++;
		}
		for(i=0;i<n;i++)
		{
			if(hash[i]>m)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		int arr[]={7,0,0,1,7,7,2,7,7};
		majority ob=new majority();
		int res=ob.majo(arr);
		System.out.println("The majority element is :"+res);
	}
}*/
//this is the optimal approach
class majority{
	int majorityelement(int[] arr)
	{
		int n=arr.length;
		int cnt=0;
		int ele=0;
		int i=0;
		for(i=0;i<n;i++)
		{
			if(cnt==0)
			{
				cnt=1;
				ele=arr[i];
			}
			else if(arr[i]==ele)
			{
				cnt++;
			}
			else{
				cnt--;
			}
		}
		int cnt1=0;
		for(i=0;i<n;i++)
		{
			if(arr[i]==ele)
			{
				cnt1++;
			}
		}
		if(cnt1>(n/2))
		{
			return ele;
		}
		return ele;
	}
	public static void main(String args[])
	{
		int arr[]={7,0,0,1,7,7,2,7,7};
		majority ob=new majority();
		int res=ob.majorityelement(arr);
		System.out.println("The majority element is :"+res);
	}
}
