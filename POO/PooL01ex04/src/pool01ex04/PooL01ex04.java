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
public class PooL01ex04 {

    /**
     * @param args the command line arguments
     * 
     */
 
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Funcionario func = new Funcionario();

        func.nome = "Jose";
        func.area = "TI";
        func.idade =19;
        
        func.funcAtual(func.idade);
        
        System.out.println("\nNome: "+ func.nome + "\nIdade: "+ func.idade + "\nSetor: "+ func.area + "\nTrabalha atualmente: "+ func.funcAtual(func.idade) );
        
    }
    
}
