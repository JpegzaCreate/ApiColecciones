/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;
 
public class CalseGenerica<T> {
    
    private T objeto;

    public CalseGenerica(T objeto) {
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){
            System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
    
    
}
