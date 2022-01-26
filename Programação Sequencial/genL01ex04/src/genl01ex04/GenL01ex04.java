/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genl01ex04;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class GenL01ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a,b,c;
        double r,s,d;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        a = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        b = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        c = sc.nextInt();
        
         r = Math.pow((a+b),2);
         s = Math.pow((b+c),2);
         d =(r+s)/2;
         
         
        System.out.println("O resultado de R é: "+ r+ "\nO resultado de S é: "+ s +"\nO resultado de D é: "+ d);
        
    }
    
}
