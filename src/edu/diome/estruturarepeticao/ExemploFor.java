package edu.diome.estruturarepeticao;

public class ExemploFor {
    public static void main(String[] args) {
        //Usando FORs com ARRAY
        String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};

        //Exemplo 1 - FOR
        for (int x=0; x < alunos.length; x++) {
            System.out.println("O Nome do aluno é: " + alunos[x]);
        }
        //Exemplo 2 - FOR EACH
        for (String aluno : alunos) {
            System.out.println("O Nome do aluno é: " + aluno);
        }
    }
}
