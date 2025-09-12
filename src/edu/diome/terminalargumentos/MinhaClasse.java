package edu.diome.terminalargumentos;

public class MinhaClasse {
    /**
     * Para executar o programa via terminal (PowerShell, CMD, Terimal da IDE), primeiramente
     * precisa executar aqui o arquivo final '.java' e que irá gerar um arquivo final '.class'
     * dentro da pasta bin|out (o nome da pasta muda conforme IDE), dai você irá no diretório
     * dessa aplicação, e entrar nessa pasta pelo terminal, e usar o comando:
     * <i>java 'nome da classe'</i><br>
     * <b>OBS.:</b> caso a aplicação estiver dentro de um <b><i>'package'</i></b>, precisa entrar
     * no diretório acima do desse <b><i>'package'</i></b>. Exemplo:<br>
     * - aplicação gerada com '<i><b>package</b> edu.diome.terminalargumentos';</i><br>
     * - no terminal preciso está no diretório: '<i>C:..\trilha-java-dio\estudo-java-basico\out\production\estudo-java-basico></i><br>';
     * - no terminal irei executar o comando: '<i><b>java</b> edu.diome.terminalargumentos.MinhaClasse</i><br>';
     */
    public static void main(String[] args) {
        System.out.println("Oi, fui executado pelo terminal!");
    }
}
