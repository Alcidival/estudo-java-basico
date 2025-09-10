package edu.diome.operadores;

public class operadores {

    public static void main(String[] args) {
        /**
         * OPERADORES ARITIMÉTICOS
         * - MÓDULO SERVE PARA OBTER O RESTO DE UMA DIVISÃO INTEIRA;
         */
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        System.out.println(resultado);

        /**
         * OPERADOR COM STRING
         * - QUNANDO UTILIZADO O OPERADOR '+' COM STRING ELE
         *   FAZ A CONCATENAÇÃO DOS TEXTOS.
         *   - 'INT' SEGUIDO DE 'STRING' A CONCATENAÇÃO É DE STRING
         */
        String meuNome = "Alcidival " + "Júnior";
        String concatenacao = "?";
        concatenacao = 1+1+1+"1";
        concatenacao = 1+"1"+1+1;
        concatenacao = 1+"1"+1+"1";
        concatenacao = "1"+1+1+1;
        concatenacao = "1" + (1+1+1);
        System.out.println(meuNome);

        /**
         * OPERADORES LÓGICOS
         * - '&&' = E
         * - '||' = OU
         */
        boolean numeroUm = true;
        boolean numeroDois = false;

        if ( numeroUm && numeroDois ) {
            System.out.println("Os dois numeros são verdadeiros");
        }

        if ( numeroUm || numeroDois ) {
            System.out.println("Um dos numeros é verdadeiro");
        }
    }

}
