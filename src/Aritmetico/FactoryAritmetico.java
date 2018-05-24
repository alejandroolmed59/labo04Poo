/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetico;

import AbstractFactory.AbstractFactory;
import Conversor.conversor;


public class FactoryAritmetico implements AbstractFactory {
    @Override
    public conversor getConversor(String tipo){
        return null;
    }
    @Override
    public Aritmetico getAritmetico(String tipo){
        switch(tipo){
            case "suma":
                return new Suma();
            case "resta":
                return new Resta();
            case "multiplicacion":
                return new Multiplicacion();
            case "division":
                return new Division();
        }
        return null;
    }
}


