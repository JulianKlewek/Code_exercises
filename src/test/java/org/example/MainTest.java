package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MainTest implements MainTestConstants {

    private final Main main = new Main();

    @ParameterizedTest
    @MethodSource("PROVIDE_DATA_FOR_NUMBER_OF_NODES")
    void should_return_number_of_nodes(TreeNode node, int expected) {
        Integer numberOfNodes = main.getNumberOfNodes(node);
        Assertions.assertEquals(expected, numberOfNodes);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_DATA_FOR_DEPTH_BINARY_TREE")
    void should_return_binary_tree_depth(TreeNode node, int expected) {
        Integer numberOfNodes = main.depthBinaryTree(node);
        Assertions.assertEquals(expected, numberOfNodes);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_DATA_FOR_IS_STRICT_TREE")
    void should_return_true_when_strict_tree(TreeNode node, boolean expected) {
        boolean result = main.isStrictTree(node);
        Assertions.assertEquals(result, expected);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_DATA_FOR_IS_PERFECT_TREE")
    void should_return_true_when_perfect_tree(TreeNode node, boolean expected) {
        boolean result = main.isPerfectTree(node);
        Assertions.assertEquals(result, expected);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_DATA_FOR_IS_COMPLETE_BINARY_TREE")
    void should_return_true_when_complete_binary_tree(TreeNode node, boolean expected) {
        boolean result = main.isCompleteTree(node);
        Assertions.assertEquals(result, expected);
    }

}