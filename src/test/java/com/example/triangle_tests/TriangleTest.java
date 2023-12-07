package com.example.triangle_tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(value = Parameterized.class)
public class TriangleTest {
    private Integer a, b, c;
    private boolean isTriangle;

    @Parameterized.Parameters
    public static Collection testDataIsTriangleExists() {
        return Arrays.asList(
                new Object[][]{
                        {5, 6, 7, true},
                        {1, 5, 5, true},
                        {20, 20, 20, true},
                        {100, 100, 200, true},
                        {50, 3, 2, false},
                        {20, 2, 0, false},
                        {-20, 2, 0, false},
                }
        );
    }

    public TriangleTest(Integer a, Integer b, Integer c, boolean isTriangle) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.isTriangle = isTriangle;
    }

    @Test()
    public void TriangleTest() {
        assertEquals(Triangle.checkIfTriangle(a, b, c), isTriangle);
    }

}




