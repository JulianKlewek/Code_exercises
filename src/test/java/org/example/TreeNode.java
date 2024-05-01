package org.example;

public class TreeNode {
    private TreeNode left;
    private TreeNode right;

    public TreeNode() {
    }

    public TreeNode(TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
    }

    public TreeNode left() {
        return left;
    }

    public TreeNode right() {
        return right;
    }

    @Override
    public String toString() {
        return toStringNode("N", this);
    }

    private String toStringNode(String parentName, TreeNode node) {
        String strNode = "";
        if (node != null) {
            strNode += parentName;
            if (node.left != null || node.right != null) {
                strNode += "(" + toStringNode(parentName + "1", node.left) + "," +
                        toStringNode(parentName + "2", node.right) + ")";
            }
        }
        return strNode;
    }

}
