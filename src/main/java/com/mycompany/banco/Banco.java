/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco;

/**
 *
 * @author Lucas
 */
public class Banco {

    public static void main(String[] args) {
        
        //CONTA BANCÁRIA
       /* System.out.println("TESTE CONTA BANCÀRIA");
        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Lucas");
        contaSimples.setNumConta("11111");
        
        contaSimples.depositar(100);
        
        realizarSaque(contaSimples, 50);
        
        realizarSaque(contaSimples, 70);
        
        System.out.println(contaSimples);*/
        
        //CONTA POUPANÇA
        /*System.out.println("TESTE CONTA POUPANÇA");
        
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        
        contaPoupanca.setNomeCliente("Lucas");
        contaPoupanca.setNumConta("22222");
        contaPoupanca.setDiaRendimento(2);
        
        contaPoupanca.depositar(100);
        
        realizarSaque(contaPoupanca, 50);
        
        realizarSaque(contaPoupanca, 70);
        
        if (contaPoupanca.calcularNovoSaldo(0.5)) {
            System.out.println("Rendimento aplicado, novo saldo é de: " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
        }
        
        System.out.println(contaPoupanca);*/
        
        //CONTA ESPECIAL
        System.out.println("TESTE CONTA ESPECIAL");
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Lucas");
        contaEspecial.setNumConta("33333");
        contaEspecial.setLimite(50);
        
        contaEspecial.depositar(100);
        
        realizarSaque(contaEspecial, 50);
        
        realizarSaque(contaEspecial, 70);
        
        realizarSaque(contaEspecial, 80);
        
        System.out.println(contaEspecial);
        
       
    }
     private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso, novo saldo: " + conta.getSaldo());
        } else {
            System.out.println("saldo insuficiente para saque de " + valor + "saldo de: " + conta.getSaldo());
        }
    }
    
}
