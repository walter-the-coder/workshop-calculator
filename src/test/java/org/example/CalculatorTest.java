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
                Arguments.of(1, 2, 3),
                Arguments.of(1, 1, 2)
        );
    }

    @DisplayName("Should handle addition as expected")
    @ParameterizedTest(name = "{index} - Add({0} + {1}) = {2}")
    @MethodSource("additionDataProvider")
    public void shouldHandleAdditionAsExpected(
            double operand1,
            double operand2,
            int expectedResult
    ) {
        clickNumericButton(Integer.parseInt(String.valueOf(Math.round(operand1))));
        calculator.bAdd.doClick();
        clickNumericButton(Integer.parseInt(String.valueOf(Math.round(operand2))));
        calculator.bEquals.doClick();
        assertEquals(String.valueOf(expectedResult), calculator.output.getText());
    }

    private void clickNumericButton(int button) {
        if (button == 1) {
            calculator.b1.doClick();
        } else if (button == 2) {
            calculator.b2.doClick();
        } else if (button == 3) {
            calculator.b3.doClick();
        } else if (button == 4) {
            calculator.b4.doClick();
        } else if (button == 5) {
            calculator.b5.doClick();
        } else if (button == 6) {
            calculator.b6.doClick();
        } else if (button == 7) {
            calculator.b7.doClick();
        } else if (button == 8) {
            calculator.b8.doClick();
        } else if (button == 9) {
            calculator.b9.doClick();
        } else if (button == 0) {
            calculator.b0.doClick();
        }
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
