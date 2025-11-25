package codes.com.craftinginterpreters.lox;

enum TokenType {
    // Single-character tokens.
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRECE, COMMA, DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR,
    // One or two character tokens.
    BANG, BANG_EQUAL, EQUAL, EQUAL_EQALE, GREATER, GREATER_EQUAL,LESS, LESS_EQUAL,
    // Literals
    IDENTIFIER, STRING, NUMBER,
    //Keywords
    AND, CLASS, ELSE, FALSE, FUN, FOR, IF, NIL, OR, PRINT, RETURN, SUPER, THIS,TRUE, VAR, WHILE,

    EOL
}
