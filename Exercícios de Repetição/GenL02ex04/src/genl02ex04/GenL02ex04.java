/*
Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.
 */
package genl02ex04;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class GenL02ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sexo,idade,temp,
            pessoa =1,
            calmo = 0,
            mulnerv = 0,        
            hagre = 0,
            ocal = 0,
            pnerv = 0,
            jcal = 0;
 
        Scanner sc = new Scanner(System.in);
        
        while(pessoa <=150){
        System.out.println("Pessoa"+ pessoa + "\nDigite sua idade: ");
        idade = sc.nextInt();
        
        System.out.println("Pessoa"+ pessoa + "\nSexo digite:\n1-MASCULINO\n2-FEMININO\n3-OUTRO: ");
        sexo = sc.nextInt();
        
        System.out.println("Pessoa"+ pessoa + "\nVocê se consider:\n1-Calmo\n2-Nervoso\n3-Agressivo: ");
        temp = sc.nextInt();
        
            if(temp == 1){
                calmo++;
            }
            if(sexo ==2 && temp == 2){
              mulnerv++;
            }
            if(sexo ==1 && temp == 3){
            hagre++;
            }
            if(sexo == 3 && temp ==1){
               ocal++;
            }
            if(idade >= 40 && temp == 2){
                pnerv++;
            }
            if(idade<=18 && temp == 1){
               jcal++;
            }
        pessoa++;
        }
        System.out.println("Pessoas calmas: "+calmo+"\nMulheres Nervosas: "+mulnerv+"\nHomens Agressivos: "+hagre +"\nOutros Calmos: "+ ocal+"\nPessoas Nervosas com mais de 40 anos: "+ pnerv+ "\nCalmos com menos de 18 anos: "+jcal );
        
        
    }
   
}
