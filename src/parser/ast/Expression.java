/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.ast;

import language.lib.Value;

/**
 *
 * @author Vladimir
 */
public interface Expression {
    Value eval();
    
}
