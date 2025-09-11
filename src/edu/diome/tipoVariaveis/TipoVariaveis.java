package edu.diome.tipoVariaveis;

public class TipoVariaveis {

    public static void main(String[] args) {
        /**
         * TIPOS DE VARIÁVEIS PRIMITIVO
         * OBS.:
         * - SE 'INT' COMEÇAR COM '0', DEVE SER TIPO 'STRING';
         * - SE 'LONG' COMEÇAR COM '0', DEVE SER TIPO 'STRING';
         * - 'LONG' PRECISA SEMPRE FINALIZAR COM 'L' PARA INFORMAR QUE NÃO É 'INT;
         * - 'FLOAT' PRECISA SEMPRE FINALIZAR COM 'F' PARA CONFIRMAR QUE É 'FLOAT';
         * - 'CHAR' É SÓ UM CARATECE;
         */
        byte idade = 123;
        short ano = 2025;
        int cep = 77006454;
        long cpf = 74173185289L;
        float pi = 3.14F;
        double salario = 1571.23;
        char numero = 0;
        boolean verdadeiro = true;

        /**
         * ESSA SEQUÊNCIA É UMA DEMOSTRAÇÃO DA TRANSFORMAÇÃO CASTING
         * ONDE PEGAMOS UM TIPO DE VARIÁVEL E QUEREMOS TRANFORMAR ELA
         * NUMA TIPO MENOR, NESSE CASO: TRANSFORMAR INT EM SHORT
         */
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        /**
         * SEMPRE QUE QUISER USAR UMA CONSTANTE PARA QUE NÃO SEJA MODIFICADO O VALOR
         * PRECISA UTILIZAR O 'FINAL' ANTES DO TIPO, E EM CAIXA ALTA PARA INFORMAR
         * QUE É UMA CONSTANTE E NUNCA SERÁ MUDADO O VALOR, ISSO SERVE PARA QUALQUER TIPO
         */
        final float VALOR_DE_PI = 3.14F;

        /**
         * TIPOS DE STRINGs
         * OBS.:
         * - A "" É USADO PARA STRINGs
         * - A '' É USADO PARA UM ÚNICO CARACTERE
         */
        String meuNome = "Alcidival";
        char letra = 'A';
    }

}
