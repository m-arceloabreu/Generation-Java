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
public class Pedido {
    private int idSor;
    private int idCli;
    private int idFunc;
    private int numPed;
    private int qtdSorvete;
    private double valorTot;
    
    
    
    String nomeCliente;
    String nomeFunc;
    String sabor;
    double valor;
    
    

    public Pedido(int idSor, int idCli, int idFunc, int numPed, int qtdSorvete, double valorTot) {
        this.idSor = idSor;
        this.idCli = idCli;
        this.idFunc = idFunc;
        this.numPed = numPed;
        this.qtdSorvete = qtdSorvete;
        this.valorTot = valorTot;
    }

    public Pedido(String nomeFunc, String nomeCliente,String sabor, double valor, int qtdSorvete,double valorTot) {
        this.nomeFunc = nomeFunc;
        this.nomeCliente = nomeCliente;
        this.sabor =  sabor;
        this.valor = valor;
        this.qtdSorvete = qtdSorvete;
        this.valorTot = valorTot;
    }
    
    

    public int getIdSor() {
        return idSor;
    }

     Cliente cli = new Cliente(0,"","","");
     
    public void setIdSor(int idSor) {
        this.idSor = idSor;
    }
    
    public int getIdCli() {
     
        return idCli;
    }

    public void setIdCli(int idCli) { 
        this.idCli = idCli;
    }

    public int getIdFunc() {
        
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Id do Funcionario");
        idFunc = sc.nextInt();
        this.idFunc = idFunc;
    }
    public int getNumPed() {
        return numPed;
    }

    public void setNumPed(int numPed) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Numero do Pedido");
        numPed = sc.nextInt();
        this.numPed = numPed;
    }

    public int getQtdSorvete() {
        
        
        return qtdSorvete;
    }

    public void setQtdSorvete(int qtdSorvete) {
        this.qtdSorvete = qtdSorvete;
    }

    public double getValorTot() {
        return valorTot;
    }

    public void setValorTot(double valorTot) {
        this.valorTot = valorTot;
    }
  
  
    

 public String nomeCli(int idCli,ArrayList<Cliente> clientes){
    
       nomeCliente = clientes.get(idCli - 1).getNome();
       
    return nomeCliente;
 }
 
    public String nomeFunc(int idFunc,ArrayList<Funcionario> funcs){
        
            nomeFunc = funcs.get(idFunc -1 ).getNome();
         
      return nomeFunc;  
    }
   
    public double Sabor (int idSor, ArrayList<Sorvete> sor){
                
            sabor = sor.get(idSor - 1).getSabor();
            valor = sor.get(idSor - 1).getValor();
    return valor;
    }
    
    
    public String toString(){
    
    return "----------PEDIDO----------\n"+"Cliente: "+ nomeCliente +"\nFuncionario: "+ nomeFunc +"\nSabor: "+sabor+" | R$: "+valor+"  | Qtd: "+qtdSorvete+"\nTotal: R$ "+valorTot+"\n";
    }
    
    
      List<Pedido> pedidos = new ArrayList<>();
      
    public void Pedidos1 (){
       
        valorTot = valor *qtdSorvete;
        
      
        pedidos.add(new Pedido(nomeFunc,nomeCliente,sabor,valor,qtdSorvete,valorTot));
      
        System.out.println(pedidos);
        
    }
    
   
        
    
    
    
} 
   
 
    
    
   
   
    
    