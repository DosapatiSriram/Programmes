

import java.util.*;

import org.apache.poi.util.SystemOutLogger;

import java.io.*;

public class RightviewTree {
	 static Node head=null;
	 static class Node{
		 Node next;
		 Node prev;
		 int data;
		 
		 public Node(int data){
			 this.data=data;
			 this.next=null;
			 this.prev=null;
		 }
		 
	 } 
	
	static void print(Node root){
		
		if(root == null){
			return;
		}
		
		print(root.prev);
		System.out.print(root.data+" --> ");
		print(root.next);
		
	}
	
	static int maxvalue;
	static void rightview(Node root,int value){
		if(root == null){
			return;
		}
		
		if(value >= maxvalue){
			System.out.println(root.data +" --> ");
			maxvalue++;
		}
		
		rightview(root.next,value+1);
		rightview(root.prev,value+1);
		
	}
	
	public static void bottomview(Node root){
		if(root.prev == null && root.next ==null){
			System.out.println(root.data);
			return;
		}else if(root.prev == null){
			bottomview(root.next);
		}else if(root.next == null){
			bottomview(root.prev);
		}else {
			bottomview(root.prev);
			bottomview(root.next);
		}
		
		
	}
	
	Queue<Node> queue=new LinkedList<Node>();
	
	String sep=" ";
	public  void LevelOrderTraversal(Node root){
		queue.add(root);
		while(queue.size() !=0){
			
			if(queue.peek().prev != null){
				queue.add(queue.peek().prev);	
			}
			
			if(queue.peek().next != null){
				queue.add(queue.peek().next);	
			}
			
			Node temp=queue.poll();
			System.out.print(sep+temp.data);
			sep=" , ";
		}
		
	}
	
	class Node_Hdistance{
		Node node;
		int h;
		
		public Node_Hdistance(){
			
		}
	}
	
	Queue<Node_Hdistance> queue_h=new LinkedList<>();
	TreeMap<Integer,ArrayList<Node>> map=new TreeMap<>();
	
	public void Verticalview(Node root){
		Node_Hdistance temp=new Node_Hdistance();
		temp.node=root;
		temp.h=0;
		queue_h.add(temp);
		while(queue_h.size() !=0){
			temp=queue_h.poll();
			Node t=temp.node;
			int h_temp=temp.h;
			//System.out.println(t.data);
			if(t.prev != null){
				Node_Hdistance lefttemp=new Node_Hdistance();
				lefttemp.node=t.prev;
				lefttemp.h=h_temp-1;
				queue_h.add(lefttemp);
			}
			
			if(t.next != null){
				Node_Hdistance righttemp=new Node_Hdistance();
				righttemp.node=t.next;
				righttemp.h=h_temp+1;
				queue_h.add(righttemp);
			}
			
			//map.computeIfPresent(h_temp, (h_temp,list) -> )
			
			if(map.containsKey(h_temp)){
				ArrayList<Node> temp_nodelist=map.get(h_temp);
				temp_nodelist.add(t);
				map.put(h_temp,temp_nodelist);	
			}else{
				map.put(h_temp,new ArrayList<Node>(Arrays.asList(t)));
				//map.put(h_temp,{t});
			}
		}
		
		for(Integer hordis:map.keySet()){
			for(Node n:map.get(hordis)){
				System.out.print(sep+n.data);
				sep=" , ";
			}
		}
	}
	
	Map<Integer,Integer> topviewmap=new TreeMap<Integer,Integer>();
	
	public void TopviewofTree(Node root){
		Node_Hdistance temp=new Node_Hdistance();
		temp.node=root;
		temp.h=0;
		queue_h.add(temp);
		while(queue_h.size() != 0){
			temp=queue_h.poll();
			
			if(temp.node.prev != null){
				Node_Hdistance leftnode=new Node_Hdistance();
				leftnode.node=temp.node.prev;
				leftnode.h=temp.h-1;
				queue_h.add(leftnode);	
			}
			
			if(temp.node.next != null){
				Node_Hdistance rightnode=new Node_Hdistance();
				rightnode.node=temp.node.next;
				rightnode.h=temp.h+1;
				queue_h.add(rightnode);	
			}
			
			if(!topviewmap.containsKey(temp.h)){
				topviewmap.put(temp.h,temp.node.data);	
			}
		}
		
		topviewmap.keySet().stream().forEach(i -> System.out.println(topviewmap.get(i)));
		
		
		
	}
	
	public void BottomviewofTree(Node root){
		Node_Hdistance temp=new Node_Hdistance();
		temp.node=root;
		temp.h=0;
		queue_h.add(temp);
		while(queue_h.size() != 0){
			temp=queue_h.poll();
			
			if(temp.node.prev != null){
				Node_Hdistance leftnode=new Node_Hdistance();
				leftnode.node=temp.node.prev;
				leftnode.h=temp.h-1;
				queue_h.add(leftnode);	
			}
			
			if(temp.node.next != null){
				Node_Hdistance rightnode=new Node_Hdistance();
				rightnode.node=temp.node.next;
				rightnode.h=temp.h+1;
				queue_h.add(rightnode);	
			}
			
			
				topviewmap.put(temp.h,temp.node.data);	
			
		}
		
		topviewmap.keySet().stream().forEach(i -> System.out.println(topviewmap.get(i)));
	}
	
	Stack<Node> stack1=new Stack<Node>();
	Stack<Node> stack2=new Stack<Node>();
	public void spiralviewoftree(Node root){
		stack1.push(root);
		
		while(stack1.size() !=0 || stack2.size() != 0){
			while(stack1.size()!=0){
				Node temp=stack1.pop();
				System.out.print(temp.data+",");
				if(temp.prev != null){
					stack2.push(temp.prev);	
				}
				
				if(temp.next != null){
					stack2.push(temp.next);	
				}
				
				
			}
			
			while(stack2.size()!=0){
				Node temp=stack2.pop();
				System.out.print(temp.data+",");
				if(temp.next != null){
					stack1.push(temp.next);	
				}
				if(temp.prev != null){
					stack1.push(temp.prev);	
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(3);
		
		Node first=new Node(2);
		Node second=new Node(5);
		Node third=new Node(1);
		Node fourth=new Node(8);
		Node fifth=new Node(10);
		
		head.prev=first;
		head.next=second;
		
		first.next=third;
		
		third.prev=fourth;
		third.next=fifth;
		
		fifth.next=new Node(13);
		fifth.next.next=new Node(15);
		fifth.next.prev=new Node(26);
		
		RightviewTree tree=new RightviewTree();
		tree.head=head;
		
		
		//print(head);
		//rightview(head,0);
		//bottomview(head);
		//tree.LevelOrderTraversal(tree.head);
		//tree.Verticalview(tree.head);
		//tree.TopviewofTree(head);
		//tree.BottomviewofTree(head);
		tree.spiralviewoftree(tree.head);
		
		
		
        
	}

}
