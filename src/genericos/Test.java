/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author javip
 */
public class Test {

    
    public static void main(String[] args) {
        
        CalseGenerica<Integer> objInt = new CalseGenerica(15);
        objInt.obtenerTipo();
        
        CalseGenerica<String> objString = new CalseGenerica("Santiago");
        objString.obtenerTipo();
        
    }
}
