/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genl02ex05;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class GenL02ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, soma= 0;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Digite um numero(0 para exibir o resultado da soma): ");
            num = sc.nextInt();
            
            soma = soma + num;
            
        
        }while(num!=0);
        System.out.println("Soma: " + soma);
    }
    
}
