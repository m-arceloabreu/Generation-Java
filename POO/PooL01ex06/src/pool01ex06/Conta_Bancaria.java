/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pool01ex06;

/**
 *
 * @author marcelo
 */
public class Conta_Bancaria {
    
    
    String titular;
    String cpf_titu;
    int agencia;
    int conta;
    
    
    void consulta_conta(){
        
        if(titular == "Joao"){
            System.out.println("Titular: "+ titular + "\n CPF: "+ cpf_titu + "\n Agencia: " + agencia + "\n Conta: "+ conta);
        }
        else{
            System.out.println("Conta não Encontrada");
        }
    
    
    }
}
