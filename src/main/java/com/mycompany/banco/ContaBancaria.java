/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author Lucas
 */
public class ContaBancaria {
    
    //ATRIBUTOS DA CLASSE
    private String nomeCliente;
    private String numConta;
    private double saldo;

    @Override
    public String toString() {
        return " ContaBancaria " + "nomeCliente= " + nomeCliente + ", numConta= " + numConta + ", saldo= " + saldo;
    }

    //MÉTODOS GETS E SETS
   
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    //OUTROS MÉTODOS
    public void depositar(double valor) {
        saldo += valor;
    }
    
    public boolean sacar(double valor) {
        if ((saldo - valor) >= 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }
    
}
