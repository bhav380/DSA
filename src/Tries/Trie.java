package Tries;

public class Trie {
	
	private TrieNode dictionary;
	int numWords;
	
	public Trie() {
		this.dictionary = new TrieNode('\0');
	}
	
	public void insertRec(String word) {
		helperInsertRec(dictionary,word);
	}
	
	private void helperInsertRec(TrieNode tmp, String word) {
		// TODO Auto-generated method stub
		
		if(word.length()==0) {
			tmp.isTerminal=true;
			numWords++;
		}
		
		char ch = Character.toUpperCase(word.charAt(0));
		TrieNode child = tmp.children[ch-65];
		
		if(child==null) {
			child = new TrieNode(ch);
			tmp.childCount++;
			tmp.children[ch-65] = child;
		}
		
		helperInsertRec(child,word.substring(1));
		
	}

	public void insert(String word,String meaning) {
		
		TrieNode tmp = dictionary;
		
		int i;
		int n= word.length();
		for(i=0; i<n; i++) {
			
			char ch = Character.toUpperCase(word.charAt(i));
			
			if(tmp.children[ch-65]!=null && tmp.children[ch-65].data == ch) {
				tmp = tmp.children[ch-65];
			}else{
				tmp.children[ch-65] = new TrieNode(ch);
				tmp.childCount++;
				tmp = tmp.children[ch-65];
				i++;
				break;
			}
			
		}
		
		
		while(i<n) {
			char ch = Character.toUpperCase(word.charAt(i));
			tmp.children[ch-65] = new TrieNode(ch); 
			tmp.childCount++;
			tmp = tmp.children[ch-65];
			i++;
		}
		
		if(!tmp.isTerminal) {
			tmp.isTerminal=true;
			numWords++;
		}
		
		tmp.meaning= new String(meaning);
	}
	
	public boolean recSearch(String word) {
		return helperRecSearch(dictionary,word);
	}
	
	
	private boolean helperRecSearch(TrieNode root, String word) {
		if(root==null){
			return false;
		}
		if(word.length()==0){
			
			if(root.isTerminal) {	
				System.out.println(word +" : "+root.meaning);	
			}
			return root.isTerminal;
		}
		char ch = Character.toUpperCase(word.charAt(0));
		TrieNode child = root.children[word.charAt(0)-'A'];

		return helperRecSearch(child,word.substring(1));
		
	}

	public boolean search(String word) {
		
		TrieNode tmp = dictionary;
		int n= word.length();
		
		for(int i=0; i<n; i++) {
			char ch = Character.toUpperCase(word.charAt(i));
			
			if(tmp.children[ch-65]==null || tmp.children[ch-65].data != ch) {
				return false;
			}else {
				tmp = tmp.children[ch-65];
			}
		}
		
		if(tmp.isTerminal) {
			System.out.println(word +" : "+tmp.meaning);	
		}	
		return tmp.isTerminal;
		
	}
	
	
	
	
	
	public void delete(String word) {
		
		helperDeleteBetter(word,dictionary);
	}
	
	private boolean deleteTrieNode(TrieNode tmp) {
		
		if(tmp.isTerminal) {
			return false;
		}
		
		int i;
		for(i = 0; i< 26; i++) {
			if(tmp.children[i]!=null) {
				break;
			}
		}
		
		if(i==26) {
			return true;
		}
		
		return false;
		
	}
	
	private void helperDelete2nd(String word,TrieNode tmp) {
		
		if(word.length()==0) {
			if(tmp.isTerminal) {
				tmp.isTerminal = false;
				numWords--;
			}
//			numWords--;
			return;
		}
		
		char ch = Character.toUpperCase(word.charAt(0));
		
		TrieNode child = tmp.children[ch-'A'];
		if(child==null) {
			return ;
		}
		
		helperDelete2nd(word.substring(1),child);
		
		if(!child.isTerminal && child.childCount==0) {
			tmp.children[ch-'A'] = null;
			tmp.childCount--;
		}
	}
	
	
	private boolean helperDeleteBetter(String word,TrieNode tmp) {
		
		
		if(tmp==null){
			return false;
		}
		
		if(word.length()==0) {
			
			
			if(tmp.isTerminal) {
				tmp.isTerminal=false;
				tmp.meaning = null;
				numWords--;
			}
			
			return deleteTrieNode(tmp);
		}
		
	   char ch = Character.toUpperCase(word.charAt(0));
		
		boolean canDeleteChild = helperDeleteBetter(word.substring(1),tmp.children[ch-65]);
		
		if(canDeleteChild) {
			
			tmp.children[ch-65] = null;
			tmp.childCount--;
			return deleteTrieNode(tmp);
		}
		
		return false;
				
				
		
	}

//	private boolean helperDelete(String word, TrieNode tmp) {
//		
//		char ch = Character.toUpperCase(word.charAt(0));
//		
//		
//		if(tmp.children[ch-65]==null || ch !=tmp.children[ch-65].data) {
//			return false;
//		}
//		
//		if(word.length()==1) {
//			
//			if(tmp.children[ch-65].isTerminal) {
//				tmp.children[ch-65].isTerminal = false;
//				tmp.children[ch-65].meaning = null;
//				
//				int i;
//				TrieNode child = tmp.children[ch-65];
//				for(i = 0; i< 26; i++) {
//					if(child.children[i]!=null) {
//						break;
//					}
//				}
//				
//				if(i==26) {
//					tmp.children[ch-65] = null;
//					return true;
//				}	
//				
//			}
//			
//			return false;
//		}
//		
//		boolean wordDeleted = helperDelete(word.substring(1),tmp.children[ch-65]);
//		
//		
//		
//		if(wordDeleted && !tmp.children[ch-65].isTerminal) {
//			
//			int i;		
//			TrieNode child = tmp.children[ch-65];
//			
//			for(i = 0; i< 26; i++) {
//				if(child.children[i]!=null) {
//					break;
//				}
//			}
//			
//			if(i==26) {
//				tmp.children[ch-65] = null;
//				
//				return true;
//			}	
//		}
//		
//		return false;
//				
//				
//
//	}

}
