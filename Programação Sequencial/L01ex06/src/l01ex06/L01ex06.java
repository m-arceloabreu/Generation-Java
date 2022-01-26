/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l01ex06;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class L01ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double x1,y1,x2,y2,d,d2,d3;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ponto x1: ");
        x1 = sc.nextDouble();
        
        System.out.println("Ponto y1: ");
        y1 = sc.nextDouble();
        
        System.out.println("Ponto x2: ");
        x2 = sc.nextDouble();
      
        System.out.println("Ponto y1: ");
        y2 = sc.nextDouble();
        
        d2 = Math.pow (x2-x1,2);
        d3 = Math.pow (y2-y1,2);
        d = Math.sqrt(d3+d2);
        
        
        System.out.println("A distancia entre os dois pontos é: "+ d);
       
    }
    
}
