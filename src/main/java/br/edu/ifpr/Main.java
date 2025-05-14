package br.edu.ifpr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Conta> contas = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }

    /**
     * Método para exibir os menus disponíveis no sistema
     */
    private static void mostrarMenu(){
        System.out.println("******* MENU *******");
        System.out.println("1 - Cadastrar Conta");
        System.out.println("2 - Realizar Saque");

        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        switch(opcao){
            case 1:
                mostrarTipoConta();
                break;
            case 2:
                exibirTitulares();
            default:
                System.out.println("Opção Inválida!");
                mostrarMenu();
        }
    }

    /**
     *  Método para exibir as opções para criar conta
     */
    private static void mostrarTipoConta(){
        System.out.println("******** Tipo de Conta ********");
        System.out.println("1 - Conta");
        System.out.println("2 - Conta Especial");
        System.out.println("3 - Conta Poupança");

        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        switch(opcao){
            case 1:
                criarConta();
                break;
            case 2:
                criarContaEspecial();
                break;
            case 3:
                criarContaPoupanca();
                break;
            default:
                System.out.println("Opção inválida");
                mostrarTipoConta();
        }
    }

    /**
     * MÉTODO PARA CRIAR UMA CONTA DO TIPO CONTA
     */
    private static void criarConta(){
        System.out.println("Digite o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do titular da conta: ");
        String titular = sc.nextLine();
        System.out.println("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        contas.add(new Conta(numeroConta, titular, saldo));

        mostrarMenu();
    }

    /**
     * MÉTODO PARA CRIAR UMA CONTA DO TIPO CONTA ESPECIAL
     */
    private static void criarContaEspecial(){
        System.out.println("Digite o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do titular da conta: ");
        String titular = sc.nextLine();
        System.out.println("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();
        System.out.println("Informe o limite especial da conta:");
        double limite = sc.nextDouble();

        Conta c = new ContaEspecial(numeroConta, titular, saldo, limite);
        contas.add(c);

        mostrarMenu();
    }

    /**
     * MÉTODO PARA CRIAR UMA CONTA DO TIPO CONTA POUPANÇA
     */
    private static void criarContaPoupanca(){
        System.out.println("Digite o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do titular da conta: ");
        String titular = sc.nextLine();
        System.out.println("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        Conta c = new ContaPoupanca(numeroConta, titular, saldo);
        contas.add(c);

        mostrarMenu();
    }

    private static void exibirTitulares() {
        System.out.println("***** Titulares ******");
        for(Conta conta : contas){
            System.out.println("Número da conta: " + conta.getNumero() + "Nome: " + conta.getTitular());
        }

        System.out.println("Informe o número da conta:");
        int opcao = sc.nextInt();

        /**
         * Conta c = null;
         * for(Conta conta : contas) {
         *      if(conta.getNumero == opcao){
         *          c = conta;
         *      }
         * }
         */
        Conta c = contas.stream()
                .filter(conta -> conta.getNumero() == opcao)
                .findFirst()
                .orElse(null);

        System.out.println("Conta :" + c.getNumero());
        System.out.println("Saldo :" + c.getSaldo());

        System.out.println("Informa o valor a ser sacado:");
        double valor = sc.nextDouble();

        c.sacar(valor);

    }
}