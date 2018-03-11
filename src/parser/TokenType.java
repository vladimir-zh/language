/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

/**
 *
 * @author Vladimir
 */
public enum TokenType {
  NUMBER,
    HEX_NUMBER,
    WORD,
    TEXT,
    
    EQ,
    EQEQ,
    
    
    PRINT,
    
    IF,
    ELSE,
    
    PLUS,
    MINUS,
    STAR,
    SLASH,
    POWER,
    
    LT,
    LTEQ,
    EXCL,
    EXCLEQ,//ОТРИЦАНИЕ
    GT,
    GTEQ,
    
    BAR,
    BARBAR,
    
    AMP,
    AMPAMP,
    
    LPAREN, // (
    RPAREN, // )
    
    EOF
}
