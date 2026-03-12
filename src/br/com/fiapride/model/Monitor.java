package br.com.fiapride.model;


 public class Monitor {
    public String marca;
    public boolean ligado;
    public double polegadas;

    public Monitor(String marca, double polegadas){
        this.marca = marca;
        this.polegadas = polegadas;
        this.ligado = false;
    }

    public void trocarMarca(String nome){
        if (nome.matches(".*[0-9].*")){
            System.out.println("Nome da marca nao pode possuir numeros");
            return;
        }
        this.marca = nome;
        System.out.println("Nome da marca atualizado para: " + this.marca);
    }

    public void apertarBotaoLigar(boolean apertou){
        if (apertou){
            this.ligado = !ligado;
            return;
        }
        if (this.ligado){
            System.out.println("O monitor agora esta ligado");
            return;
        }
        System.out.println("O monitor agora esta desligado");
    }
}