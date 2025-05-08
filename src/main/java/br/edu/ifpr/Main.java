package br.edu.ifpr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Conta> contas = new ArrayList<>();

    public static void main(String[] args) {
        mostrarMenu();
    }

    /**
     * Método para exibir os menus disponíveis no sistema
     */
    private static void mostrarMenu(){
        System.out.println("******* MENU *******");
        System.out.println("1 - Cadastrar Conta");

        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        switch(opcao){
            case 1:
                mostrarTipoConta();
                break;
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

    }

    /**
     * MÉTODO PARA CRIAR UMA CONTA DO TIPO CONTA ESPECIAL
     */
    private static void criarContaEspecial(){

    }

    /**
     * MÉTODO PARA CRIAR UMA CONTA DO TIPO CONTA POUPANÇA
     */
    private static void criarContaPoupanca(){

    }
}