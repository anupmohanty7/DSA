/*import java.util.*;

public class pow{
	
	public double helper(double xh,double nh,double resh){
		
		
		if(nh==0){
			return resh;
		}
		//if(nh>0)
		//{
			return helper(xh,nh-1,(resh*xh));
	//	}
		//if(nh<0)
		//{
		//	return helper(xh,nh+1,(resh*xh));
		//}
		
		//return -1;
	}
	public double power(double x,double n){
		
		double res=1;
		
		return helper(x,n,res);
	}
	
}
class Main{
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the value of x");
		double x=sc.nextDouble();
		System.out.println("Enter the value of n and make sure n is an integer");
		double n=sc.nextInt();
		
		
		pow ob = new pow();
		double res;
		
		if(n>=0){
			res=ob.power(x,n);
		}
		else{
			res=ob.power((1/x),-n);//Earlier i had not given the - in n. That's why you will see many code that i commented. By just writing a single - the code becomes too much shorter
		}
		
		System.out.println("Result= "+res);
		
	}
	
}*/
//This method have TC O(n) as weel as SC O(n)

import java.util.*;

public class pow{
	
	public double helper(double x,int n){
		
		if(n==0) return 1;
		
		if(n==1) return x;
		
		if(n%2==0)
		{
			return helper(x*x,(n/2));
		}
		return helper(x*x,n-1);
		
	}
	
	public double power(double x,int n){
		
		if(n<0){
			return 1/(helper(x,-n));
		}
		return helper(x,n);
	}
	
}
class Main{
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the value of x");
		double x=sc.nextDouble();
		System.out.println("Enter the value of n and make sure n is an integer");
		int n=sc.nextInt();
		
		pow ob =new pow();
		double res=ob.power(x,n);
		System.out.println("Result= "+res);
		
	}
	
}
//This method have TC O(logn) as weel as SC O(logn)