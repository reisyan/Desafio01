package com.company;

public class Main {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.nome = "Rodrigo";
        a1.nota1 = 9;
        a1.nota2 = 9;
        a1.nota3 = 10;
        a1.nota1 = 10;

        a2.nome = "Rogério";
        a2.nota1 = 10;
        a2.nota2 = 10;
        a2.nota3 = 10;
        a2.nota1 = 10;

        a3.nome = "Renato";
        a3.nota1 = 8;
        a3.nota2 = 8;
        a3.nota3 = 9;
        a3.nota1 = 7;

       System.out.println("Média de Rodrigo = " + a1.calcularMedia());
        System.out.println("Média de Rogério = " + a2.calcularMedia());
        System.out.println("Média de Renato = " + a3.calcularMedia());

    }

}
