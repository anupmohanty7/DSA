//find the missing number
/*Brute force approach
import java.util.*;
class ftmn{
	public static void main(String args[])
	{
		System.out.println("Enter the array");
		int arr[]={1,2,3,5,6,7};
		int i=1;
		int k=i-1;
		for(i=1;i<=arr.length;i++)
		{
			if(i!=arr[k]){
			System.out.println("The missing number is "+i);
			
			}
		}
	}
}*/
//optimal approach
import java.util.*;
class ftmn{
	public static void main(String args[])
	{
		//System.out.println("Enter the array");
		int arr[]={1,2,3,5,6,7};
		int size=arr.length;
		int n=arr[size-1];
		int sum=(n*(n+1))/2;
		int i=0;
		int actsum=0;
		for(i=0;i<size;i++)
		{
			actsum=actsum+arr[i];
		}
		System.out.println("Missing number is "+(sum-actsum));
	}
}