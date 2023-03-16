/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.capp.exception;

/**
 *
 * @author Dell
 */
public class UserBlockedException extends Exception {
    /**
     * Creates User object without error description
     */
    public UserBlockedException() {
        
    }
    /**
     * Creates User Object with error description.
     * @param errDesc 
     */
    public UserBlockedException(String errDesc){
        super(errDesc);
    }
    
}
