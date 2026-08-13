class node{
	int ele;
	node next;
	node(int ele){
		this.ele=ele;
	}
}
class addnewhead{
	public int soluton(int ele,node head){
		node e0=new node(ele);
		e0.next=head;
		head=e0;
		return head.ele;
	}
}
class driver{
	public static void main(String args[]){
		node e1=new node(10);
		node e2=new node(20);
		node e3=new node(30);
		node e4=new node(40);
		node head=e1;
		head.next=e2;
		e1.next=e2;
		e2.next=e3;
		e3.next=e4;
		addnewhead ob=new addnewhead();
		int e=ob.soluton(5,head);
		System.out.println(e);
	}
}