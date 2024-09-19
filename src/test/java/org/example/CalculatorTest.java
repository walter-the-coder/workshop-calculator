package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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
    public void shouldHandleAdditionAsExpected(int operand1, int operand2, int expectedResult) {
        calculator.b0.doClick();
        assertEquals(calculator.output.getText(), "0");
    }

    @Test
    public void subtraction() {
        fail();
    }

    @Test
    public void multiplication() {
        fail();
    }

    @Test
    public void division() {
        fail();
    }

    @Test
    public void decimals() {
        fail();
    }

    @Test
    public void clearing() {
        fail();
    }
}
