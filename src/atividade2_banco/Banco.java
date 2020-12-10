/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2_banco;

//import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

//import javafx.util.converter.LocalDateTimeStringConverter;

/**
 *
 * @author camic
 */
public class Banco { 
	
    Random gerador = new Random();
    java.util.Scanner sc = new Scanner (System.in); 
    
    //Cadastro
    private String nome;
    private double saldoInicial;
    private int codConta;
    private boolean conta;
    //informações classe banco
    private int quantSaque;
    private double valorSaque;
    private double valorDeposito;
    
//Metodo Construtor
    public Banco(){
        this.nome = nome;
        this.saldoInicial = 0000;
        this.codConta = 0000;
        this.conta = false;
    }
    	
    //Metodos especiais Getters Setters
    //Para informar o nome do usuário
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //Informear saldo incicial
    public double getSaldoInicial() {
        return saldoInicial;
    }
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
    // Para´pegar o código da conta
    public int getCodConta() {
        return codConta;
    }
    public void setCodConta(int codConta) {
        this.codConta = codConta;
    }
    //Se tem ou não conta
    public boolean getConta() {
        return conta;
    }
    public void setConta(boolean conta) {
        this.conta = conta;
    }
    // Quantidade de Saques
    public int getQuantSaque() {
        return quantSaque;
    }
    public void setQuantSaque(int quantSaque) {
        this.quantSaque = quantSaque;
    }
    //Valores de Saque
    public double getValorSaque() {
        return valorSaque;
    }
    public void setValorSaque(double valorSaque) {
        this.valorSaque = valorSaque;
    }
    //Valores de Dposito
    public double getValorDeposito() {
        return valorDeposito;
    }
    public void setValorDeposito(double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }
    
    //método para limpar o Buffer
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

    //Metodos
    public void cadastro(){
        if(this.getConta() == false){
            System.out.println("---Vamos fazer um cadastro----");
            System.out.println("Informe seu nome: ");
            clearBuffer(sc);
            this.nome = sc.nextLine();
            
            System.out.println("Informe o saldo inicial que deseja na sua conta: ");
            this.saldoInicial = sc.nextDouble();
            while (codConta < 1000) {
            this.codConta = 1 + gerador.nextInt(9999);
            }
            this.conta = true;
                System.out.println("-----Seu cadastro foi efetuado com sucesso-----");
                System.out.println("\nNome correntista: " +this.getNome()
                 +"\nSaldo inicial da conta: " +this.getSaldoInicial()
                 +"\nCódigo conta: " +this.getCodConta());
                System.out.println("\n---------------------------------------------");
        
        }else if(this.getConta() == true){
            System.out.println("Você já possuí uma conta!");
        }
    }
    
    //método para ver o extrato
    public void extrato(){
        System.out.println("------ EXTRATOS Bancarios ------");
        System.out.println("Nome do correntista: " +this.getNome());
        System.out.println("Slado atual da conta: " +this.getSaldoInicial());
        System.out.println("Número da conta: " +this.getCodConta());
        System.out.println("Quantidade de saques ja feitos: " +this.getQuantSaque());
    }
    
    //método de saque
    public void sacar(){
       if(this.conta == true){
            System.out.println("-------- SAQUE conta --------");
            System.out.println("Informe a quantidade que seja sacar de sua conta");
            this.valorSaque = sc.nextDouble();
            if(this.valorSaque <= this.saldoInicial){
                System.out.println("Sua conta está com saldo negativo, impossível realizar saque.");
            }else{
                this.setSaldoInicial(this.getSaldoInicial() - this.valorSaque);
                System.out.println("Saque efetuado com sucesso! Seu saldo atual é de: " +this.getSaldoInicial()
                +"\nNome do correntista: " +this.getNome() 
                +"\nNúmero da conta: " +this.getCodConta());
                this.setQuantSaque(this.quantSaque + 1);
            }
       }else{
            System.out.println("Você não possui uma conta para fazer depositos.");
       }
    }
    
    //método depositar
    public void depositar(){  
        if(this.conta == true) {
            System.out.println("------- DEPOSITO conta -------");
            System.out.println("Informe a quantidade que seja depositar em sua conta");
            this.valorDeposito = sc.nextDouble();
            this.setSaldoInicial(this.saldoInicial + this.valorDeposito);
            System.out.println("Seu saldo atual é de: " +this.getSaldoInicial()
            +"\nNome do correntista: " +this.getNome() 
            +"\nNúmero da conta: " +this.getCodConta());
        }else{
            System.out.println("Você não possui uma conta para fazer depositos.");
        }
    }
}
       