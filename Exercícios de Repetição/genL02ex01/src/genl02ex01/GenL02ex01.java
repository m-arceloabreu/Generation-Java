/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genl02ex01;

/**
 *
 * @author marcelo
 */
public class GenL02ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        
        System.out.println("OS numeros, que divididos por 11 o resto é 5 é: ");
        for (i=1000; i<=1999;i++){
            
            
            if(i%11==5){
                System.out.println("\nN: "+ i);           
            }
 
        
        }
    }
    
}
