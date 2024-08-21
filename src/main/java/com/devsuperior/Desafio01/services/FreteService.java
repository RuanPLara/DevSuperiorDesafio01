package com.devsuperior.Desafio01.services;

import org.springframework.stereotype.Service;

@Service
public class FreteService {

    public double valor (double valor) {
        if (valor < 100) {
            return 20;
        } else if (valor < 200) {
            return 12;
        } else{
            return 0;
        }
    }
}
