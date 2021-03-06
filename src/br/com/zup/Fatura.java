package br.com.zup;

public class Fatura {
    //possui consumidor

    private Consumidor consumidor; //fatura contem um unico consumidor se fosse varios seria uma lista
    private double valor;
    private String dataDeVencimento;

    public Fatura(Consumidor consumidor, double valor, String dataDeVencimento) {
        this.consumidor = consumidor;
        this.valor = valor;
        this.dataDeVencimento = dataDeVencimento;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Consumidor: "+consumidor);
        retorno.append("Valor Fatura: R$ "+valor);
        retorno.append("Data de Vencimento: "+dataDeVencimento);
        return retorno.toString();
    }
}
