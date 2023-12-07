package com.example.triangle_tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(value = Parameterized.class)
public class TriangleTypeTest {
    private Integer a, b, c;
    private String type;

    @Parameterized.Parameters
    public static Collection testDataTypeTriangle() {
        return Arrays.asList(
                new Object[][]{
                        {5, 6, 7, "Scalene"},
                        {1, 5, 5, "Isosceles"},
                        {20, 20, 20, "Equilateral"},
                        {100, 100, 200, "Generated"},
                        {50, 3, 2, null},
                        {20, 2, 0, null},
                        {-20, 2, 0, null},
                });
    }

    public TriangleTypeTest(Integer a, Integer b, Integer c, String type) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.type = type;
    }

    @Test()
    public void TriangleTest() {
        assertEquals(Triangle.checkTriangleType(a, b, c), type);
    }
}
