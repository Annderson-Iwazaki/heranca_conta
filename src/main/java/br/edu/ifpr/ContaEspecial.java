package br.edu.ifpr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(int numero, String nome, double saldo, double limite) {
        super(numero, nome, saldo);
        this.limite = limite;
    }

    /**
     * MÉTODO SOBRESCRITO DA CLASSE PAI
     * @param valor
     * @return
     */
    @Override
    public boolean sacar(double valor) {
        System.out.println("Conta Especial");
        if(valor > getSaldo() && this.limite >= valor){
            this.limite -= valor;
        }else {
            return false;
        }
        super.sacar(valor);
        return true;
    }
}
