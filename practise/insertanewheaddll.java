class node{
	int ele;
	node next;
	node prev;
	node(int ele){
		this.ele=ele;
	}
}
class insertanewheaddll{
	public node solution(node head){
		node t=head;
		node x;
		node t1=head;
		while(t!=null){
			x=t.next;
			t.next=t.prev;
			t.prev=x;
			t1=t;
			t=x;
		}
		head=t1;
		return head;
		
	}	
	public void printlist(node head){
		node t=head;
		while(t!=null)
		{
			System.out.println(t.ele);
			t=t.next;
		}
	}
}
class driver{  
	public static void main(String args[]){
		node e1=new node(10);
		node e2=new node(20);
		node e3=new node(30);
		node e4=new node(40);
		e1.next=e2;
		e1.prev=null;
		e2.next=e3;
		e2.prev=e1;
		e3.next=e4;
		e3.prev=e2;
		e4.prev=e3;
		node head=e1;
		head.next=e2;
		head.prev=null;
		insertanewheaddll ob=new insertanewheaddll();
		node newhead=ob.solution(head);
		ob.printlist(newhead);
	}
}