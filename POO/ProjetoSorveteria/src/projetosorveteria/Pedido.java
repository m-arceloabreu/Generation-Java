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

    public Pedido(int idSor, int idCli, int idFunc, int numPed, int qtdSorvete, double valorTot) {
        this.idSor = idSor;
        this.idCli = idCli;
        this.idFunc = idFunc;
        this.numPed = numPed;
        this.qtdSorvete = qtdSorvete;
        this.valorTot = valorTot;
    }

    public Pedido(int idCli, String nomeCliente) {
        this.idCli = idCli;
        this.nomeCliente = nomeCliente;
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
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Id do Cliente");
        idCli = sc.nextInt();
        
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade: ");
        qtdSorvete = sc.nextInt();
        this.qtdSorvete = qtdSorvete;
    }

    public double getValorTot() {
        return valorTot;
    }

    public void setValorTot(double valorTot) {
        this.valorTot = valorTot;
    }
  
    public String toString(){
    
    return "Id-Cliente: "+ nomeCliente +"\n";
    }
    

 public String nomeCli(){
        if(idCli == (cli.getId())){
        
            nomeCliente = cli.getNome();
        
        }
    return nomeCliente;
 }
    
    public void Pedidos1 (){
    List<Pedido> pedidos = new ArrayList<Pedido>();
        Pedido p1 = new Pedido(idCli,nomeCliente);
        pedidos.add(p1);
        System.out.println(p1);
    }
    
   
        
    
    
    
} 
   
 
    
    
   
   
    
    