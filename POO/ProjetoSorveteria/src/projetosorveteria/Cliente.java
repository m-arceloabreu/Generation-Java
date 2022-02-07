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
    List<Cliente> clientes = new ArrayList<Cliente>();
    
     public  void Clientes()
                {
                Cliente c3 = new Cliente(3,"Vitor Pinheiro","4004-8944","Alameda dos Clientes");
                Cliente c1 = new Cliente(1,"Anderson Abreu","4002-8922","Rua Almirante");
                Cliente c2 = new Cliente(2,"Fernanda Andrade","4003-8933","Alameda X");
                clientes.add(c1);
                clientes.add(c2);
                clientes.add(c3);
                
    }
     
     public void inserirCliente(){
                      Scanner sc = new Scanner(System.in);
                   
                      System.out.println("Digite o ID: ");
                      id = sc.nextInt();
                      System.out.println("Digite o NOME: ");
                      super.setNome(sc.next());
                      System.out.println("Digite o TELEFONE: ");
                      super.setTelefone(sc.next());
                      System.out.println("Digite o ENDEREÇO: ");
                      super.setEndereco(sc.next());
                      clientes.add(new Cliente(id,super.getNome(),super.getTelefone(),super.getEndereco()));
                      
                      System.out.println(clientes);
                }
       
    
    
    
    public String toString(){
    
    return  "Cliente ID: "+ this.id +"| Nome: " + super.getNome() + "| Telefone: "+ super.getTelefone() + "| Endereço: "+ super.getEndereco()+"\n";
    
    }
    
    
    

}
