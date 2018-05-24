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
public class Binario implements conversor{
    @Override
    public int operar(int a){
        int digito=0,exp=0,binario=0;
        
        while(a!=0){
           digito=a%2;
           binario+=digito*Math.pow(10,exp);
           exp++;
           a= a/2;
        }
        return binario;
    }
}
