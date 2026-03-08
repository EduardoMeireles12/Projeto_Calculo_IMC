package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Database {

    //Conecta a base de dados
    private static final String URL = "jdbc:mysql://localhost:3306/calculadora_imc";
    private static final String USER = "root";
    private static final String PASSWORD = "2601";

    public void savePerson(Person person){

        String sql = "INSERT INTO pessoas_imc (nome, peso, altura, imc) VALUES (?, ?, ?, ?)";

        try{

            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, person.getNome());
            stmt.setDouble(2, person.getPeso());
            stmt.setDouble(3, person.getAltura());
            stmt.setDouble(4, person.getImc());

            stmt.executeUpdate();

            System.out.println("Dados inseridos no banco!");

            stmt.close();
            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}