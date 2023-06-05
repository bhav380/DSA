package Tries;

public class UseTrie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trie MyDictionary = new Trie();
		
		MyDictionary.insert("do","karo");
		
		MyDictionary.insert("dot","point");
		
		MyDictionary.insert("dont","mat karo");
		
		MyDictionary.insert("dog","kutta");
		
		MyDictionary.insert("adobe","video editor");
		
		MyDictionary.insert("apple","seb");
		
		MyDictionary.insert("ape","langur");
		
		MyDictionary.insert("ass","gas");
		
		MyDictionary.insert("ash","rakh");
		MyDictionary.insert("abs","abs");
		
		MyDictionary.insert("dean","dean");
		
		MyDictionary.insert("don","doodo noonno toto");
		
		MyDictionary.insert("gone","hjdi kkd ftr soler tt ");
		MyDictionary.insert("AbStRaCt","dkj dk t siot ");
		MyDictionary.insert("absurd","kdk g skt iooooooooooo ddd gg sokk yy ss ghhy s");
		MyDictionary.insert("abste","wrong");
		MyDictionary.insert("abstro","maha rong");
		
		System.out.println("num of words : "+MyDictionary.numWords);
		
		
		System.out.println(MyDictionary.search("adobe"));
		
		
		
		
	    MyDictionary.delete("adobe");
		MyDictionary.delete("absurd");
		MyDictionary.delete("abstract");
		MyDictionary.delete("ass");
	
		MyDictionary.delete("dean");
		
		System.out.println("num of words : "+MyDictionary.numWords);
		
		MyDictionary.search("abstract");
        MyDictionary.search("absurd");
		MyDictionary.search("abs");
		MyDictionary.search("abste");
		MyDictionary.search("adobe");
		
		
		
		
		System.out.println("num of words : "+MyDictionary.numWords);
		
		
		
		
			

	}

}
