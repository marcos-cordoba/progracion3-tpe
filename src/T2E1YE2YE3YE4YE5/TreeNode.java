package T2E1YE2YE3YE4YE5;

public class TreeNode {
	
	private Integer value;
	private String character;
	private TreeNode left;
	private TreeNode right;

	public TreeNode(Integer value) {
		this.value = value;
		this.setCharacter(null);
		this.left = null;
		this.right = null;
	}
	
	public TreeNode(Integer value, String character) {
		this.value = value;
		this.setCharacter(character);
		this.left = null;
		this.right = null;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public boolean isLeaft() {
		return this.getLeft() == null && this.getRight() == null;
	}

	public TreeNode getLeft() {
		return this.left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return this.right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}
	
	public boolean hasCharacter() {
		return this.character != null && !this.character.equals("");
	}
}
