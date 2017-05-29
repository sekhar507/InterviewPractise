/**
 * 
 */
package oh.first;

/**
 * TreeNode.java
 * 
 * @author HimaTeja
 *
 * 
 */
class TreeNode {

	char data;
	TreeNode left, right;

	TreeNode(char item) {
		data = item;
		left = right = null;
	}
}

class Passing {

	int i;
	int m = 0;
	int n = 0;
}

class BinaryTree {

	static TreeNode root;
	Passing p = new Passing();

	String strstr(String haystack, String needle) {
		if (haystack == null || needle == null) {
			return null;
		}
		int hLength = haystack.length();
		int nLength = needle.length();
		if (hLength < nLength) {
			return null;
		}
		if (nLength == 0) {
			return haystack;
		}
		for (int i = 0; i <= hLength - nLength; i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				int j = 0;
				for (; j < nLength; j++) {
					if (haystack.charAt(i + j) != needle.charAt(j)) {
						break;
					}
				}
				if (j == nLength) {
					return haystack.substring(i);
				}
			}
		}
		return null;
	}

	void storeInorder(TreeNode TreeNode, char arr[], Passing i) {
		if (TreeNode == null) {
			arr[i.i++] = '$';
			return;
		}
		storeInorder(TreeNode.left, arr, i);
		arr[i.i++] = TreeNode.data;
		storeInorder(TreeNode.right, arr, i);
	}

	void storePreOrder(TreeNode TreeNode, char arr[], Passing i) {
		if (TreeNode == null) {
			arr[i.i++] = '$';
			return;
		}
		arr[i.i++] = TreeNode.data;
		storePreOrder(TreeNode.left, arr, i);
		storePreOrder(TreeNode.right, arr, i);
	}

	boolean isSubtree(TreeNode T, TreeNode S) {

		if (S == null) {
			return true;
		}
		if (T == null) {
			return false;
		}

		char inT[] = new char[100];
		String op1 = String.valueOf(inT);
		char inS[] = new char[100];
		String op2 = String.valueOf(inS);
		storeInorder(T, inT, p);
		storeInorder(S, inS, p);
		inT[p.m] = '\0';
		inS[p.m] = '\0';

		if (strstr(op1, op2) != null) {
			return false;
		}

		p.m = 0;
		p.n = 0;
		char preT[] = new char[100];
		char preS[] = new char[100];
		String op3 = String.valueOf(preT);
		String op4 = String.valueOf(preS);
		storePreOrder(T, preT, p);
		storePreOrder(S, preS, p);
		preT[p.m] = '\0';
		preS[p.n] = '\0';

		return (strstr(op3, op4) != null);
	}

	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		TreeNode T = new TreeNode('z');
		T.left = new TreeNode('x');
		T.right = new TreeNode('e');
		T.left.left = new TreeNode('a');
		T.left.left.right = new TreeNode('c');
		T.left.right = new TreeNode('b');
		T.right.right = new TreeNode('k');

		TreeNode S = new TreeNode('x');
		S.left = new TreeNode('a');
		S.right = new TreeNode('b');
		S.left.right = new TreeNode('c');

		if (tree.isSubtree(T, S)) {
			System.out.println("Yes , S is a subtree of T");
		} else {
			System.out.println("No, S is not a subtree of T");
		}
	}
}
