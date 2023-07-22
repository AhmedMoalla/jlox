package com.amoalla.lox;

import static com.amoalla.lox.TokenType.EOF;

public class Token {
    final TokenType type;
    final String lexeme;
    final Object literal;
    final int line;

    Token(TokenType type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    public String toString() {
        String res = type.toString();

        if (type != EOF) {
            res += "(" + lexeme + ")";
        }

        if (literal != null) {
            res += " => " + literal;
        }

        return res;
    }
}
