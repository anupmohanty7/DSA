class firstjs{
	public int binarysearch(int arr[],int s,int e,int t)
	{
		int mid=(s+e)/2;
		if(s>e){
			return -1;
		}
		else if(t==arr[mid]){
			return mid;
		}
		else if(t>arr[mid]){
			return binarysearch(arr,mid+1,e,t);
		}
		return binarysearch(arr,s,mid-1,t);
	}
	public int solution(int arr[],int t){
		return binarysearch(arr,0,arr.length-1,t);
	}
}
class driver{
	public static void main(String args[]){
		int arr[]={1,2,3,4,5,6,7};
		firstjs ob=new firstjs();
		if(ob.solution(arr,5)==-1){System.out.println("Not found");}
		else{System.out.println("found");}
	}
}