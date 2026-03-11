package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Monitor;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Monitor monitor1 = new Monitor();
        monitor1.marca = "Concordia";
        monitor1.ligado = true;
        monitor1.polegadas = 27.5;

        Monitor monitor2 = new Monitor();
        monitor2.marca = "Acer";
        monitor2.ligado = true;
        monitor2.polegadas = 24.5;

        System.out.println("--- teste ---");
        System.out.println("marca do Monitor: " + monitor1.marca + " | Polegadas: " + monitor1.polegadas);
        System.out.println("marca do Monitor: " + monitor2.marca+ " | Polegadas: " + monitor2.polegadas);
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
//        Passageiro passageiro1 = new Passageiro();
//        passageiro1.nome = "Ana Silva";
//        passageiro1.saldo = 50.0;
//
//        // Criando o segundo passageiro (Objeto 2)
//        Passageiro passageiro2 = new Passageiro();
//        passageiro2.nome = "Carlos Souza";
//        passageiro2.saldo = 12.50;
//
//        // Exibindo os dados no Console
//        System.out.println("--- Sistema FiapRide ---");
//        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
//        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);

        // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
    }
}

