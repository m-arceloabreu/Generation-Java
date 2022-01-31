/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pool01ex02;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class PooL01ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Aviao av = new Aviao();
        Scanner sc = new Scanner(System.in);
        
        av.cor = "Rosa";
        av.modelo ="Air-Bus";
        av.velMax = 500;
        av.velAtual = 250;
        
        
        System.out.println("Modelo = "+ av.modelo+"\nCor: "+av.cor+ "\nVelocidade Maxima: "+ av.velMax+" km/h\nVelocidade Atual:  "+av.velAtual+ "km/h");
        System.out.println("Acelerar  quantos km/h?");
        int qtd = sc.nextInt();
        
        av.velNova(qtd);
        System.out.println("VRUUUUUUUUUUUUM.................");
        System.out.println("Modelo = "+ av.modelo+"\nCor: "+av.cor+ "\nVelocidade Maxima: "+ av.velMax+" km/h\nVelocidade Atual:  "+av.velAtual+ "km/h");
        
        
        
        
    }
    
}
