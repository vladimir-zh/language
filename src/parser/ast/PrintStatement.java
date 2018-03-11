/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.ast;

import javax.sound.midi.SysexMessage;

/**
 *
 * @author Vladimir
 */
public final class PrintStatement implements Statement{
    
    private final Expression expression;
    
    public PrintStatement(Expression expression){
        this.expression = expression;
    }

    @Override
    public void execute() {
        System.out.print(expression.eval());
        //System.out.println();
    }

    @Override
    public String toString() {
        return "PRINT" + " " + expression;
    }
    
    
}
