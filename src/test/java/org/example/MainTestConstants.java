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

    static Stream<Arguments> PROVIDE_DATA_FOR_IS_STRICT_TREE() {
        return Stream.of(
                Arguments.of(),
                Arguments.of(),
                Arguments.of(),
                Arguments.of()
        );
    }

    static Stream<Arguments> PROVIDE_INVALID_DATA() {
        return Stream.of(
                Arguments.of(),
                Arguments.of()
        );
    }


}
