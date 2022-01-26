/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genl01ex05;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class GenL01ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double media,n1,n2,n3;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a nota da P1: ");
        n1 = sc.nextInt();
        System.out.println("Digite a nota da P2: ");
        n2 = sc.nextInt();
        System.out.println("Digite a nota da P3: ");
        n3 = sc.nextInt();
        
        media = ((n1*2)+(n2*3)+(n3*5))/10;
        
        System.out.println("A media do aluno foi: "+ media);
        
    }
    
}
