/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2_banco;

/**
 *
 * @author camic
 */
public class MenuBanco extends Banco { 
  
    public void menuInicial(){
        int informa;
        do{
            System.out.println("\n---------------------------------------------");
            System.out.println("\n---- Informe a opção que deseja consultar -----");
            System.out.println(" --- 1 - Cadastro ------------");
            System.out.println(" --- 2 - Consultar Extrato ---");
            System.out.println(" --- 3 - Fazer Saque ---------");
            System.out.println(" --- 4 - Fazer deposito ------");
            System.out.println(" --- 5 - Sair ----------------");
            System.out.println(" Informa :  ");
            informa = sc.nextInt();
            menu(informa);
        }while(informa != 5);
    }
   
    public void menu(int i){    
        switch (i) {
            case  1 :
                this.cadastro();
                break;
            case  2 :
                this.extrato();
                break;
            case  3 :
                this.sacar();
                break;
            case  4 :
                this.depositar();
                break;
            default:
                break;
        }
    }
}
