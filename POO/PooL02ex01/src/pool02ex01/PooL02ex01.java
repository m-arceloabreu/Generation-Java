/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pool02ex01;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class PooL02ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Cachorro doggo = new Cachorro();
        doggo.setNome("Jorge");
        doggo.setIdade(15);
        
        System.out.println("Cavalo\nNome: "+doggo.getNome() +"\nIdade: "+doggo.getIdade());
        doggo.som();
        doggo.correr();
        
        Cavalo calvo = new Cavalo();
        
        calvo.setNome("Pé de Pano");
        calvo.setIdade(2);
        calvo.som();
        calvo.correr();
        System.out.println("Preguiça\nNome: "+calvo.getNome() +"\nIdade: "+calvo.getIdade());
        
        Preguica pregui = new Preguica();
        pregui.setNome("Soneca");
        pregui.setIdade(8);
        pregui.subir();
        pregui.som();
        
        System.out.println("Cachorro\nNome: "+pregui.getNome() +"\nIdade: "+pregui.getIdade());
        
        
        
        
        
        
        
    }
    
}
