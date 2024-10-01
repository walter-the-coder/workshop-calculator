package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    static Stream<Arguments> additionDataProvider() {
        return Stream.of(
                Arguments.of(1, 2, 3)
        );
    }

    @DisplayName("Should handle addition as expected")
    @ParameterizedTest(name = "{index} - Add({0} + {1}) = {2}")
    @MethodSource("additionDataProvider")
    public void shouldHandleAdditionAsExpected(
            double operand1,
            double operand2,
            double expectedResult
    ) {
        assertEquals(String.valueOf(expectedResult), calculator.output.getText());
    }

//    @Test
//    public void shouldHandleSubtractionAsExpected() {
//        fail();
//    }
//
//    @Test
//    public void shouldHandleMultiplicationAsExpected() {
//        fail();
//    }
//
//    @Test
//    public void shouldHandleDivisionAsExpected() {
//        fail();
//    }
//
//    @Test
//    public void decimals() {
//        fail();
//    }
//
//    @Test
//    public void clearing() {
//        fail();
//    }
}
