/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author Lucas
 */
public class ContaEspecial extends ContaBancaria {
    
    private double limite;

     @Override
    public String toString() {
        String s = "ContaEspecial";
        s += "diaRendimento: " + limite;
        s += "ContaPoupanca{" + "diaRendimento=" + limite + '}';
        s += "" + super.toString();
        return s;
    }
    
    public boolean sacar(double valor) {
        
        double saldoComLimite = this.getSaldo() + limite;
        
        if ((saldoComLimite - valor) >= 0) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }
    
    
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
}
