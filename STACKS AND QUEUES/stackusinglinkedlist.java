import java.util.*;
class stackusinglinkedlist{
	LinkedList<Integer> list=new LinkedList<>();
	void push(int ele)
	{
		list.add(ele);
	}
	int pop()
	{
		return list.removeLast();
	}
	int top()
	{
		return list.getLast();
	}
	Boolean isEmpty()
	{
		return list.isEmpty();
	}
}
class driver{
	public static void main(String args[])
	{
		stackusinglinkedlist q=new stackusinglinkedlist();
		String[] commands={"stackusinglinkedlist","push","push","push","pop","peek","isEmpty"};
		int[][] inputs={{},{4},{5},{6},{},{},{}};
		for(int i=0;i<commands.length;i++){
			switch(commands[i])
			{
				case "push":{
					q.push(inputs[i][0]);
					break;
				}
				case "pop":{
					System.out.println(q.pop());
					break;
				}
				case "peek":{
					System.out.println(q.top());
					break;
				}
				case "isEmpty":{
					System.out.println(q.isEmpty());
					break;
				}
				case "stackusinglinkedlist":{
					break;
				}
			}
		}
	}
}