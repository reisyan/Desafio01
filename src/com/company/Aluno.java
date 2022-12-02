package com.company;

public class Aluno {
    public String nome;
    public int nota1, nota2, nota3, nota4;


    public int calcularMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

}