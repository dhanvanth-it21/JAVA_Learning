package trees;
import java.util.Scanner;


public class TreeTest { 
	
	
	
	
	
	//print-tree : 1 preOrder way
	//just print your self 
	//rest of it's children will take care of them self
	public static void printTree(TreeNode<Integer> root) {
		//special case:
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		// the base case is handled using for loop
		for(int i = 0; i<root.children.size();i++) {
			TreeNode<Integer> child = root.children.get(i);
			//recursive call
			printTree(child);
		}
	}
	//it is not standard because it doesn't 
	//particularly say who is whose child
	
	
	
	
	
	
	//print-tree:2 (Better)
	public static void printTreeBetter(TreeNode<Integer> root) {
		//special case:
		if(root == null) {
			return;
		}
		System.out.print(root.data+" : ");
		//also printing its children beside its root node
		for(int i = 0;i<root.children.size();i++) {
			System.out.print(root.children.get(i).data+" ");
		}
		System.out.println();
		// the base case is handled using for loop
		for(int i = 0; i<root.children.size();i++) {
			TreeNode<Integer> child = root.children.get(i);
			//recursive call
			printTreeBetter(child);
		}
	}
	
	
	
	
	
	
	//Finding the number of Nodes
	public static int numberOfNode(TreeNode<Integer> root) {
		//base case
		if(root == null) {
			return 0;
		}
		//root's count as 1
		int count = 1;
//		recursive call of it's child
		for(int i = 0;i<root.children.size();i++) {
			count += numberOfNode(root.children.get(i));
		}
		return count;
	}
	
	
	
	
	
	
	//sumOfAllNodes
	public static int sumOfAllNode(TreeNode<Integer> root){
		if(root == null){
			return 0;
		}
		int sum = 0;
		sum += root.data;
		for(int i = 0;i<root.children.size();i++){
			 int localSum = sumOfAllNode(root.children.get(i));
			 sum += localSum;
		}
		return sum;
	
	}
	
	
	public static TreeNode<Integer> treeInput(int rootData){
		if(rootData == -1) {
			return null;
		}
		TreeNode<Integer> root = new TreeNode<>(rootData);
		Scanner sc = new Scanner(System.in);
		System.out.print("how many children do "+root.data+" have : ");
		int n = sc.nextInt();
		System.out.println();
		for(int i = 0;i<n;i++) {
			int position = i+1;
			System.out.print("enter child-"+position+" of "+ root.data+" :");
			int child = sc.nextInt();
			System.out.println();
			root.children.add(treeInput(child));
		}
		return root;
	}
	
	
	
	
	public static TreeNode<Integer> levelwiseInput(){
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter the root data : ");
		int rootData = sc.nextInt();
		if(rootData == -1) {
			return null;
		}
		TreeNode<Integer> root = new TreeNode<>(rootData);
		QueueUsingLL<TreeNode<Integer>> q = new QueueUsingLL<>();
		q.enqueue(root);
		while(!q.isEmpty()) {
			TreeNode<Integer> front = q.dequeue();
			System.out.println("how many children do "+front.data+" have : ");
			int n = sc.nextInt();
			for(int i = 0;i<n;i++) {
				System.out.println("enter the child-"+i+" of"+front.data+": ");
				int child = sc.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(child);
				front.children.add(childNode);
				q.enqueue(childNode);
			}
		}
		
		return root;
	}

	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//node creation 
//		TreeNode<Integer> root = new TreeNode<>(4);
//		TreeNode<Integer> node1 = new TreeNode<>(2);
//		TreeNode<Integer> node2 = new TreeNode<>(3);
//		TreeNode<Integer> node3 = new TreeNode<>(1);
//		TreeNode<Integer> node4 = new TreeNode<>(5);
//		TreeNode<Integer> node5 = new TreeNode<>(6);
//		
//		// 4 have children as 2 3 1
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		
//		// 3 have children as 5 6
//		node2.children.add(node4);
//		node2.children.add(node5);
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the root node data: ");
//		int rootData = sc.nextInt();
//		System.out.println();
//		TreeNode<Integer> root = treeInput(rootData);
		TreeNode<Integer> root = levelwiseInput();
		
//		printTree(root);
//		System.out.println();
		System.out.println("The Tree Structure : ");
		printTreeBetter(root);
		System.out.print("Number of Nodes in root: = ");
		System.out.println(numberOfNode(root));
		
		System.out.print("sum of all nodes:");
		System.out.println(sumOfAllNode(root));
		
		
		

	}

}
