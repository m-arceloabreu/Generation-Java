/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pool01ex03;

/**
 *
 * @author marcelo
 */
public class ProdutoEletronico {
    
    String nome;
    String modelo;
    String marca;
    int anofab;
    
     void liga(){
        System.out.println("Biiip...Booop Ligaandooo...");
        
    }
     int checkIdade(int anofab){
         int idade = 2022- anofab;
         
         return idade;
         
     }
    
    
}
