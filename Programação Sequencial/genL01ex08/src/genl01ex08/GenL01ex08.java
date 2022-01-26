/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genl01ex08;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class GenL01ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double custo_fab,impostos, porcent, vf;
        
          Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o custo de fabrica :R$  ");
        custo_fab = sc.nextDouble();
        
                porcent = custo_fab*0.28;
		impostos = custo_fab*0.45;
		vf = custo_fab + porcent + impostos;
                
        System.out.println("Valor Final ao consumidor: R$ "+ vf);
                
    }
    
}
