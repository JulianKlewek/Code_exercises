package org.example;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public interface MainTestConstants {

    static Stream<Arguments> PROVIDE_DATA_FOR_NUMBER_OF_NODES() {
        return Stream.of(
                Arguments.of(new TreeNode(), 1),
                Arguments.of(new TreeNode(new TreeNode(),null), 2),
                Arguments.of(new TreeNode(new TreeNode(),new TreeNode()), 3),
                Arguments.of(new TreeNode(new TreeNode(new TreeNode(), null),new TreeNode()), 4)
        );
    }

    static Stream<Arguments> PROVIDE_DATA_FOR_DEPTH_BINARY_TREE() {
        return Stream.of(
                Arguments.of(new TreeNode(), 1),
                Arguments.of(new TreeNode(new TreeNode(),null), 2),
                Arguments.of(new TreeNode(new TreeNode(),new TreeNode()), 2),
                Arguments.of(new TreeNode(new TreeNode(new TreeNode(), null),new TreeNode()), 3)
        );
    }

    static Stream<Arguments> PROVIDE_DATA_FOR_IS_STRICT_TREE() {
        return Stream.of(
                Arguments.of(new TreeNode(), true),
                Arguments.of(new TreeNode(new TreeNode(),null), false),
                Arguments.of(new TreeNode(new TreeNode(),new TreeNode()), true),
                Arguments.of(new TreeNode(new TreeNode(new TreeNode(), null),new TreeNode()), false),
                Arguments.of(new TreeNode(new TreeNode(new TreeNode(), new TreeNode()),new TreeNode()), true)
        );
    }

    static Stream<Arguments> PROVIDE_DATA_FOR_IS_PERFECT_TREE() {
        return Stream.of(
                Arguments.of(new TreeNode(), true),
                Arguments.of(new TreeNode(new TreeNode(),null), false),
                Arguments.of(new TreeNode(new TreeNode(),new TreeNode()), true),
                Arguments.of(new TreeNode(new TreeNode(new TreeNode(), null),new TreeNode()), false),
                Arguments.of(new TreeNode(new TreeNode(new TreeNode(), new TreeNode()),new TreeNode()), false)
        );
    }


}
