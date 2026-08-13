//charctaer hashing
import java.util.*;
public class chhashing {
    public static void main(String args[]){
        int i=0;
        int hash[]=new int[26];
        String str="helloworld";
        for(i=0;i<str.length();i++){
            hash[str.charAt(i)-'a']++;
        }
        System.out.println("Enter the query");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++){
            char q=sc.next().charAt(0);
            System.out.println(q+" appears "+hash[q-'a']+" times");
        }
    }
}
