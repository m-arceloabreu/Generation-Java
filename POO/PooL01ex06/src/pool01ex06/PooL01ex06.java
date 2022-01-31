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
public class PooL01ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta_Bancaria cb = new Conta_Bancaria();
        
        cb.titular = "Joao";
        cb.cpf_titu = "012345678";
        cb.agencia = 5687;
        cb.conta = 8799784;
        
        cb.consulta_conta();
        
        
        
        
    }
    
}
