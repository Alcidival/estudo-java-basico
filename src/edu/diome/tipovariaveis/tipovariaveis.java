package edu.diome.tipovariaveis;

public class tipovariaveis {

    public static void main(String[] args) {
        //EXEMPLOS DE TIPO NUMÉRICO
        /*byte idade = 123;
        short ano = 2025;
        int cep = 77006454;//SE COMEÇAR COM 0, DEVE SER STRING
        long cpf = 74173185289L;//MESMA SITUAÇÃO DO CEP, SEMPRE PRECISA TERMINAR COM 'L' PARA CONFIRMAR QUE É LONG E NÃO INT
        float pi = 3.14F;//SEMPRE PRECISA TERMINAR COM F PARA CONFIRMAR QUE É FLOAT
        double salario = 1571.23;*/

        /**
         * ESSA SEQUÊNCIA É UMA DEMOSTRAÇÃO DA TRANSFORMAÇÃO CASTING
         * ONDE PEGAMOS UM TIPO DE VARIÁVEL E QUEREMOS TRANFORMAR ELA
         * NUMA TIPO MENOR, NESSE CASO: TRANSFORMAR INT EM SHORT
         */
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

    }


}
