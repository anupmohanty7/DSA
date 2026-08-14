import java.util.*;

public class FloorAndCeilling{
	
	public void solution(int arr[],int x){
		
		int n=arr.length;
		
		int low=0;
		int high=n-1;
		

		
		int floor = -1;
		int ceiling = -1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (arr[mid] == x) {
				floor = arr[mid];
				ceiling = arr[mid];
				break;
			}

			if (arr[mid] < x) {
				// arr[mid] is a possible floor
				floor = arr[mid];
				low = mid + 1;
			}
			else {
				// arr[mid] is a possible ceiling
				ceiling = arr[mid];
				high = mid - 1;
			}
		}
		
		System.out.println("Floor: "+floor+" Ceiling: "+ceiling);
	}
	
	
	public static void main(String args[]){
		
		int arr[]={1,3,4,5,7};
		int x=6;
		
		FloorAndCeilling ob = new FloorAndCeilling();
		
		ob.solution(arr,x);
		
	}
}