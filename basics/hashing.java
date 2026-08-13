import java.util.Scanner;

class hashing{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int arr[]={1,2,1,3,4,4};
    int hash[]=new int[100];
    int i=0,j=0;
    // for(i=0;i<arr.length;i++)
    // {
    //     for(j=0;j<5;j++)
    //     {
    //         if(i==arr[j])
    //         {
    //             hash[i] +=1;
    //         }
    //     }
    // }
    for(i=0;i<arr.length;i++)
    {
        hash[arr[i]] +=1;
    }
    // for(i=0;i<5;i++)
    // {
    //     System.out.println("Enter the query");
    //     int q=sc.nextInt();
    //     System.out.println(q+" appears "+hash[q]+" times");

    // }
    System.out.println("Enter queries (Ctrl+D/Ctrl+Z to stop):");
        while(sc.hasNextInt()) {
            int q = sc.nextInt();
            if(q >= 0 && q < 100) {
                System.out.println(q + " appears " + hash[q] + " times");
            } else {
                System.out.println(q + " out of range");
            }
        }
}
}