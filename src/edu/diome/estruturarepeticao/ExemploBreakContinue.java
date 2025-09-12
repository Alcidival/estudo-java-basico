package edu.diome.estruturarepeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            if (i == 3)
                //break;//ELE IRÁ PARALISAR O FOR QUANDO CHEGAR NO 3
                continue;//ELE IRÁ PULAR O 3 E CONTINUARÁ NO PRÓXIMO CONTADOR

            System.out.println("Número: " + i);
        }
    }
}
