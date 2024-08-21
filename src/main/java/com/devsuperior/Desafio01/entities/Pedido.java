package com.devsuperior.Desafio01.entities;

import org.springframework.stereotype.Component;

public class Pedido {
    private int codigo;
    private double valor;
    private double percDesconto;

    public Pedido(int codigo, double valor, double percDesconto) {
        this.codigo = codigo;
        this.valor = valor;
        this.percDesconto = percDesconto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPercDesconto() {
        return percDesconto;
    }

    public void setPercDesconto(double percDesconto) {
        this.percDesconto = percDesconto;
    }
}
