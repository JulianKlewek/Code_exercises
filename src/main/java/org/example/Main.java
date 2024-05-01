package org.example;


public class Main {
    public static void main(String[] args) {
        //default impl
    }

    //region exercise 1
    public Integer getNumberOfNodes(TreeNode node) {
        if(node == null){
            return 0;
        }

        return 1 + getNumberOfNodes(node.left()) + getNumberOfNodes(node.right());
    }
    //endregion

    //region exercise 2

    public Integer depthBinaryTree(TreeNode node) {
        if(node == null){
            return 0;
        }

        return 1 + Math.max(depthBinaryTree(node.left()), depthBinaryTree(node.right()));
    }
    //endregion

    //region exercise 3
    public boolean isStrictTree(TreeNode node){
        if (node == null){
            return true;
        }
        if((node.left() == null && node.right() != null) || (node.left() != null && node.right() == null)){
            return false;
        }

        return isStrictTree(node.left()) && isStrictTree(node.right());
    }

    //endregion
}