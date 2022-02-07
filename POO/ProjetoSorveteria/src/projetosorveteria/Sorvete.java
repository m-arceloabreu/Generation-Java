/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosorveteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class Sorvete {
    private String sabor;
    private int id;
    private double valor;
    private String marca;

    public Sorvete(String sabor, int id, double valor, String marca) {
        this.sabor = sabor;
        this.id = id;
        this.valor = valor;
        this.marca = marca;
    }

    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }  
    
    List<Sorvete> sor = new ArrayList<Sorvete>();
    
      public  void Sorvete(){
         
	
	Sorvete s1 = new Sorvete ("Chocolate", 1, 5.00, "Nestlé");
	Sorvete s2 = new Sorvete ("Morango", 2, 15, "Kibon");

	sor.add(s1);
	sor.add(s2);
	
     }
      public void inserirSorvete(){
          Scanner sc = new Scanner(System.in);
          
                      System.out.println("Digite o ID: ");
                      id = sc.nextInt();
                      System.out.println("Digite o Sabor: ");
                      sabor = sc.next();
                      System.out.println("Digite o Valor: ");
                      valor = sc.nextInt();
                      System.out.println("Digite a MARCA: ");
                      marca = sc.next();
                      
                      sor.add(new Sorvete(sabor,id,valor,marca));
                      
                      System.out.println(sor);
                }
      
      
      
    
    @Override
   public String toString(){
       return "ID-Sorvete: "+ id + " | Sabor: " + sabor + " | Marca: " + marca + " | Valor: R$ "+ valor+ "\n";
   }
}
