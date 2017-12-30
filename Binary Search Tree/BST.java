public class BST {
	Node root;

	public BST() {
		root = null;
	}

	public Node insertVal(Node root, int k) {
		if (root == null) {
			Node n = new Node(k);
			root = n;
		} else if (root.value > k) {
			root.left = insertVal(root.left, k);
		} else if (root.value < k) {
			root.right = insertVal(root.right, k);
		}
		return root;
	}

	public void preorder(Node root) {
		if (root != null) {
			System.out.print(root.value + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}

	public void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.value + " ");
			inorder(root.right);
		}
	}

	public void postorder(Node root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.value + " ");
		}
	}

	public void search(Node root, int k) {
		if (root == null) {
			System.out.println("element not found");
		} else if (root.value > k) {
			search(root.left, k);
		} else if (root.value < k) {
			search(root.right, k);
		} else {
			System.out.println("Element found");
		}
	}

	public Node delete(Node root, int val) {
		if (root == null)
			return root;

		if (val < root.value) {
			root.left = delete(root.left, val);
		} else if (val > root.value) {
			root.right = delete(root.right, val);
		}

		else {

			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;
			root.value = minimum(root.right);
			root.right = delete(root.right, root.value);
		}

		return root;

	}

	public int minimum(Node root) {
		int min = root.value;
		while (root.left != null) {
			min = root.left.value;
			root = root.left;
		}
		return min;
	}

	public int maximum(Node root) {
		int max = root.value;
		while (root.right != null) {
			max = root.right.value;
			root = root.right;
		}
		return max;
	}

	public static void main(String[] args) {
		BST b = new BST();
		b.root = b.insertVal(b.root, 100);
		b.root = b.insertVal(b.root, 50);
		b.root = b.insertVal(b.root, 75);
		b.root = b.insertVal(b.root, 300);
		b.root = b.insertVal(b.root, 250);
		b.root = b.insertVal(b.root, 20);
		b.root = b.insertVal(b.root, 70);
		b.root = b.insertVal(b.root, 400);
		b.root = b.insertVal(b.root, 150);
		b.root = b.insertVal(b.root, 80);
		b.inorder(b.root);
		System.out.println("");
		b.postorder(b.root);
		System.out.println("");

		b.preorder(b.root);
		System.out.println("");

		b.search(b.root, 20);
		b.search(b.root, 25);
		b.search(b.root, 250);
		System.out.println("Minimum value:" + b.minimum(b.root));
		System.out.println("Maximum value:" + b.maximum(b.root));

		b.inorder(b.delete(b.root, 20));
		System.out.println();
		b.inorder(b.delete(b.root, 75));
		System.out.println();
		b.inorder(b.delete(b.root, 300));
		System.out.println();
		b.inorder(b.delete(b.root, 100));
	}
}
