/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.roman.tp2testdrivenassign2.java;

/**
 *
 * @author Roman
 */
public class PersonClass {

    private String firstName;
    private String lastName;
    private boolean over21;
    
    public PersonClass() {
    }
    
    public PersonClass(String firstName,String lastName,boolean over21) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.over21 = over21;
    }
    
    public PersonClass(boolean over21) {
        
        this.over21 = over21;
    }
    //getters
    public String getFN()
    {
        return this.firstName;
    }
    public String getLN()
    {
        return this.lastName;
        
    }
    public boolean isOfAge()
    {
        return this.over21;
    }
}
