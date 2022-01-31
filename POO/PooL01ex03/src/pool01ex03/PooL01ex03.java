/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pool01ex03;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class PooL01ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ProdutoEletronico ele = new ProdutoEletronico();
        Scanner sc = new Scanner(System.in);
      
        ele.marca = "Honda";
        ele.modelo = "XPTO-x235453";
        ele.nome = "XPTO";
        
        System.out.println("Qual o ano de Fabricação?: ");
        int anofab = sc.nextInt();
        
        ele.liga();

        
        
        System.out.println("Me chamo "+ ele.nome +" sou do MODELO: "+ ele.modelo + " criado pela MARCA: "+ele.marca + " e tenho de idade:  " + ele.checkIdade(anofab)+ " anos");
        
        
        
    }
    
}
