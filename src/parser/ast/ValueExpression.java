/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.ast;

import language.lib.NumberValue;
import language.lib.StringValue;
import language.lib.Value;

/**
 *
 * @author Vladimir
 */
public final class ValueExpression implements Expression{
    
    private final Value value;
    
    public ValueExpression(double value) {
        this.value = new NumberValue(value);
    }
      public ValueExpression(String value) {
        this.value = new StringValue(value);
    }

    @Override
    public Value eval() {
        return value;
    }

    @Override
    public String toString() {
        return value.asString();
    }
    
}
