/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package language.lib;

/**
 *
 * @author Vladimir
 */
public class NumberValue implements Value{
    
    private final double value;
    
       public NumberValue(boolean value) {
        this.value = value ? 1 : 0;
    }

    public NumberValue(double value) {
        this.value = value;
    }
    
    @Override
    public double asNumber(){
        return value;
        
    }
    
    @Override
    public String asString(){
        return Double.toString(value);
    }

    @Override
    public String toString() {
        return asString();
    }
    
    
    
}
