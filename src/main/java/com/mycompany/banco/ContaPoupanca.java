/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

import java.util.Calendar;

/**
 *
 * @author Lucas
 */
public class ContaPoupanca extends ContaBancaria{
    
    private int diaRendimento;
    
    
    @Override
    public String toString() {
        String s = "ContaPoupanca";
        s += "diaRendimento: " + diaRendimento;
        s += "ContaPoupanca{" + "diaRendimento=" + diaRendimento + '}';
        return s;
    }
    
    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    
    public boolean calcularNovoSaldo(double taxaRendimento) {
        Calendar hoje = Calendar.getInstance();
        
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
           this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
           return true;
        }
           return false;
    }

    
    
}
