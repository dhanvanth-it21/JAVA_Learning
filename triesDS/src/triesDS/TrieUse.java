package triesDS;

public class TrieUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// every letter should be capital;
		Trie t = new Trie();
		t.add("DHANVANTH");
		t.add("DHAN");
		System.out.println(t.search("DHAN"));
		t.remove("DHAN");
		System.out.println(t.search("DHAN"));

	}

}
