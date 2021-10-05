package com.company;

public class CategoriaFilme {
    private String genero;
    private String nacionalidade;
    private String nomeFilme;
    private Sessoes end;

    public CategoriaFilme(){
        this.end = new Sessoes();
    }

    public CategoriaFilme(String genero, String nacionalidade, String nomeFilme){
        this.genero = genero;
        this.nacionalidade = nacionalidade;
        this.nomeFilme = nomeFilme;
        this.end = new Sessoes();
    }

    public CategoriaFilme(String genero, String nacionalidade, String nomeFilme, Sessoes end){
        this.genero = genero;
        this.nacionalidade = nacionalidade;
        this.nomeFilme = nomeFilme;
        this.end = end;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public Sessoes getEnd() {
        return end;
    }

    public void setEnd(Sessoes end) {
        this.end = end;
    }

    public String imprimir(){
        return "\nGenero do filme: " + genero + "\nNacionalidade do filme: " + nacionalidade
                + "\nNome do filme: " + nomeFilme + end.imprimir();
    }
}
