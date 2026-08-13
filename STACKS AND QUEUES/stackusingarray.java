//IMPLEMENTATION OF STACK USING ARRAY
import java.util.*;
class StackArray{
	int size;
	int top;
	int[] stack;
	StackArray(int size)
	{
		this.size=size;
		top=-1;
		stack=new int[size];
	}
	void push(int ele)
	{
		if(top==size-1)
		{
			System.out.println("Stack Overflow");	
		}
		else{
		top++;
		stack[top]=ele;
		}
	}
	int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow");
			return -1;
		}
		return stack[top--];
		
	}
	
}
class driver{
	public static void main(String args[])
	{
		StackArray s=new StackArray(5);
		s.push(10);
		s.push(20);
	
	System.out.println(""+s.pop());
	System.out.println(""+s.pop());
	System.out.println(""+s.pop());
}
}