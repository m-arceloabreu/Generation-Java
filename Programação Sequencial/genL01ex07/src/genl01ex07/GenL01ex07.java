/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genl01ex07;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class GenL01ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,c,d,e,f,x,y;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Coeficiente A: ");
        a = sc.nextDouble();
        
        System.out.println("Coeficiente  B: ");
        b = sc.nextDouble();
        
        System.out.println("Coeficiente C: ");
        c = sc.nextDouble();
      
        System.out.println("Coeficiente D: ");
        d = sc.nextDouble();
        
        System.out.println("Coeficiente E: ");
        e = sc.nextDouble();
        
        System.out.println("Coeficiente1 F: ");
        f = sc.nextDouble();
        
        x = ((c*e)-(b*f))/((a*e)-(b*d));
        y = ((a*f)-(c*d))/((a*e)-(b*d));
        
        System.out.println("Os valores de x e y são respectivamente: \nX= "+x+"\n Y= "+y);
        
    }
    
}
