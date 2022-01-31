/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pool01ex05;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class PooL01ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Patinete pat = new Patinete();
        Scanner sc = new Scanner(System.in);
        
        pat.marca = "SKT";
        pat.modelo = "SKTisBack";
        System.out.println("Material de fabricação:\n1- Aluminio \\n2- Ferro");
        pat.material = sc.nextInt();
        
        pat.Duracao(pat.material);
        
        
        
        
        
    }
    
}
