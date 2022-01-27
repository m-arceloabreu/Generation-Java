/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genl02ex06;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class GenL02ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        int cont = 0;
        int soma = 0;
        double media = 0;
        
        
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Digite um numero: ");
            num = sc.nextInt();
            
            if(num%3 == 0  &&  num!=0){
                cont++;
               soma = soma + num;
               
               media = (soma)/(cont);
            }
        
        }while(num!=0);
        System.out.println("A media do somatorio dos numeros multiplos de 3 é: ? "+ media );
           
        
    }
    
}
