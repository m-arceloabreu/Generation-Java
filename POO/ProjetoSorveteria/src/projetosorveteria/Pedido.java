/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosorveteria;

import java.util.ArrayList;
import java.util.List;

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

    public Pedido(int idSor, int idCli, int idFunc, int numPed, int qtdSorvete, double valorTot) {
        this.idSor = idSor;
        this.idCli = idCli;
        this.idFunc = idFunc;
        this.numPed = numPed;
        this.qtdSorvete = qtdSorvete;
        this.valorTot = valorTot;
    }
    

    public int getIdSor() {
        return idSor;
    }

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
        this.idFunc = idFunc;
    }
    public int getNumPed() {
        return numPed;
    }

    public void setNumPed(int numPed) {
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
    
    Sorvete sor = new Sorvete("",0,0,"");
    
    double valor;
    
    
    public double Valor(){
    if(sor.getId() == this.idSor){
      valor = sor.getValor();
    }
    return valor;
    }
   
    
    
    
    public String toString(){
   
   return  "Numero do Pedido: "+ numPed +"ID-Cliente: "+ idCli + " | ID-Funcionario: " + idFunc +" | Id-Sorvete: "+ valor + " | Quantidade: "+ qtdSorvete + " | Valor Total: "+ valorTot + "\n";
   }
    
}