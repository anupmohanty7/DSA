import java.util.*;

class queueusingstack {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    void push(int x)
	{
		while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }

        // Insert the desired element
        st1.push(x);

        /* Pop out elements from the second stack 
        and push back on top of the first stack */
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
    }
	int pop()
	{
		 if (st1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Representing empty stack
        }

        // Get the top element
        int topElement = st1.pop(); // Perform the pop operation

        return topElement;
	}
	

    int peek() {
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        return st2.peek();
    }

    boolean isEmpty() {
        return st1.isEmpty() && st2.isEmpty();
    }
}

class driver{
	public static void main(String args[])
	{
		stackusingqueue q=new stackusingqueue();
		String[] commands={"stackusingqueue","push","push","pop","peek","isEmpty"};
		int[][] inputs={{},{4},{5},{},{},{}};
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
					System.out.println("l");
					break;
				}
				case "isEmpty":{
					System.out.println(q.isEmpty());
					break;
				}
				case "stackusingqueue":{
					break;
				}
			}
		}		
	}
}