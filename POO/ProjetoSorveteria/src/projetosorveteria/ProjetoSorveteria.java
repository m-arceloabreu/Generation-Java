/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosorveteria;

import static java.nio.file.Files.size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
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
        int sel,escolha = 0, c = 0;
        Scanner sc = new Scanner(System.in);
        //CLientes
        
        
       
        Cliente  cli = new Cliente(0,"","","");
        cli.Clientes();
        Funcionario func = new Funcionario(0,"","","","","","");
        func.Funcionarios();
        Sorvete sor = new Sorvete("",0,0,"");
        sor.Sorvete();
        Pedido ped = new Pedido("","","",0,0,0);
        

       do{
        
        System.out.println("SORVETERIA GRUPO 1");
        System.out.println("1 - Clientes ");
        System.out.println("2 - Funcionarios ");
        System.out.println("3 - SORVETES");
        System.out.println("4 - Pedido");
        System.out.println("Opção: ");
        sel = sc.nextInt();
        escolha = 0;
        switch(sel){
            case 1:
                System.out.println("---Clientes Cadastrados---");
                    System.out.println(cli.clientes +"\n");
                 
                  System.out.println("1- INSERIR CLIENTE \n2-VOLTAR");
                  c = sc.nextInt();
                  System.out.println("\n--------------------");
                  if (c == 1) {
                       cli.inserirCliente();
                   
                     escolha = 1;
                  }else{
                  escolha = 1;
                  }
                  
                break;
            case 2:
                System.out.println("---Funcionarios Cadastrados---");
                int f;
                     System.out.println(func.funcs + "\n");
                    System.out.println("1- INSERIR FUNCIONARIO \n2-VOLTAR");
                    f = sc.nextInt();
                      if (f == 1) {
                       func.inserirFunc();
                     escolha = 1;
                  }else{
                  escolha = 1;
                  }
                
                break;
            case 3:
                System.out.println("---Sorvete---");
                int s ;
                System.out.println(sor.sor + "\n");
                System.out.println("1- INSERIR SORVETE\n2-Voltar");
                s = sc.nextInt();
                if( s == 1 ){
                    sor.inserirSorvete();
                    escolha = 1;
                }else{escolha =1;}
                
                break;
           
            case 4: 
                try{
                int idCli,idFunc,sabor;
                System.out.println("---Pedido---");
                  
                System.out.println("Digite o Id do Cliente");
                idCli = sc.nextInt();
                ped.nomeCli(idCli,(ArrayList<Cliente>) cli.clientes);
                
                System.out.println("Digite od ID do Funcionario");
                idFunc = sc.nextInt();
                ped.nomeFunc(idFunc, (ArrayList<Funcionario>) func.funcs);
                
                System.out.println("Sabor: ");
                sabor = sc.nextInt();
                ped.Sabor(sabor,(ArrayList<Sorvete>) sor.sor);
                
                System.out.println("Quantidade: ");
                ped.setQtdSorvete(sc.nextInt());
             
                ped.Pedidos1();
                escolha = 1;
                
                }catch(IndexOutOfBoundsException e){
                    System.out.println("    ----ERRO!!!----\nID- Não Encontrado!!!\nDIGITE UM NUMERO DE ID JÁ CADASTRADO!!;");
                    escolha = 1;
                }catch(InputMismatchException e){
                    System.out.println("    ----ERRO!!!----\nFormato de ID não valido!\nDIGITE UM NUMERO DE ID JÁ CADASTRADO!!");
                    escolha = 1;
                }
                
                break;
            default: 
                
                
                System.out.println("----ERRO, DIGITE NOVAMENTE----\n--------------------");
                escolha = 1;
               break;
        }
       }while(escolha == 1); 
       
            
    } 
}




