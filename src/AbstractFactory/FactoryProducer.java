/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Aritmetico.FactoryAritmetico;
import Conversor.FactoryConversor;

/**
 *
 * @author uca
 */
public class FactoryProducer {
        public static AbstractFactory getFactory(String type){
        switch (type){
            case "aritmetico":
                return new FactoryAritmetico();
            case "conversor":
                return new FactoryConversor();
        }
        return null;
    }
}
