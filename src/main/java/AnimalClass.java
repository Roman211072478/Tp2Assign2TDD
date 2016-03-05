/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package com.roman.tp2testdrivenassign2.java;

/**
 *
 * @author Roman
 */
public class AnimalClass {

    private String species;
    private String gender;


    public AnimalClass() {
    }

    public AnimalClass(String species, String gender) {
        this.gender = gender;
        this.species = species;

    }

    public String getSpecies() {

        return this.species;
    }


}
