/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.ast;

/**
 *
 * @author Vladimir
 */
public class ifStatement implements Statement{
    
    private final Expression expression;
    private final Statement ifStatement, elseStatement;

    public ifStatement(Expression expression, Statement ifStatement, Statement elseStatement) {
        this.expression = expression;
        this.ifStatement = ifStatement;
        this.elseStatement = elseStatement;
    }
    
    
    
    @Override
    public void execute() {
        final double result = expression.eval().asNumber();
        if(result != 0){
            ifStatement.execute();
            
        } else if(elseStatement != null){
            elseStatement.execute();
        }
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder();
        result.append("IF").append(expression).append(' ').append(ifStatement);
        if(elseStatement != null){
            result.append("\nELSE").append(elseStatement);
        }
        return result.toString();
    }
    
    
    
}
