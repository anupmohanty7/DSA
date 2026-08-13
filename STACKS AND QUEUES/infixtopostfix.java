//INFIX TO POSTFIX
import java.util.*;
class infixtopostfix{
	public static int prec(char c){
		if(c=='^')
		{
			return 3;
		}
		else if(c=='/' || c=='*')
		{
			return 2;
		}
		else if(c=='+' ||c=='-')
		{
			return 1;
		}
		else{
			return -1;
		}
	}
	static void solution(String s)
	{
		Stack<Character> st=new Stack<>();
		StringBuilder result=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				result.append(c);
			}
			else if(c=='(')
			{
				st.push(c);
			}
			else if(c==')')
			{
				while(st.peek()!='(')
				{
					result.append(st.pop());
				}
				st.pop();
			}
			else{
				while(!st.isEmpty() && infixtopostfix.prec(c)<=infixtopostfix.prec(st.peek()))
				{
					result.append(st.pop());
					
				}
				st.push(c);
			}
		}
		while(st.isEmpty())
		{
			result.append(st.pop());
		}
		System.out.println(result.toString());
	}
}
class driver{
	public static void main(String args[])
	{
		String s="a+b*(c^d-e)^(f+g*h)-i";
		System.out.println(s);
		System.out.println("Postfix expression is :");
		infixtopostfix.solution(s);
	}
}