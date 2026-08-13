class node{
	int ele;
	node next;
	node(int ele)
	{
		this.ele=ele;
		next=null;
	}
}
class queueusingLL
{
	node head=null;
	node start=null;
	node end=null;
	int size=0;
	void push(int val)
	{
		node n=new node(val);
		if(start==null)
		{
			head=start=end=val;
		}else{
		end.next=val;
		end=val;
		}
		size++;
	}
	int pop()
	{
		if(start==null)
		{
			return -1;
		}
		int value=start.ele;
		node temp=start;
		start=start.next;
		temp=null;
		return value;
		size--;
	}
	 public int peek() {

        if (start == null) {
            return -1; 
        }
        
        return start.val; 
    }

   
    public boolean isEmpty() {
        return (size == 0);
    }
}
class driver{
	public static void main(String args[])
	{
		queueusingLL q=new queueusingLL();
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