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
public class Funcionario extends Pessoa {
    
    private String sal;
    private int id;
    private String cargo;
    private String cpf;

    public Funcionario(int id,String cargo,String nome, String telefone, String endereco, String cpf, String sal) {
        super(nome, telefone, endereco);
        this.id = id;
        this.cargo = cargo;
        this.cpf = cpf;
        this.sal = sal;
        
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    List<Funcionario> funcs = new ArrayList<Funcionario>();
  
    
    public  void Funcionarios(){
      
                Funcionario f1 = new Funcionario(1,"Operador de Caixa","Marcelo", "4002-8184","Rua Isso ai","12345678903", "5000");
                Funcionario f2 = new Funcionario(2,"Gerente","Jamille", "4002-8789","Rua do Conhecimento","12345678902", "10000");
                funcs.add(f1);
                funcs.add(f2);
               
     
     }
    public void inserirFunc(){
                      Scanner sc = new Scanner(System.in);
                   
                      System.out.println("Digite o ID: ");
                      id = sc.nextInt();
                      System.out.println("Digite o CARGO: ");
                      cargo = sc.next();
                      System.out.println("Digite o NOME: ");
                      super.setNome(sc.next());
                      System.out.println("Digite o TELEFONE: ");
                      super.setTelefone(sc.next());
                      System.out.println("Digite o ENDEREÇO: ");
                      super.setEndereco(sc.next());
                      System.out.println("Digite o CPF: ");
                      cpf = sc.next();
                      System.out.println("Digite o Salário: ");
                      sal = sc.next();
                      funcs.add(new Funcionario(id,cargo,super.getNome(),super.getTelefone(),super.getEndereco(),cpf,sal));
                      
                      System.out.println(funcs);
                }
    
   public String toString(){
   
   return  "ID-Funcionario: "+ id + " | Nome: " + super.getNome() +" | Cargo: "+ cargo + " | Telefone: "+ super.getTelefone() + " | Endereço: "+ super.getEndereco() + " | CPF: "+cpf + " | Salario: R$"+ sal+ "\n";
   }
    
    
    
}
