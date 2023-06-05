package HuffmacCodingProj;
import java.util.*;

public class HuffmanCoding {
	
	private BinaryData_Decoding storage;
	
	
	public HuffmanCoding() {
		storage = new BinaryData_Decoding();
	}
	
	private HashMap<Character,Integer> setFrequency(String data){
		
		HashMap<Character,Integer> freq = new HashMap<Character,Integer>();
		
		for(int i=0; i<data.length(); i++) {
			
			char ch = data.charAt(i);
			
			if(freq.containsKey(ch)) {
				freq.put(ch,freq.get(ch)+1);	
			}else {
				freq.put(ch,1);
			}
		}
		
		return freq;
		
	}
	
	
	private TreeNode createHuffmanTree(HashMap<Character,Integer> freq) {
		
		
		Set<Character> keys = freq.keySet();
		
		PriorityQueue<TreeNode> minPq = new PriorityQueue<>(keys.size(),new TreeNodeComparator());
		
		
		for(Character key : keys) {
			
			
			TreeNode node = new TreeNode(freq.get(key),key);
			minPq.add(node);
		}
		
		TreeNode dummy=null; 
		
		
		while(!minPq.isEmpty()) {
			
			TreeNode firstMin = minPq.remove();
			TreeNode secondMin = minPq.remove();
			
			dummy = new TreeNode(firstMin.freq+secondMin.freq,'\0');
			
			dummy.left = firstMin;
			dummy.right = secondMin;
			
			if(!minPq.isEmpty())
				minPq.add(dummy);
		}
		
		return dummy;
	}
	
	private void compress(TreeNode root,HashMap<Character,BitSet> compress,String code) {
		
		
		if(root.left==null && root.right==null) {
			
			
			int len = code.length();

			BitSet bitCode = new BitSet(len+1);
			bitCode.set(len);
			
			for(int i=code.length()-1; i>=0; i--) {
				char bit = code.charAt(i);	
				
				if(bit=='1') {	
					bitCode.set(len-i-1);	
     			}
			}
			
			//System.out.println(code);
			
			compress.put(root.data,bitCode);
			return;
		}
		
		compress(root.left,compress,code+"0");
		compress(root.right,compress,code+"1");	
	}
	
	private void printTree(TreeNode root) {
		if(root==null)
			return;
		
		System.out.println(root.data+" : "+root.freq);
		printTree(root.left);
		printTree(root.right);
	}
	
	public void insert(String data) {
		
		
		
		HashMap<Character,Integer> freq = setFrequency(data);
		TreeNode root = createHuffmanTree(freq);
		
			
		HashMap<Character,BitSet> compressedCodes = new HashMap<>();
		
		compress(root,compressedCodes,"");
		
		int bitCount =0;
		
		Set<Character> keys = compressedCodes.keySet();
		
		for(Character key : keys) {
		  bitCount += (freq.get(key) * (compressedCodes.get(key).length()-1));
		}
		

		BitSet compressedData = new BitSet(bitCount+1);
		
		System.out.println("Bits used : "+ bitCount);
		
		
		
		compressedData.set(bitCount);
		int pos = 0;
		
		for(int j=data.length()-1; j>=0; j--) {
			
			BitSet code = compressedCodes.get(data.charAt(j));	
				
			for(int i=0; i<code.length()-1; i++) {
					if(code.get(i)) {
						compressedData.set(pos);
					}
					pos++;
				}
		}
		
		storage.compressedDataCodes.add(compressedData);
			
		addDecryptingData(compressedCodes);		
		
	
		printDataCode(storage.compressedDataCodes.size()-1);
	}
	
	private void addDecryptingData(HashMap<Character, BitSet> mapCode) {
		
		Set<Character> keys = mapCode.keySet();
		HashMap<BitSet,Character> decrypt = new HashMap<>();
		
		for(Character key : keys) {
			decrypt.put(mapCode.get(key),key);
		}
		storage.decrypt.add(decrypt);
	}
	
	private void leftShift(BitSet binary) {
		
		int len = binary.length();
		for(int i=len ; i>=1; i--) {
			if(binary.get(i-1)) {
				binary.set(i);
				binary.flip(i-1);
			}
		}
	}
	
	public void getData(int index) {
		
		BitSet encryptedData = storage.compressedDataCodes.get(index);
		HashMap<BitSet,Character> decryptMap = storage.decrypt.get(index);
		
		printDecryptionMap(index);
		
		
		
		
		
		String decryptedData = new String("");
		BitSet keyCode = new BitSet();
		keyCode.set(0);
		
		for(int i=encryptedData.length()-2; i>=0; i--) {
			
			leftShift(keyCode);
			
			if(encryptedData.get(i)) {
				keyCode.set(0);	
			}
			
			if(decryptMap.containsKey(keyCode)) {
				
				decryptedData+= decryptMap.get(keyCode);
				keyCode.clear(0,keyCode.length());
				keyCode.set(0);
			}
		}
		
		System.out.println(decryptedData);
		System.out.println("actual size : "+ (decryptedData.length()*4));
		
	}
	
	private void printDecryptionMap(int index) {
		HashMap<BitSet,Character> map = storage.decrypt.get(index);
		
		Set<BitSet> keys = map.keySet();
		for(BitSet key : keys) {
			
			printBitSet(key);
			System.out.println(" : " + map.get(key));
			
			
		}
		
		System.out.println();
	}
	
	
	private void printBitSet(BitSet binary) {
		
        for(int i=binary.length()-2; i>=0; i--) {
			
			if(binary.get(i)) {
				System.out.print("1");
			}else {
				System.out.print("0");
			}
			
		}
		
		
	}

	private void printDataCode(int index) {		
		BitSet binary = storage.compressedDataCodes.get(index);
		printBitSet(binary);
		System.out.println();

	}
	
	public void deleteData(int index) throws  IndexNotFoundException {
		
		if(index<0 || index>= storage.compressedDataCodes.size()) {
			throw new IndexNotFoundException();
		}
		storage.compressedDataCodes.remove(index);
		storage.decrypt.remove(index);
	}
	
	

}