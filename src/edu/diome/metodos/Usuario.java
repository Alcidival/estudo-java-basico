package edu.diome.metodos;

public class Usuario {

    public static void main(String[] args) throws Exception {
        SistemaSmartTv smartTv = new SistemaSmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        smartTv.ligar();
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(11);
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.desligar();
        System.out.println("TV Ligada? " + smartTv.ligada);
    }

}
