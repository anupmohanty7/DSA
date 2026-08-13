//find the number that appears once
import java.util.*;
class fnao{
	public static void main(String args[]){
		int arr[]={1,1,2,3,3,4};
		int i,j;
		
		int maxi=arr[0];
		for(i=0;i<arr.length;i++)
		{
			maxi=Math.max(maxi,arr[i]);
		}
		int hash[]=new int[maxi+1];
		for(i=0;i<arr.length;i++)
		{
			hash[arr[i]]=hash[arr[i]]+1;
		}
		for(i=0;i<hash.length;i++)
		{
			if(hash[i]==1)
			{
				System.out.println(""+i);
			}
		}
	}
}