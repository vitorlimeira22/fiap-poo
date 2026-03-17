package br.com.fiapride.main;

import br.com.fiapride.model.Monitor;


public class TesteMonitor {

    Monitor monitor1 = new Monitor("Concordia", 27.5);
        System.out.println("ligando monitor");
        monitor1.apertarBotaoLigar(true);

        Monitor monitor2 = new Monitor("Acer", 24.5);
        monitor2.trocarMarca("Samsung");


        System.out.println("--- teste ---");
        System.out.println("marca do Monitor: " + monitor1.marca + " | Ligado?: " + monitor1.ligado);
        System.out.println("marca do Monitor: " + monitor2.marca+ " | Ligado?: " + monitor2.ligado);

}
