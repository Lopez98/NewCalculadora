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
public class Trigonometricas {
    double angulo;
    
    double seno(){
        return Math.sin(angulo);
    }
    
    double coseno(){
        return Math.cos(angulo);
    }
    
    double tangente(){
        return Math.tan(angulo);
    }
    
    double cosecante(){
        return 1/seno(); 
    }
    
    double secante(){
        return 1/coseno();
    }
    
    double cotangente(){
        return coseno()/seno();
    }
    
    double arcoseno(){
        return Math.asin(angulo);
    }
    
    double arcocoseno(){
        return Math.acos(angulo);
    }
    
    double arcotangente(){
        return Math.atan(angulo);
    }
}
