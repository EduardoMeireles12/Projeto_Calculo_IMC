package org.example;

public class Person {

    private String nome;
    private double peso;
    private double altura;
    private double imc;

    public Person(String nome, double peso, double altura, double imc){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
    }

    public String getNome(){
        return nome;
    }

    public double getPeso(){
        return peso;
    }

    public double getAltura(){
        return altura;
    }

    public double getImc(){
        return imc;
    }
}