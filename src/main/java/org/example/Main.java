package org.example;


public class Main {
    public static void main(String[] args) {
        //default impl
    }

    //region exercise 1
    public Integer getNumberOfNodes(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return 1 + getNumberOfNodes(node.left()) + getNumberOfNodes(node.right());
    }
    //endregion

    //region exercise 2

    public Integer depthBinaryTree(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return 1 + Math.max(depthBinaryTree(node.left()), depthBinaryTree(node.right()));
    }
    //endregion

    //region exercise 3
    public boolean isStrictTree(TreeNode node) {
        if (node == null) {
            return true;
        }
        if ((node.left() == null && node.right() != null) || (node.left() != null && node.right() == null)) {
            return false;
        }

        return isStrictTree(node.left()) && isStrictTree(node.right());
    }

    //endregion

    //region exercise 4
    public Boolean isPerfectTree(TreeNode node) {
        int treeDepth = perfectTreeDepth(node);

        return isPerfectTree(node, 1, treeDepth);
    }

    public Boolean isPerfectTree(TreeNode node, int currentDepth, int treeDepth){
        //last level nodes
        if(currentDepth == treeDepth && (node.left() == null && node.right() == null)){
            return true;
        }

        //inner level nodes
        if(node.left() != null && node.right() != null){
            return isPerfectTree(node.left(), currentDepth + 1, treeDepth) &&
                    isPerfectTree(node.right(), currentDepth + 1, treeDepth);
        }

        return false;
    }

    private int perfectTreeDepth(TreeNode node){
        return node.left() != null ? 1 + perfectTreeDepth(node.left()) : 1;
    }
    //endregion

    //region exercise 5
    public Boolean isCompleteTree(TreeNode node){

        // ZROBIĆ TO ZADANIE, \/ NA TEJ STRONIE CHYBA JEST BŁĄD W WYNIKU
        // https://code-exercises.com/programming/hard/27/complete-binary-tree-check
        // \/ TO MOZE BYĆ POMOCNE
        // https://www.geeksforgeeks.org/complete-binary-tree/
        return false;
    }
    //endregion
}