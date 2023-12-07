package com.example.triangle_tests;
//
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static com.example.triangle_tests.Triangle.*;

@SpringBootApplication
public class TriangleTestsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TriangleTestsApplication.class, args);
        Triangle triangle = new Triangle();
        Scanner sc = new Scanner(System.in);
        String user_answer;

        while (true) {
            System.out.println("Press any key to continue or type \"quit\" to exit.");
            System.out.println("answer: ");
            user_answer = sc.next();
            if (user_answer.equals("quit")) {
                System.out.println("Exit");
                break;
            }

            System.out.println("\nEnter 3 numbers greater than zero to test triangle. ");
            try {
                System.out.println("a: ");
                int a = sc.nextInt();
                System.out.println("b: ");
                int b = sc.nextInt();
                System.out.println("c: ");
                int c = sc.nextInt();
                if (triangle.checkIfTriangle(a, b, c)) {
                    checkTriangleType(a, b, c);
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid data was provided. " +
                        "The sides of the triangle must be an integer number greater 0.");
            }
        }
    }
}
