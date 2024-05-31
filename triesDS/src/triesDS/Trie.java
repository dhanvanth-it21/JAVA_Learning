package triesDS;



public class Trie {
	private TrieNode root;
	///////////////Root node with Constructor////////////
	public Trie() {
		//   '\0'  -> null character
		root = new TrieNode('\0');
		// data = '\0';
		//isTerminal = false;
		//children array initialized with null character
	}
	
	
	
	//////////////////Add a TrieNode/////////////////////
	public void add(String word) {
		addHelper(root,word);
		
	}
	////////////////Add Helper///////////////////////
	private void addHelper(TrieNode root, String word) {
		// TODO Auto-generated method stub
		if(word.length() == 0) {
			root.isTerminal = true;
			return;
		}
		char ch = word.charAt(0);
		int childIndex = ch-'A';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			child = new TrieNode(ch);
			root.children[childIndex] = child;
			root.countChild++;
		}
		addHelper(child,word.substring(1));
		
	}
	
	
	
	
	//////////////////////Search/////////////////////////
	public boolean search(String word) {
		return searchHelper(root,word);
	}
	////////////////////Search Hepler////////////////////
	public boolean searchHelper(TrieNode root,String word) {
		if(word.length() == 0) {
			return root.isTerminal;
		}
		char ch = word.charAt(0);
		int childIndex = ch-'A';
		TrieNode child = root.children[childIndex];
		if(child == null) {
			return false;
		}
		return searchHelper(child,word.substring(1));
		
	}
	
	
	
	
	/////////////////////Remove//////////////////////////
	public void remove(String word) {
		removeHelper(root,word);
	}



	private void removeHelper(TrieNode root, String word) {
		// TODO Auto-generated method stub
		if(word.length() == 0) {
			root.isTerminal = false;
			return;
		}  
		char ch = word.charAt(0);
		int childIndex = ch-'A';
		TrieNode child = root.children[childIndex];
		if(child == null) return;
		removeHelper(child,word.substring(1));
		// removing the node completely
		if(!child.isTerminal && root.countChild == 0) {
			root.children[childIndex] = null;
			root.countChild--;
		}
		
	}
}
