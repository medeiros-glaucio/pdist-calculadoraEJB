package br.edu.ifpb.service;

import br.edu.ifpb.ejb.CalculadoraIF;
import jakarta.ejb.Stateless;

@Stateless(name="calculadoraService")
public class Calculadora implements CalculadoraIF {

    @Override
    public int somar(int num1, int num2) {
        return (num1 + num2);
    }
}
