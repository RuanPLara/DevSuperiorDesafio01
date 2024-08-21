package com.devsuperior.Desafio01.services;

import com.devsuperior.Desafio01.entities.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private FreteService freteService;

    @Autowired
    private DescontoService descontoService;

    public Double total (Pedido pedido) {
        return  pedido.getValor() -
                descontoService.desconto(pedido) +
                freteService.valor(pedido.getValor());
    }
}
