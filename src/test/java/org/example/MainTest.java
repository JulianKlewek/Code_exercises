package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import javax.swing.tree.TreeNode;

class MainTest implements MainTestConstants {

    private final Main main = new Main();

    @ParameterizedTest
    @MethodSource("PROVIDE_VALID_DATA")
    void should_return_true_when_strict_tree(TreeNode node) {
        boolean result = main.isStrictTree(node);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @MethodSource("PROVIDE_INVALID_DATA")
    void should_return_false_when_strict_tree(TreeNode node) {
        boolean result = main.isStrictTree(node);
        Assertions.assertFalse(result);
    }
}