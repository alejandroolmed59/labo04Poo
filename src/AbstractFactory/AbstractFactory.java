/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author uca
 */
import Aritmetico.Aritmetico;
import Conversor.conversor;

public interface AbstractFactory {
    Aritmetico getAritmetico(String tipo);
    conversor getConversor(String tipo);
}
