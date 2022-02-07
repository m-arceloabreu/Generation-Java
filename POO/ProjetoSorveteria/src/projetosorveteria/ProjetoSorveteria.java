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
        int sel,escolha = 0;
        
        Cliente cli = new Cliente(0,"","","");
        Funcionario func = new Funcionario(0,"","","","","","");
        Sorvete sor = new Sorvete("",0,0,"");
        Pedido ped = new Pedido("","","",0,0,0);
     

       do{
        Scanner sc = new Scanner (System.in);
        System.out.println("SORVETERIA GRUPO 1");
        System.out.println("1 - Clientes Cadastrados");
        System.out.println("2 - Funcionarios Cadastrados");
        System.out.println("3 - MENU");
        System.out.println("4 - Inserir Pedido");
        System.out.println("Opção: ");
        sel = sc.nextInt();
        escolha = 0;
        switch(sel){
            case 1:
                System.out.println("---Clientes Cadastrados---");
                  cli.Clientes();
                  escolha = 1;
                break;
            case 2:
                System.out.println("---Funcionarios Cadastrados---");
                func.Funcionario();
                     
                escolha = 1;
                break;
            case 3:
                System.out.println("---Sorvete---");
                sor.Sorvete();
                escolha = 1;
                break;
           
            case 4: 
                try{
                int idCli,idFunc,sabor;
                System.out.println("---Pedido---");
                  
                System.out.println("Digite o Id do Cliente");
                idCli = sc.nextInt();
                ped.nomeCli(idCli);
                
                System.out.println("Digite od ID do Funcionario");
                idFunc = sc.nextInt();
                ped.nomeFunc(idFunc);
                
                System.out.println("Sabor: ");
                sabor = sc.nextInt();
                ped.Sabor(sabor);
                
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

