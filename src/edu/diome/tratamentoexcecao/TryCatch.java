package edu.diome.tratamentoexcecao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    /**
     * EXCEÇÕES MAPEADAS
     * - java.lang.NullPointerException : Quando tentamos obter alguma informação de uma variável nula.
     * - java.lang.ArithmeticException : Quando tentamos dividir um valor por Zero.
     * - java.sql.SQLExceprion : Quando existe algum erro relacionado a interação com o Banco de Dados.
     * - java.io.FileNotFoundException : Quando tentamos ler ou escrever em um arquivo que não existe.
     */
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome:");
            String nome = sc.next();

            System.out.println("Digite seu sobrenome:");
            String sobrenome = sc.next();

            System.out.println("Digite sua idade:");
            int idade = sc.nextInt();

            System.out.println("Digite sua altura:");
            double altura = sc.nextDouble();

            System.out.println("Olá, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + " cm");
            sc.close();
        }
        catch (InputMismatchException e) {

        }
    }
}
