/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Estudiantes
 */
public class Calculadora {
    float numero1, numero2;
    
    float suma(){
        return numero1 + numero2;
    }
    
    float resta(){
        return numero1 - numero2;
    }
    
    float multiplicacion(){
        return numero1 * numero2;
    }
    
    float division(){
        if (numero2 != 0){
            return numero1 / numero2;
        }else{
            return 0;
        }
    }
}
