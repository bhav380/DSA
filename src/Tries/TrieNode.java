package Tries;

public class TrieNode {
	
	char data;
	boolean isTerminal;
	TrieNode children[];
	String meaning;
	int childCount;
	
	public TrieNode(char data) {
		this.data = data;
		children = new TrieNode[26];
	}

}
