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
public class AssighmentStatement implements Statement{

    private final String variable;
    private final Expression expression;

    public AssighmentStatement(String variable, Expression expression) {
        this.variable = variable;
        this.expression = expression;
    }
    
    @Override
    public void execute() {
        final Value result = expression.eval();
        Varibales.set(variable, result);
    }

    @Override
    public String toString() {
        return String.format("%s = %s", variable, expression);
    }
}
