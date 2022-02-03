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
public class Cliente extends Pessoa{
    
    private int id;
 
    public Cliente(int id,String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
        this.id = id;
    }

 
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
     public static void Clientes()
                {
                List<Cliente> clientes = new ArrayList<Cliente>();
                Cliente c1 = new Cliente(1,"Anderson Abreu","4002-8922","Rua Almirante");
                Cliente c2 = new Cliente(2,"Fernanda Andrade","4003-8933","Alameda X");
                
              
                clientes.add(c1);
                clientes.add(c2);
               
                
                System.out.println(clientes +"\n");
    }
       
    
    
    
    public String toString(){
    
    return  "Cliente ID: "+ this.id +"| Nome: " + super.getNome() + "| Telefone: "+ super.getTelefone() + "| Endereço: "+ super.getEndereco()+"\n";
    
    }

}
