/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genl01ex02;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class GenL01ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        int dias,meses,anos,dias_sobrando;
        
        System.out.println("Digite o numero de dias da sua idade: ");
        dias = sc.nextInt();
        
                anos = dias/365;
		meses = (dias- (365*anos))/30;
		dias_sobrando = (dias- (365*anos))%30;
        
        System.out.println("Anos: "+anos+"\nMeses: "+meses+"\nDias: "+dias_sobrando);
    }
    
}
