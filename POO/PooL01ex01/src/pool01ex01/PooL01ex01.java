/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pool01ex01;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class PooL01ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Cliente cli = new Cliente();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        cli.nome = sc.next();   
        System.out.println("Digite a sua idade: ");
        cli.idade = sc.nextInt();
        System.out.println("Digite seu cpf: ");
        cli.cpf = sc.next();
        
        
        cli.getInfo();
         System.out.println(cli.getInfo());
        
        
    }
    
}
