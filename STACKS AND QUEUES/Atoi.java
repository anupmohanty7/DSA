import java.util.*;
class Atoi{
	static final int INT_MIN_VAL = -2147483648;
		static final int INT_MAX_VAL = 2147483647;
	static int helper(String s,int i,long num,int sign)
	{
		
		if(i >= s.length() || !Character.isDigit(s.charAt(i)))
		{
			return (int)(sign*num);
		}
		num=num*10 +(s.charAt(i)-'0');
		if(sign * num <= INT_MIN_VAL){return INT_MIN_VAL;}
        if(sign * num >= INT_MAX_VAL){ return INT_MAX_VAL;}
		return helper(s,i+1,num,sign);
	}
	static int MyAtoi(String s)
	{
		int i=0;
		while(i<s.length() && s.charAt(i)==' ')
		{i++;}
		int sign=0;
		if(s.charAt(i)=='-')
		{
			sign=-1;
			i++;
		}
		else{
			sign=1;
			i++;
		}
		return helper(s,i,0,sign);
	}

}
class driver{
	public static void main(String args[])
	{
		String s="  -1234";
		Atoi a= new Atoi();
		System.out.println("The result is :"+a.MyAtoi(s));
	}
}