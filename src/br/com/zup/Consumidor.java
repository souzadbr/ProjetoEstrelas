package br.com.zup;

public class Consumidor {
    private String nome;
    private String email;

//essa classe srrtá apenas um molde
    public Consumidor() {

    }

    public Consumidor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome: "+ nome);
        retorno.append("Email: "+email);
        return retorno.toString();
    }
}
