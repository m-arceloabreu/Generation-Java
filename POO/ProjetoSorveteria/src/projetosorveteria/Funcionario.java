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
    
    
   public String toString(){
   
   return  "ID-Funcionario: "+ id + " | Nome: " + super.getNome() +" | Cargo: "+ cargo + " | Telefone: "+ super.getTelefone() + " | Endereço: "+ super.getEndereco() + " | CPF: "+cpf + " | Salario: R$"+ sal+ "\n";
   }
    
    
    
}
