package binaryTreeModule_I;
//Bp - BasicPrint
//Btn - BinaryTreeNode
//Ap - Advanced Printing
//Tti - TakeTreeInput
//Ttib - TakeTreeInputBetter
import java.util.Scanner;
public class BtnUse {
//------------------------------------------------------------------------------
		//Basic Printing
	public static void Bp(Btn<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.println(root.data);
		Bp(root.left);
		Bp(root.right);
	}
//------------------------------------------------------------------------------	
	// Advanced Printing
	public static void Ap(Btn<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+": ");
		if(root.left != null) {
			System.out.print("L"+root.left.data+", ");
		}
		if(root.right != null) {
			System.out.print("R"+root.right.data);
		}
		System.out.println();
		Ap(root.left);
		Ap(root.right);
	}
//---------------------------------------------------------------------------------
//	taking tree input Tti:
	public static Btn<Integer> Tti(){
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		if(rootData == -1) {
			return null;
		}
		Btn<Integer> root = new Btn<Integer>(rootData);
		Btn<Integer> leftChild = Tti();
		Btn<Integer> rightChild = Tti();
		root.left = leftChild;
		root.right = rightChild;
		return root;
		
	}
//---------------------------------------------------------------------------------
//	taking tree input better Ttib:
	public static Btn<Integer> Ttib(boolean isRoot,int parentData,boolean isLeft){
	
	if(isRoot) {
		System.out.print("Enter the root data: ");
	}
	else if (isLeft) {
		System.out.print("Enter the "+parentData+" Left data: ");
	}
	else {
		System.out.print("Enter the "+parentData+" right data: ");
	}
	System.out.println();
	Scanner sc = new Scanner(System.in);
	int rootData = sc.nextInt();
	if(rootData == -1) {
		return null;
	}
	Btn<Integer> root = new Btn<Integer>(rootData);
	Btn<Integer> leftChild = Ttib(false,root.data,true);
	Btn<Integer> rightChild = Ttib(false,root.data,false);
	root.left = leftChild;
	root.right = rightChild;
	return root;
}
//---------------------------------------------------------------------------------
//	number of nodes in a binary tree:
	public static int numNodes(Btn<Integer> root) {
		if(root == null) {
			return 0;
		}
		int leftCount = numNodes(root.left);
		int rightCount = numNodes(root.right);
		return 1+leftCount+rightCount;
	}
//---------------------------------------------------------------------------------
//---------------------------------------------------------------------------------
//	sum of nodes in a binary tree:
	public static int sumNodes(Btn<Integer> root) {
		if(root == null) {
			return 0;
		}
		int leftSum = sumNodes(root.left);
		int rightSum = sumNodes(root.right);
		return root.data+leftSum+rightSum;
	}
//---------------------------------------------------------------------------------
//------------------------------------------------------------------------------
		//inOrder Printing
		public static void inOrder(Btn<Integer> root) {
			if(root == null) {
				return;
			}
			
			Bp(root.left);
			System.out.print(root.data);
			Bp(root.right);
		}
//------------------------------------------------------------------------------	
//------------------------------------------------------------------------------
			//preOrder Printing
			public static void preOrder(Btn<Integer> root) {
				if(root == null) {
						return;
				}
				System.out.print(root.data);
				Bp(root.left);
				Bp(root.right);
			}
//------------------------------------------------------------------------------	
//------------------------------------------------------------------------------
			//postOrder Printing
			public static void postOrder(Btn<Integer> root) {
				if(root == null) {
					return;
				}
				
				Bp(root.left);
				
				Bp(root.right);
				System.out.print(root.data);
			}
//------------------------------------------------------------------------------	
			//node with largest element Printing
			public static int largestElement(Btn<Integer> root) {
				if(root == null) {
					return Integer.MIN_VALUE;
				}
				int leftLargest = largestElement(root.left);
				int rightLargest = largestElement(root.right);
				return Math.max(root.data, Math.max(leftLargest, rightLargest));
			}
//------------------------------------------------------------------------------	
			//Binary Tree Height  Printing
			public static int height(Btn<Integer> root) {
				if(root == null) {
					return 0;
				}
				int leftheight = height(root.left);
				int rightheigth = height(root.right);
				return 1+Math.max(leftheight, rightheigth);
			}
//------------------------------------------------------------------------------	
			public static int numLeafNodes(Btn<Integer> root) {
				if(root == null) {
					return 0;
				}
				if(root.left == null && root.right == null) {
					return 1;
				}
				int leftleaf = numLeafNodes(root.left);
				int rightleaf = numLeafNodes(root.right);
				return leftleaf+rightleaf;
			}
