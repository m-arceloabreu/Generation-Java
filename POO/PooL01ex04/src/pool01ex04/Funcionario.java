/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pool01ex04;

/**
 *
 * @author marcelo
 */
public class Funcionario {
    
    String nome;
    String area;
    int idade;
    boolean atual = false;
   
    

    
    Boolean funcAtual(int idade){
        
        if(idade <=65 ){
        atual = true;
        }
     return atual;
    }
           
    
}
