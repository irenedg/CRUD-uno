/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.iad.crud;

/**
 *
 * @author irene
 */
public class ConfermaEvent implements Event {

    private boolean valido;

    public ConfermaEvent(boolean valido) {
        this.valido = valido;
    }

    public boolean isValido() {
        return valido;
    }
    
}
