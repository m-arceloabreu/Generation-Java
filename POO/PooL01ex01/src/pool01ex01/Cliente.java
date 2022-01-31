/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pool01ex01;

/**
 *
 * @author marcelo
 */
public class Cliente {
    
    String nome;
    int idade;
    String cpf;
    
    
    public void Cliente(String nome1, int idade1,String cpf1){
       
        nome = nome1;
        idade = idade1;
        cpf = cpf1;
        
    
    }
    
    public String getInfo(){
        
        String info = "Nome: "+ nome + "\nIdade: "+ idade + "\nCpf: "+ cpf;
       
        
        return info;
    
    }
    
}
