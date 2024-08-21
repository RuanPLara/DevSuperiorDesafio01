package com.devsuperior.Desafio01.services;

import com.devsuperior.Desafio01.entities.Pedido;
import org.springframework.stereotype.Service;

@Service
public class DescontoService {
    public double desconto (Pedido pedido) {
        return (pedido.getValor() * (pedido.getPercDesconto() / 100));
    }
}
