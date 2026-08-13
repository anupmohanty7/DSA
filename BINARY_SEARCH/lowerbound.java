class lowerbound{
	public int solution(int arr[],int n,int x){
		int low=0;
		int high=n-1;
		int ans=n;
		while(low<=high)
		{
			int mid=(high+low)/2;
			
			if(arr[mid]>=x){
				high=mid-1;
				ans=mid;
			}
			else{
				low=mid+1;
			}
		}
		return ans;
	}
}
class driver{
	public static void main(String args[]){
		int arr[]={1,2,2,3};
		int n=arr.length;
		lowerbound ob=new lowerbound();
		int i=ob.solution(arr,n,2);
		System.out.println(i);
	}
}