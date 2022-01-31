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
public class PooL01ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Paciente pc = new Paciente();
        
        pc.nome = "Joao";
        pc.idade = 24;
        pc.doenca = "covid";
        
        pc.interna();
        
        System.out.println("UTI PARA COVID-19\nPaciente: "+ pc.nome + "\nIdade: "+ pc.idade + "\nDoença: "+ pc.doenca+ "\nNecessita Internação: "+ pc.internacao);
    }
    
}
