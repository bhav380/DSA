package Tries;

// Sample is converted to Sampo error

public class CompressedTrie {
	
	CompressedTrieNode root;
	
	public CompressedTrie() {
		root = new CompressedTrieNode("\0");
	}
	
	public void insert(String word) {
		
		for(int i=0; i<word.length(); i++) {
			helperInsert(word.substring(i),root);
		}
		
		
	}

	private void helperInsert(String word, CompressedTrieNode root) {
		// TODO Auto-generated method stub
		
		if(word.length()==0) {
			return;
		}
		
		char ch = word.charAt(0);
		
		CompressedTrieNode child = root.children[ch-65];
		//System.out.println("rec");
		
		int i;
		
		if(child==null) {
			if(root.numOfChild==0 && root.data!="\0")
			     root.data = root.data + word;
			else {
				root.children[ch-65] = new CompressedTrieNode(word);
				root.numOfChild++;
			}
			
		//	System.out.println(root.data+"mm");
			return;
		}else {
			
			String split1=null;
			String split2=null;
		
			boolean flag=false;
			for(i=1; i<word.length() && i<child.data.length(); i++) {
				ch = word.charAt(i);
				if(child.data.charAt(i)!=ch) {
					split1 = word.substring(i);
					split2 = child.data.substring(i);
					//System.out.println();
					child.data = child.data.substring(0,i);
					//root.children[ch-65] = child;
					//System.out.println();
					flag = true;
					break;
				}
			}
			
		    if(flag) {
		   
		    	CompressedTrieNode sp2 = new CompressedTrieNode(split2);
				
				for(int j=0; j<52; j++) {				
					if(child.children[j]!=null) {
						sp2.children[j] = child.children[j];
						child.children[j]=null;
					}	
				}
				sp2.numOfChild = child.numOfChild;
				
				ch = split1.charAt(0);
     			child.children[ch-65] = new CompressedTrieNode(split1);
     		//	System.out.println(child.children[ch-65].data+"2222");
     			
     			ch = split2.charAt(0);
     			
			
				child.children[ch-65] = sp2;
				child.numOfChild=2;
				
         	//	System.out.println(child.data+"child");
			//	System.out.println(child.children[ch-65].data+"111");
				return;
			
			}
			
		}
		
		helperInsert(word.substring(i),child);
		
		
	}
	
	public boolean search(String pattern) {
		return helperSearch(pattern,root);
	}

	private boolean helperSearch(String pattern, CompressedTrieNode root) {
		if(pattern.length()==0) {
			return true;
		}
		
		
		char ch = pattern.charAt(0);
		
		CompressedTrieNode child = root.children[ch-65];
		
		if(child==null) {
		//	System.out.println("hi");
			return false;
		}
		
		int i;
		boolean flag=false;
		for(i=1; i<pattern.length() && i<child.data.length(); i++) {
			
			if(child.data.charAt(i)!=pattern.charAt(i)) {
				
				flag = true;
			//	System.out.println("hello");
				break;
			}
		}
		
		if(flag) {
		//	System.out.println(i+"i");
			return false;
		}
		
	//	System.out.println("ok");
		
		return helperSearch(pattern.substring(i),child);
			
	}

}
