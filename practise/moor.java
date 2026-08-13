import java.util.*;
class moor{
	private int solution(int arr[]){
		int n=arr.length;
		int ele=0;
		int cnt=0;
		int i=0;
		for(i=0;i<n;i++){
			if(cnt==0){
				ele=arr[i];
				cnt=1;
			}
			else if(ele==arr[i]){
				cnt++;
			}
			else{
				cnt--;
			}
		}
		//for verifying
		int cnt1=0;
		for(i=0;i<n;i++)
		{
			if(arr[i]==ele){
				cnt1++;
			}
		}
		if(cnt1>(n/2)){
			return ele;
		}
		return ele;
	}
	public static void main(String args[]){
		int arr[]={5,7,1,5,7,5,5,9,5,5,6,3};
		moor ob=new moor();
		int ele=ob.solution(arr);
		System.out.println("The majority element is: "+ele);
	}
}