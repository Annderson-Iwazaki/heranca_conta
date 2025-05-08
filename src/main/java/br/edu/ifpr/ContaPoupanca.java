package br.edu.ifpr;

public class ContaPoupanca extends Conta{

    public void reajustar(double percentual) {
        double percentualAjuste = this.getSaldo() * percentual;
        this.depositar(percentualAjuste);
    }

}
