package edu.diome.terminalargumentos;

/**
 * Quando utilizar argumentos para ser passado por parâmetro numa aplicação, para poder executar
 * e testar dentro da IDE, precisa ir em <i>Executar->Editar Configuração</i>, irá procurar o
 * campo <i>Argumentos do Programa</i>, la irá colocar os dados conforme a ordem necessária,
 * separados por espaço.
 */
public class AboutMe {
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.parseInt(args[2]);
        double altura = Double.parseDouble(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
    }
}
