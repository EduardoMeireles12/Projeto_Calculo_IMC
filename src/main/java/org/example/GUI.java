package org.example;

import java.util.Scanner;

public class GUI {

    public void start(){
        System.out.println("*****Calculadora de IMC*****");
        System.out.println("   __________ __________ ");
        System.out.println("Abaixo do peso: IMC < 18,5");
        System.out.println("Peso normal: IMC 18,5 a 24,9");
        System.out.println("Sobrepeso: IMC 25 a 29,9");
        System.out.println("Obesidade: IMC ≥ 30");
    }

    public void imcInput(Scanner scanner){

        while(true){

            System.out.println();

            System.out.print("Entre o seu nome: ");
            String nome = scanner.nextLine();

            double peso = lerNumero(scanner, "Entre o seu peso (kg): ");
            double altura = lerNumero(scanner, "Entre a sua altura (ex: 1.90): ");

            IMC imcCalc = new IMC();
            double imc = imcCalc.imc_calc(peso, altura);

            System.out.println("Seu IMC é: " + imc);

            Person person = new Person(nome, peso, altura, imc);

            Database db = new Database();
            db.savePerson(person);

            System.out.println("Fazer novo cálculo? (S/N)");
            String novo = scanner.nextLine();

            if(novo.equalsIgnoreCase("N")){
                break;
            }
        }
    }

    private double lerNumero(Scanner scanner, String mensagem){

        while(true){
            try{
                System.out.print(mensagem);

                String valor = scanner.nextLine().replace(",", ".");
                return Double.parseDouble(valor);

            }catch(Exception e){
                System.out.println("Valor inválido! Digite um número no formato correto.");
            }
        }
    }
}