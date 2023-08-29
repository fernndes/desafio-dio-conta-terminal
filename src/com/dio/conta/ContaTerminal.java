package com.dio.conta;

import java.math.BigDecimal;

public class ContaTerminal {
    public int numero;
    public String agencia;
    public String nome_cliente;
    public BigDecimal saldo;
    public ContaTerminal(int numero, String agencia, String nome_cliente, BigDecimal saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome_cliente = nome_cliente;
        this.saldo = saldo;
    }

    public String printInitialMessage() {
        return "Olá " + this.nome_cliente + " obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia +" conta " + this.numero + " e seu saldo " + this.saldo + " já está disponível para saque";
    }
}
