package com.craftinginterpreters.lox;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        String source = "var x = 42; // This is a comment\nif (x < 50) print x;";
        Scanner scanner = new Scanner(source);
        List<Token> tokens = scanner.scanTokens();

        for (Token token : tokens) {
            System.out.println(token);
        }
    }
}
