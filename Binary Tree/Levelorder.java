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
class Inorder{
	static List<List<Integer>> solution(node root){
		
		Queue<node> queue = new LinkedList<>();
		List<List<Integer>> list = new LinkedList<>();
		
		queue.offer(root);
		while(!queue.isEmpty()){
			int levelnum=queue.size();
			List<Integer> sublist=new LinkedList<Integer>();
			for(int i=0; i<levelnum; i++){
			node x=queue.poll();
			if(x.left!=null){
				queue.offer(x.left);
			}
			if(x.right!=null){
				queue.offer(x.right);
			}
			sublist.add(x.data);
			}
		list.add(sublist);
			
		}
		
		return list;
	}
}
class Main{
	public static void main(String args[]){
		node root = new node(1);
		
		root.left = new node(2);
		
		root.right = new node(3);
		
		root.left.left = new node(4);
		
		root.left.right = new node(5);
		
		Inorder ob = new Inorder();
		
		List<List<Integer>> result=ob.solution(root);
		
		System.out.println(result);
	}
}