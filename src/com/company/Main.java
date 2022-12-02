package com.company;

public class Main {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        double media;
        double soma = 0;
        double notas[];

        a1.setNome("Rodrigo");
        a1.setNota1(9);
        a1.setNota2(9);
        a1.setNota3(10);
        a1.setNota4(10);

        a2.setNome("Rogério");
        a2.setNota1(10);
        a2.setNota2(10);
        a2.setNota3(10);
        a2.setNota4(10);

        a3.setNome("Renato");
        a3.setNota1(8);
        a3.setNota2(8);
        a3.setNota3(9);
        a3.setNota4(7);


       System.out.println("Média de Rodrigo = " + a1.calcularMedia());
       System.out.println("Média de Rogério = " + a2.calcularMedia());
       System.out.println("Média de Renato = " + a3.calcularMedia());

    }

}
