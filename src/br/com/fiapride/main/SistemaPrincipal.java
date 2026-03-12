package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Monitor;

public class SistemaPrincipal {

    public static void main(String[] args) {

//        Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
//        System.out.println("Recarga passageiro 1");
//        passageiro1.adicionarSaldo(50.0);
//
//        // Criando o segundo passageiro (Objeto 2)
//        Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
//        System.out.println("Recarga passageiro 2");
//        passageiro2.adicionarSaldo(12.5);
//
//        System.out.println("--- Sistema FiapRide ---");
//        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo + " | CPF: " + passageiro1.cpf);
//        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo + " | CPF: " + passageiro2.cpf);
//
//        System.out.println("Pagando viagem do passageiro 1");
//        passageiro1.pagarViagem(20);
//        System.out.println("Pagando viagem do passageiro 2");
//        passageiro2.pagarViagem(20);


        Monitor monitor1 = new Monitor("Concordia", 27.5);
        System.out.println("ligando monitor");
        monitor1.apertarBotaoLigar(true);

        Monitor monitor2 = new Monitor("Acer", 24.5);
        monitor2.trocarMarca("Samsung");


        System.out.println("--- teste ---");
        System.out.println("marca do Monitor: " + monitor1.marca + " | Ligado?: " + monitor1.ligado);
        System.out.println("marca do Monitor: " + monitor2.marca+ " | Ligado?: " + monitor2.ligado);



    }
}

