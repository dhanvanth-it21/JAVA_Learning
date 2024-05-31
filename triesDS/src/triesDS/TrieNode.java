package triesDS;

public class TrieNode{
	char data;
	boolean isTerminal;
	TrieNode children[];
	int countChild;
	
	public TrieNode(char data) {
		this.data  = data;
		this.isTerminal = false;
		this.children = new TrieNode[26];
		this.countChild = 0;
	}
}
