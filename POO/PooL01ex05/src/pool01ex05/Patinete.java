/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pool01ex05;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class Patinete {
    
    
    String modelo;
    String marca;
    int material;
    
    
    void Duracao(int material){
       if (material == 1){
           System.out.println("Marca: "+ marca+"\nModelo: "+modelo +"\nPatinete de Aluminio tem duração de 10 anos");
       }
     if(material == 2){
         System.out.println("Marca: "+ marca+"\nModelo: "+modelo +"\nPatinete de FERRO tem duração de 5 anos");
     }
        
        
        
    
    }
    
 }


