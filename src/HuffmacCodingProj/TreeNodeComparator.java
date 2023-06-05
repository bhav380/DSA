package HuffmacCodingProj;
import java.util.Comparator;

public class TreeNodeComparator implements Comparator<TreeNode>{
	
	public int compare(TreeNode t1, TreeNode t2) {
        if (t1.freq > t2.freq)
            return 1;
        else if (t1.freq < t2.freq)
            return -1;
                        return 0;
        }

}
