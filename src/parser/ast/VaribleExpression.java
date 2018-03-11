/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.ast;

import language.lib.Value;
import language.lib.Varibales;

/**
 *
 * @author Vladimir
 */
public final class VaribleExpression implements Expression{
    private final String name;
    
    public VaribleExpression(String name) {
        this.name = name;
    }

    @Override
    public Value eval() {
        if (!Varibales.isExists(name)) throw new RuntimeException("Constant does not exists [" + name + "]" );
        return Varibales.get(name);
    }

    @Override
    public String toString() {
//        return String.format("%s [%f]", name, Constants.get(name));
        return String.format("%s", name);
    }
    
}
