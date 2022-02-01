/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosorveteria;

import java.util.Scanner;



/**
 *
 * @author marcelo
 */
public class Cliente extends Pessoa{
    private int id;
    

    public Cliente(String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
