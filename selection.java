
public class selection{
    public static void main(String args[]){
        int i=0,j=0;
        int arr[]={64,25,12,22,11};
        int n=arr.length;
        for(i=0;i<n-1;i++)
        {
            int min=arr[i];
            for(j=i+1;j<n;j++)
            {
                if(arr[j]<min)
                {
                    int temp=arr[j];
                    arr[j]=min;
                    min=temp;
                    arr[i]=min;
                }
            }
        }
        System.out.println("Sorted array:");
        for(i=0;i<n;i++)    
        {
            System.out.print(arr[i]+" ");
        }
    }
}