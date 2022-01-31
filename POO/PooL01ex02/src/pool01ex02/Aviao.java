/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pool01ex02;

/**
 *
 * @author marcelo
 */
public class Aviao {
    
    String modelo;
    String cor;
    double velAtual;
    double velMax;


    
    
    
    
    void liga(){
    
        System.out.println("O avião está ligado!!! ");
    }
    
    void desliga(){
    
        System.out.println("O avião está desligado!!!");
   }
    public void velNova(double qtd){
       double velocNova = this.velAtual+qtd;
       this.velAtual = velocNova;
       
   
   }
}
