package Tries;

public class UseCompressedTrieNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompressedTrie AllPatterns = new CompressedTrie();
		
		AllPatterns.insert("Sample");
		AllPatterns.insert("Sand");
		AllPatterns.insert("Sampo");
		AllPatterns.insert("Santro");
		AllPatterns.insert("Sum");
		AllPatterns.insert("Samu");
		AllPatterns.insert("Santre");
		AllPatterns.insert("Santroddds");
		AllPatterns.insert("Sams");
		AllPatterns.insert("SantaddjjruiykyuwyjtotjyisydkfhKKKKKsSSSFTTYYidjjhurbbnnnsrydkjfdjkfkjkjcomfkjgkjgjkgkjkjgkjgkjdlkdlkdflklkgklgkgururuur");
		AllPatterns.insert("SantaddjjruiykyuwyjtotjyijhfjhngnhhkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkdddddddddddddddddddddddddddddslflkfklgkklsfklklfklfklgklkmrkjejkleklrklkjuigkrtklrkiogkllslkjkgfkjglddjgjkgksnhgmfaaakgjghgfdfjfrkBhaweshrathourATtheRatethreeEightyfhynjtmjhhjgjgjkyyeyOOYOoyrhtdkkgjjhgsfhjjkgklkgjurjrur");
		
		System.out.println(AllPatterns.search("Sample")+"xx");
		System.out.println(AllPatterns.search("ample"));
		System.out.println(AllPatterns.search("San"));
		System.out.println(AllPatterns.search("an"));
		System.out.println(AllPatterns.search("ans"));
		System.out.println(AllPatterns.search("and"));
		System.out.println(AllPatterns.search("Sand"));
		
		System.out.println(AllPatterns.search("antro"));
		System.out.println(AllPatterns.search("ntr"));
		System.out.println(AllPatterns.search("Santro"));
		System.out.println(AllPatterns.search("ampot"));
		System.out.println(AllPatterns.search("o"));
		System.out.println(AllPatterns.search("po"));
		System.out.println(AllPatterns.search("Sampo"));
		System.out.println(AllPatterns.search("rur"));
		
		
		

	}

}