//------------------------------------------------------------------------------	
//------------------------------------------------------------------------------	
			//k depth node element Printing
			public static void KDepth(Btn<Integer> root,int k) {
				if(root == null) {
					return;
				}
				if(k == 0) {
					System.out.print(root.data+" ");
					return;
				}
				KDepth(root.left, k-1);
				KDepth(root.right, k-1);

			}
//------------------------------------------------------------------------------	
//------------------------------------------------------------------------------	
			//k depth node element Printing
			public static Btn<Integer> removeLeafs(Btn<Integer> root) {
				if(root == null) {
					return null;
				}
				if(root.left == null && root.right == null) {
					return null;
				}
				Btn<Integer> leftRemoved = removeLeafs(root.left);
				Btn<Integer> rightRemoved = removeLeafs(root.right);
				root.left = leftRemoved;
				root.right = rightRemoved;
				return root;

			}
//------------------------------------------------------------------------------	
//------------------------------------------------------------------------------	
			//k depth node element Printing
			public static void mirror(Btn<Integer> root) {
				if(root == null) {
					return;
				}
				Btn<Integer> temp = root.left;
				root.left = root.right;
				root.right = temp;
				mirror(root.left);
				mirror(root.right);

			}
//------------------------------------------------------------------------------	
// to check whether the binary tree is balanced or not;
//	the subtraction of "height of left subtree" and "height of right subtree" must be -1 or 0 or 1
		public static boolean isBalanced(Btn<Integer> root) {
			if(root == null) {
				return true;
			}
			int lH = height(root.left);
			int rH = height(root.right);
			if(Math.abs(rH-lH)>1) {
				return false;
			}
			return isBalanced(root.left) && isBalanced(root.right);
 		}
//-------------------------------------------------------------------
		public static binaryTreeReturn isBalancedBetter(Btn<Integer> root) {
			if(root == null) {
				binaryTreeReturn ans = new binaryTreeReturn();
				ans.height = 0;
				ans.isBalanced = true;
				return ans;
			}
			binaryTreeReturn leftOutput = isBalancedBetter(root.left);
			binaryTreeReturn rightOutput = isBalancedBetter(root.right);
			binaryTreeReturn ans = new binaryTreeReturn();
			int height = 1+Math.max(leftOutput.height, rightOutput.height);
			boolean isBal = true;
			if(Math.abs(leftOutput.height-rightOutput.height)>1) {
				isBal = false;
			}
			if(!leftOutput.isBalanced || !rightOutput.isBalanced) {
				isBal = false;
			}
			ans.isBalanced = isBal;
			ans.height = height;
			return ans;
		}
//----------------------------------------------------------------------
			public static void main(String[] args) {
		
		
//		---------------
//		// three node created 
//		Btn<Integer> root = new Btn<Integer>(1);
//		Btn<Integer> leftChild = new Btn<Integer>(2);
//		Btn<Integer> rightChild = new Btn<Integer>(3);
//		// now linking them
//		root.left = leftChild;
//		root.right = rightChild;
//		// still more nodes
//		Btn<Integer> twoRight = new Btn<Integer>(4);
//		Btn<Integer> threeLeft = new Btn<Integer>(5);
//		// linking them
//		leftChild.right = twoRight;
//		rightChild.left = threeLeft;
//		---------------------------
		
		Btn<Integer> root = Ttib(true,0,true);

		// applying Basic Print Bp:
		//Bp(root);
		
		
		//applying Advanced Printing Ap:
		Ap(root);
		
		int num = numNodes(root);
		System.out.println("the number of nodes: "+num);
		int sum = sumNodes(root);
		System.out.println("the sum of nodes: "+sum);
		
//	inOrder(root);
//	System.out.println();
//	preOrder(root);
//	System.out.println();
//	postOrder(root);.
		System.out.println("largest of nide: "+largestElement(root));
		System.out.println("height of binary tree: "+height(root));
		System.out.println("number of leaf node: "+numLeafNodes(root));
		System.out.println("KDepth elements are : ");
		KDepth(root, 3);
//		System.out.println("Aftr leafs removed: ");
//		root = removeLeafs(root);
//		Ap(root);
		mirror(root);
		Ap(root);
		System.out.println(isBalanced(root));
		System.out.println(isBalancedBetter(root).isBalanced);
		
		
		

		
		
		

	}

}
