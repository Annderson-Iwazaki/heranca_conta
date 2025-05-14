package br.edu.ifpr;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero, String nome, double saldo){
        //CHAMANDO O CONSTRUTOR DA CLASSE PAI
        super(numero, nome, saldo);
    }

    public void reajustar(double percentual) {
        double percentualAjuste = this.getSaldo() * percentual;
        this.depositar(percentualAjuste);
    }

}
