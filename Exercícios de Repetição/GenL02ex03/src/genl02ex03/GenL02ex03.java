/*
Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 */
package genl02ex03;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class GenL02ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int id=0 ,menor=0, maior=0;
        Scanner sc = new Scanner(System.in);
        
        while(id!= -99){
            System.out.println("Digite sua idade: ");
            id = sc.nextInt();
            
            if(id<21){
                menor++;
                System.out.println("Menor que 25: "+ menor + "\nMaior que 50: "+ maior);
            }
            if(id>50){
                maior++;
                System.out.println("Menor que 25: "+ menor + "\nMaior que 50: "+ maior);
            }
            
        }
    }
    
}
