/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genl01ex01;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class GenL01ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int anos;
        int dias;
        int meses;
        int id;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a idade em anos: ");
        anos = sc.nextInt();
        
        System.out.println("Digite a idade em meses: ");
        meses = sc.nextInt();
        
        System.out.println("Digite a idade em dias: ");
        dias = sc.nextInt();
        
        
        id =  ((anos*365) + (meses*30) + dias);
        
        System.out.println("Sua idade em dias é: "+ id + "dias");
        
        
        
    }
    
}