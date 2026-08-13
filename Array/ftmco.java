//find the maximum number of consecutive ones
import java.util.*;
class ftmco{
	public static void main(String args[]){
		int arr[]={1,1,0,1,1,1,1,1};
		int hash[]=new int[10];
		int i,j;
		int cnt=0;
		int maxi=0;
		for(i=0;i<arr.length;i++)
		{
			
			if(arr[i]==0)
			{
				cnt=0;
			}
			else{
				cnt++;
			}
			if(cnt>maxi)
			{
				maxi=cnt;
			}
		}
		System.out.println(maxi);
	}
}