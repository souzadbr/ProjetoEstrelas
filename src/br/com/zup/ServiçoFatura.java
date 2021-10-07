package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServiçoFatura {
    private static List<Fatura>faturas = new ArrayList<>();

    public static Fatura cadastrarFatura(String email, double valor, String dataDeVencimento) throws Exception{
        //Perconrrendo lista de consumidor
        Consumidor consumidor = ServicoConsumidor.pesquisarConsumidorPorEmail(email);

        Fatura fatura = new Fatura(consumidor, valor, dataDeVencimento);
        faturas.add(fatura);

        return fatura;
    }

    public static List<Fatura> pesquisarFaturaPeloEmailConsumidor(String email){
        //Criar uma lista
        List<Fatura>faturasDoUsuario = new ArrayList<>();

        for (Fatura faturaReferencia: faturas) {
            if(faturaReferencia.getConsumidor().getEmail().equals(email)){
              faturasDoUsuario.add(faturaReferencia);
            }
        }
        return faturasDoUsuario;
    }
}
