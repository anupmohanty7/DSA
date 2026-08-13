//charctaer all charcater hashing
import java.util.*;
public class charhash {
    public static void main(String args[]){
        int i=0;
        int hash[]=new int[256];//total 256 character are their
        String str="helloworld";
        for(i=0;i<str.length();i++){
            hash[str.charAt(i)]++;
        }
        System.out.println("Enter the query");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++){
            char q=sc.next().charAt(0);
            System.out.println(q+" appears "+hash[q]+" times");
        }
    }
}

