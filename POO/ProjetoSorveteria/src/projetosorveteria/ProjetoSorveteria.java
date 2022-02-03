/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosorveteria;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        
        Cliente cli = new Cliente(0,"","","");
        Sorvete sor = new Sorvete("",0,0,"");
      
       do{
        Scanner sc = new Scanner (System.in);
        System.out.println("SORVETERIA GRUPO 1");
        System.out.println("1 - Clientes Cadastrados");
        System.out.println("2 - Funcionarios Cadastrados");
        System.out.println("3 - Sorvetes Cadastrados");
        System.out.println("4 - Inserir Pedido");
        System.out.println("Opção: ");
        sel = sc.nextInt();
        escolha = 0;
        switch(sel){
            
            case 1:
                System.out.println("Clientes Cadastrados");
                  Clientes();
                break;
            case 2:
                System.out.println("Funcionarios Cadastrados");
                Funcionario();
                     
                
                break;
            case 3:
                System.out.println("Sorvete");
                Sorvete();
           
            case 4: 
                System.out.println("Pedido");
                Pedido();
                
                break;
            default: 
                System.out.println("ERRO, DIGITE NOVAMENTE");
                escolha = 1;
               break;
        }
       }while(escolha == 1);
                   
        
    }
      public static void Clientes()
                {
                Set<Cliente> clientes = new HashSet<Cliente>();
                Cliente c1 = new Cliente(1,"Anderson Abreu","4002-8922","Rua Almirante");
                Cliente c2 = new Cliente(2,"Fernanda Andrade","4003-8933","Alameda X");
    
                clientes.add(c1);
                clientes.add(c2);
                
                System.out.println(clientes);
    }
     public static void Funcionario(){
      Set<Funcionario> funcs = new HashSet<Funcionario>();
                Funcionario f1 = new Funcionario(1,"Operador de Caixa","Marcelo", "4002-8184","Rua Isso ai","12345678903", "5000");
                Funcionario f2 = new Funcionario(2,"Gerente","Jamille", "4002-8789","Rua do Conhecimento","12345678902", "10000");
    
                funcs.add(f1);
                funcs.add(f2);
                
                System.out.println(funcs);
     
     }
     public static void Sorvete(){
         
	Set<Sorvete> sor = new HashSet<Sorvete>();
	Sorvete s1 = new Sorvete ("Chocolate", 1, 5.00, "Nestlé");
	Sorvete s2 = new Sorvete ("Morango", 2, 500, "Kibon");
	
	sor.add(s1);
	sor.add(s2);
	
	System.out.println(sor);
     }
     
     public static void Pedido(){
         int cliId= 0, saborId = 0 , funcId = 0, pedNum = 0 , qtSor = 0;
         double vt = 0;
         Scanner sc = new Scanner(System.in);
         Pedido ped = new Pedido(0,0,0,0,0,0);
         
         System.out.println("Digite o Numero do Pedido: ");
         pedNum = sc.nextInt();
         
         System.out.println("Digite o ID do Cliente: ");
         cliId = sc.nextInt();
         
         System.out.println("Digite o ID do Funcionario: ");
         funcId = sc.nextInt();
         
         System.out.println("Digite o ID do Sorvete: ");
         saborId = sc.nextInt();
         
         
         
         System.out.println("Digite Quantidade do Sorvete: ");
         qtSor = sc.nextInt();
         

         
         
         Set<Pedido> peds = new HashSet<Pedido>();
         Pedido p1 = new Pedido(saborId,cliId,funcId,pedNum,qtSor,vt);
         
         peds.add(p1);
         
         System.out.println(peds);
         
         
         
         
     
     }
    
    
}
