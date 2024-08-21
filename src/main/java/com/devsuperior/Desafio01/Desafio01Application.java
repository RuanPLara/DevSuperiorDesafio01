package com.devsuperior.Desafio01;

import com.devsuperior.Desafio01.entities.Pedido;
import com.devsuperior.Desafio01.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	@Autowired
	private PedidoService pedidoService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pedido pedido = new Pedido(1034, 150, 20);
		System.out.println(pedidoService.total(pedido));

		pedido.setCodigo(2282);
		pedido.setValor(800);
		pedido.setPercDesconto(10);
		System.out.println(pedidoService.total(pedido));

		pedido.setCodigo(1309);
		pedido.setValor(95.90);
		pedido.setPercDesconto(0);
		System.out.println(pedidoService.total(pedido));

	}

}
