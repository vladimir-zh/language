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
public class StringValue implements Value{
    
    private final String value;

    public StringValue(String value) {
        this.value = value;
    }
    
    
    
    @Override
    public double asNumber(){
        try {
            return Double.parseDouble(value);
        } catch(NumberFormatException e) {
            return 0;
        }
    }
    
   @Override
   public String asString(){
       return value;
   }

    @Override
    public String toString() {
        return asString();
    }
    
   
   
}
