package edu.diome.estruturacondicional;

public class PlanoOperadora {
    public static void main(String[] args) {
        /**
         * AVALAINDO A DIFERENÇA DO USO DE <i>IF/ELSE</i> E <i>SWITCH/CASE</i>:
         * - caso o resultado das condicionais seja bem repetitivo, melhor utilizar
         * o <i>SWITCH/CASE</i>, mas caso venha ter resultados diferentes para cada
         * condicional, provavelmente será melhor utilizar o <i>IF/ELSE</i>.
         */
        String plano = "MIDIA";

        switch (plano) {
            case "TURBO" : {
                System.out.println("5Gb YouTube");
            }
            case "MIDIA" : {
                System.out.println("Whats e Instagram Grátis");
            }
            case "BASIC" : {
                System.out.println("100 Minutos de Ligação");
            }
        }
    }
}
