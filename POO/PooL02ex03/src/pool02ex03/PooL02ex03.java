/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pool02ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author marcelo
 */
public class PooL02ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ESTOQUE LOJA DE ROUPAS");
        List<String> itens = new ArrayList();    
        itens.add("Casaco de pele");
        itens.add("Jaqueta de couro");
        itens.add("Calça de couro");
        
        Collections.sort(itens);
        System.out.println(itens);
        itens.remove(0);
        itens.add(1,"Calça de flanela");
        System.out.println(itens);
    }
    
    
  
    
}
