/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genl01ex03;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class GenL01ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int tempo,hora,min,seg;
    
    Scanner sc = new Scanner(System.in);
    
        System.out.println("Digite o tempo do evento em segundos: ");
        tempo = sc.nextInt();
        
        hora = tempo/3600;
	min = (tempo -(3600*hora))/60;
	seg = (tempo -(3600*hora))%60;
        
        System.out.println("O tempo: "+ tempo +" segundos, é expresso em: \n Horas: "+hora+"\nMinutos: "+ min+"\nSegundos: " + seg);
    
    
    }
    
}
