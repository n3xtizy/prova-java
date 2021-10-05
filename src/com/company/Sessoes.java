package com.company;

public class Sessoes {
    private int idade;
    private int sala;
    private int poltrona;
    private float preço;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }

    public String imprimir() {
        return "\nSala que passará o filme: " + sala + "\nPoltrona escolhida: " +
                poltrona + "\nPreço da entrada: " + preço;
    }
}
