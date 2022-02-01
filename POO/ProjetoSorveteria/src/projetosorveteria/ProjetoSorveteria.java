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
public class ProjetoSorveteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sel,escolha = 0;
        
        Acompanhamentos acom = new Acompanhamentos();
        Cliente cli = new Cliente("abc1","","");
        Funcionario func = new Funcionario("","","");
        Sorvete sor = new Sorvete();
      
       do{
        Scanner sc = new Scanner (System.in);
        System.out.println("SORVETERIA GRUPO 1");
        System.out.println("1 - Inserir Cliente");
        System.out.println("2 - Inserir Funcionario");
        System.out.println("3 - Inserir Sorvete");
        System.out.println("4 - Inserir Acompanhamento");
        System.out.println("5 - Inserir Pedido");
        System.out.println("Opção: ");
        sel = sc.nextInt();
        escolha = 0;
        switch(sel){
            
            case 1:
                System.out.println("Cliente");
                
                    System.out.println("Nome: ");
                     cli.setNome(sc.next());
                     System.out.println("Telefone: ");
                     cli.setTelefone(sc.next());
                     System.out.println("Endereco: ");
                     cli.setEndereco(sc.next());
                     System.out.println("Id-Cliente: ");
                     cli.setId(sc.nextInt());
                     
                     System.out.println("Nome: "+cli.getNome());
                     System.out.println("Telefone: "+cli.getTelefone());
                     System.out.println("Endereco: "+cli.getEndereco());
                     System.out.println("Id-Cliente: "+cli.getId());
                     
                break;
            case 2:
                System.out.println("Funcionario");
                
                    System.out.println("Nome: ");
                     func.setNome(sc.next());
                     System.out.println("Telefone: ");
                     func.setTelefone(sc.next());
                     System.out.println("Endereco: ");
                     func.setEndereco(sc.next());
                      System.out.println("Cargo: ");
                     func.setCargo(sc.next());
                      System.out.println("CPF: ");
                     func.setCpf(sc.next());
                      System.out.println("Id-Func: ");
                     func.setId(sc.nextInt());
                     
                     
                     System.out.println("Nome: "+func.getNome());
                     System.out.println("Telefone: "+func.getTelefone());
                     System.out.println("Endereco: "+func.getEndereco());
                     System.out.println("Id-Func: "+func.getId());
                     System.out.println("Cargo: "+func.getCargo());
                     System.out.println("CPF: "+func.getCpf());
                  
                     
                
                break;
            case 3:
                System.out.println("Sorvete");
                
                System.out.println("Sabor: ");
                sor.setSabor(sc.next());
                System.out.println("Marca: ");
                sor.setMarca(sc.next());
                System.out.println("Valor: R$ ");
                sor.setValor(sc.nextDouble());
                System.out.println("Id-Sorvete");
                sor.setId(sc.nextInt());
                
                System.out.println("ID-Sorvete: "+sor.getId());
                System.out.println("Sabor: "+sor.getSabor());
                System.out.println("Marca: "+sor.getMarca());
                System.out.println("Valor: "+sor.getValor());
                break;
            case 4:
                System.out.println("Acompanhamentos");
                
                System.out.println("Acompanhamento: ");
                acom.setNome(sc.next());
                System.out.println("Marca: ");
                acom.setMarca(sc.next());
                System.out.println("Valor: ");
                acom.setValor(sc.nextDouble());
                System.out.println("ID-Acomp: ");
                acom.setId(sc.nextInt());
                
                System.out.println("Id-Acompanhamento"+acom.getId());
                System.out.println("Nome: "+acom.getNome());
                System.out.println("Marca: "+acom.getMarca());
                System.out.println("Valor: "+acom.getValor());
                break;
            case 5: 
                System.out.println("Pedido");
                cli.getId();
                func.getId();
                sor.getId();
                acom.getId();
              
                
                
                break;
            default: 
                System.out.println("ERRO, DIGITE NOVAMENTE");
                escolha = 1;
               break;
        }
       }while(escolha == 1);
                   
        
    }
    
}
