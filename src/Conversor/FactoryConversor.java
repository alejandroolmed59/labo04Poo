/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

/**
 *
 * @author uca
 */
import AbstractFactory.AbstractFactory;
import Aritmetico.Aritmetico;

public class FactoryConversor implements AbstractFactory{
    @Override
    public conversor getConversor(String tipo){
        switch(tipo){
            case "binario":
                return new Binario();
        }
        return null;
    }
    @Override
    public Aritmetico getAritmetico(String tipo){
        return null;
    }
}
