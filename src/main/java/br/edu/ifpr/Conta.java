package br.edu.ifpr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Conta {

    private int numero;
    private String titular;
    private double saldo;

    public boolean sacar(double valor) {
        System.out.println("Super classe conta");
        if(this.saldo < valor ){
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

}
