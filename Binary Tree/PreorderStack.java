import java.util.*;
class node{
	int data;
	node left;
	node right;
	
	public node(int data){
		this.data=data;
		left=right=null;
	}
}
class PreorderStack{
	static void solution(node root){
		Stack<node> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()){
			
			node current = stack.pop();
			
			System.out.println(current.data+" ");
			
			if(current.right!=null){
				stack.push(current.right);
			}
			if(current.left!=null){
				stack.push(current.left);
			}
		}
		
	}
}
class Main{
	public static void main(String args[]){
		
		node root = new node(1);
		
		root.left = new node(2);
		
		root.right = new node(3);
		
		root.left.left = new node(4);
		
		root.left.right = new node(5);
		
		PreorderStack ob = new PreorderStack();
		
		ob.solution(root);
	}
}