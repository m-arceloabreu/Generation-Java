/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genl02ex02;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class GenL02ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        int num,par=0,impar=0,cont;
        
        
        for(cont =0;cont<10;cont++){
            System.out.println("Digite um numero: ");
            num = sc.nextInt();
            
            if(num%2 == 0){
                par++;
            }
            else{
            impar++;
            }
        }
        System.out.println("Pares: "+ par + "\nImpar: "+ impar);
        
    }
    
}
