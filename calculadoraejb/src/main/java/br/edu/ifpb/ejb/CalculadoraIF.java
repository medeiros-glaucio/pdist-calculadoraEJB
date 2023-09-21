package br.edu.ifpb.ejb;


import jakarta.ejb.Remote;

@Remote
public interface CalculadoraIF {

    public int somar(int num1, int num2);

}
