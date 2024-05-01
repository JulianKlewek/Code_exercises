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
    public boolean isStrictTree(TreeNode node){
//        node.left()
        return false;
    }

    //endregion
}