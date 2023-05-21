package br.com.dio.bootcamp.dominio;

public abstract class Conteudo { // ao usar abstract no metodo a class deve ser abstract tambem
    protected static final double XP_PADRAO = 10; // acesso somente a Conteudo e filhas

    private String titulo; // boas praticas deixar privado
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    


}
