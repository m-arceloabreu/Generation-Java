/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pool01ex07;

/**
 *
 * @author marcelo
 */
public class Paciente {
    String nome;
    int idade;
    String doenca;
    Boolean internacao;
    
    
    void interna(){
        if(doenca == "covid"){
            
           internacao = true;
        
        }
        else{
            internacao = false;
        }
    
    }
}
