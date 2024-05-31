package trees;
import java.util.ArrayList;


//structure of my node in tree
public class TreeNode<T> {
	
	T data;
	ArrayList<TreeNode<T>> children;
	
	//Initialize the instance members
	public TreeNode(T data) {
		this.data = data;
		children = new ArrayList<>();
	}

}
