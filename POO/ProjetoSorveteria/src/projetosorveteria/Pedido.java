/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosorveteria;

/**
 *
 * @author marcelo
 */
public class Pedido {
    private int idSor;
    private int idAcom;
    private int idCli;
    private int idFunc;
    private int numPed;
    private int qtdSorvete;
    private int qtdAcomp;
    private double valorTot;

    public int getIdSor() {
        return idSor;
    }

    public void setIdSor(int idSor) {
        this.idSor = idSor;
    }

    public int getIdAcom() {
        return idAcom;
    }

    public void setIdAcom(int idAcom) {
        this.idAcom = idAcom;
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

    public int getQtdAcomp() {
        return qtdAcomp;
    }

    public void setQtdAcomp(int qtdAcomp) {
        this.qtdAcomp = qtdAcomp;
    }

    public double getValorTot() {
        return valorTot;
    }

    public void setValorTot(double valorTot) {
        this.valorTot = valorTot;
    }
    
    
}
