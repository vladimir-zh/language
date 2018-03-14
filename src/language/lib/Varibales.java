/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package language.lib;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Vladimir
 */
public class Varibales {
    private static final NumberValue ZERO = new NumberValue(0);
    private static final Map<String, Value> variables;
    
    static {
        variables = new HashMap<>();
        variables.put("PI", new NumberValue(Math.PI));
        variables.put("pi", new NumberValue(Math.PI));
        variables.put("E", new NumberValue(Math.E));
        variables.put("e", new NumberValue(Math.E));
        variables.put("GOLDEN_RATIO", new NumberValue(1.618));
        variables.put("golden_ratio", new NumberValue(1.618));
    }
    
    public static boolean isExists(String key) {
        return variables.containsKey(key);
    }
    
    public static Value get(String key) {
        if (!isExists(key)) return ZERO;
        return variables.get(key);
    }
    
    public static void set(String key, Value value) {
        variables.put(key, value);
    }
    
}
