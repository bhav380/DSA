package Tries;

public class CompressedTrieNode {
	
	String data;
	int numOfChild;
	CompressedTrieNode[] children;
	public CompressedTrieNode(String data) {
		this.data = data;
		this.children = new CompressedTrieNode[58];
	}

}
